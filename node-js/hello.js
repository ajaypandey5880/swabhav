console.log('hello Inside node');
let foo = "hello fooo";
console.log(foo);
console.log(this);

//console.log(global);
console.log(this == global);
setTimeout(()=>{
    console.log("after two second" +foo);
},2000)
console.log(global.env.NUMBER_OF_PROCESSORS);