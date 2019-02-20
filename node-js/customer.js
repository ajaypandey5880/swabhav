class Customer {
    constructor(firstname,lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    get fullName(){
        return this.firstname+" "+this.lastname;
    }
}
let c1 = new Customer("ajay","pandey");
console.log(c1.fullName);
console.log(c1);
console.log(c1.__proto__ == Customer.prototype);
module.exports = Customer;