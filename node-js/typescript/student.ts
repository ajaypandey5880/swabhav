export class Student{
    constructor(private firstname,private lastname,private cgpa){

    }
    get details(){
        return `name is ${this.firstname}
        surname is ${this.lastname}
        pointer is ${this.cgpa}`
    }
}
/*let s1 = new Student("ajay","pandey",5.8);
console.log(s1.details);*/