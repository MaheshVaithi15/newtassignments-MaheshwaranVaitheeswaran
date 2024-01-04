import pandas as pd 
import glob
from fpdf import FPDF
from pathlib import Path



fpaths = glob.glob("invoices/*.xlsx")


for f in fpaths:
    
    pdf = FPDF(orientation='P',unit='mm',format='A4')
    pdf.add_page()
    fname = Path(f).stem
    invoiceno,date = fname.split("-")
    pdf.set_font(family='Times',size=16,style='B')
    pdf.cell(w=50,h=8,txt=f"Invoice Number: {invoiceno}",ln=1)

    pdf.set_font(family='Times',size=16,style='B')
    pdf.cell(w=50,h=8,txt=f"Date: {date}",ln=2)

    

    df = pd.read_excel(f,sheet_name='Sheet 1')

    cols = list(df.columns)
    pdf.set_font(family='Times',style='B',size=8)
    pdf.set_text_color(80,80,80)
    pdf.cell(w=30,h=8,txt=cols[0],border=1)
    pdf.cell(w=70,h=8,txt=cols[1],border=1)
    pdf.cell(w=30,h=8,txt=cols[2],border=1)
    pdf.cell(w=30,h=8,txt=cols[3],border=1)
    pdf.cell(w=30,h=8,txt=cols[4],border=1,ln=1)

    
    for index,row in df.iterrows():
        pdf.set_font(family='Times',style='B',size=8)
        pdf.set_text_color(80,80,80)
        pdf.cell(w=30,h=8,txt=str(row['product_id']),border=1)
        pdf.cell(w=70,h=8,txt=str(row['product_name']),border=1)
        pdf.cell(w=30,h=8,txt=str(row['amount_purchased']),border=1)
        pdf.cell(w=30,h=8,txt=str(row['price_per_unit']),border=1)
        pdf.cell(w=30,h=8,txt=str(row['total_price']),border=1,ln=1)
    
    total_sum = df['total_price'].sum()
    pdf.set_font(family='Times',style='B',size=8)
    pdf.set_text_color(80,80,80)
    pdf.cell(w=30,h=8,txt="",border=1)
    pdf.cell(w=70,h=8,txt="",border=1)
    pdf.cell(w=30,h=8,txt="",border=1)
    pdf.cell(w=30,h=8,txt="",border=1)
    pdf.cell(w=30,h=8,txt=str(total_sum),border=1,ln=1)

    pdf.set_font(family='Times',style='B',size=14)
    pdf.cell(w=30,h=8,txt=f"The Total Sum: {total_sum}",border=1)

    pdf.set_font(family='Times',style='B',size=10)
    pdf.cell(w=30,h=8,txt=f"PythonHow.Org",border=1)
    pdf.image('pythonhow.png',w=10)

    pdf.output(f"PDFs/PDF-{fname}.pdf")


