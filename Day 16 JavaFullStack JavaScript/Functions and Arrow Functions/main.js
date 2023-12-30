function arr(){
    let arr = [];
    for(let i=0; i<10; i++){
        arr.push(i);
    }
    console.log("The elements in the arr "+arr);
}

// calling the function
arr();


//parameter functions
function arr_imp(n){
    let a = [];
    for(let i=0; i<n; i++){
        a.push(i);
    }
    console.log("Parameter Functions Array: "+a);

    // for each implementation

    a.forEach((a)=>console.log("for each : "+a));
}
//calling the function
arr_imp(8);


//arrow functions

const arrimp = () => {
let l=[];
for(let i=0; i<10; i++){
l.push(i);
}
return l;
}

console.log("Arrow Functions Array: "+arrimp());



// object literals
let user={
    name: "John",
    age: 30,
    city: "New York"
};

console.log(user.name);


// array methods

// filter

let arr1 = [1,2,3,4,5,6,7,8,9,10];

let arr2 = arr1.filter((a)=>a%2==0);

console.log(arr2);

// map

let arr3 = [1,2,3,4,5,6,7,8,9,10];

let arr4 = arr3.map((a)=>a*2);

console.log(arr4);      

// reduce


let arr5 = [1,2,3,4,5,6,7,8,9,10];

let arr6 = arr5.reduce((a,b)=>a+b);

console.log(arr6);

// sort     

let arr7 = [1,2,3,4,5,6,7,8,9,10];

let arr8 = arr7.sort((a,b)=>a-b);

console.log(arr8);
 

//find

let arr9 = [1,2,3,4,5,6,7,8,9,10];

let arr10 = arr9.find((a)=>a>=6);

console.log(arr10);

