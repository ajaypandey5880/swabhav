const userName : String = "ajay"
const company : String = "aurio-pro"
const age : number = 21
const isMale : boolean = true
const userLocation = 'mumbai'

const details = `employee name is ${userName}
working at ${company}
age is ${age}
and is gender male ${isMale}
residnt in ${userLocation}`
function display (data : String) {
    console.log(data);
}
display(details);
