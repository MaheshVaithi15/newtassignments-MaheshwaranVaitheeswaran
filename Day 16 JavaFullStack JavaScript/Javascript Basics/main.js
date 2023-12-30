let x = "Parvin is the Fan Of Actor Anna Vijay."

console.log("The Original String was "+x);

// String Replace

let rpl_x=x.replace("Vijay","Gay");
console.log(rpl_x);

//string replaceall

let rpl_all_x=x.replace(/Vijay/g,"Gay");
console.log(rpl_all_x);

//string split

let splt_x=x.split(" ");
console.log(splt_x);

//string substring

let sub_x=x.substring(0,10);
console.log(sub_x);

//string indexOf

let ind_x=x.indexOf("Vijay");
console.log(ind_x); 


// array implementation


    let n=6;
    let arr=[];
    for(let i=0;i<n;i++){
        arr.push(i);
    }
    console.log(arr);


    // comparison and boolean implementation

    let gg = true;
    let ff = false;

    console.log("AND: "+gg && ff);
    console.log("OR: "+gg || ff);

    //type cast implementation

    let no = '30';

    console.log(no==30);
    console.log(no ===30);

    //typeconversion

    let num = Number(no);

    console.log("Number: "+num);

