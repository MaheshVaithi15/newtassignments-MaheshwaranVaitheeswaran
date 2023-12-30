let words = "Good Boy"


//if and ifelse statements
if(words.length==0){
    return
}

if(words == "Good Boy"){
    console.log("Pravin Smiles");
}
else if(words == "Good Man"){
    console.log("Pravin Again Smiles");
}
else{
    console.log("Pravin Into Sad");
}

//for loop 

for(let i=0; i<10;i++){
    console.log(words);
}

//while loop

while(words == "Good"){
    console.log(words);
    words = words.slice(1);
}