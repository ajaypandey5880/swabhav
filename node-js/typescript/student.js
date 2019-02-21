"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(firstname, lastname, cgpa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cgpa = cgpa;
    }
    Object.defineProperty(Student.prototype, "details", {
        get: function () {
            return "name is " + this.firstname + "\n        surname is " + this.lastname + "\n        pointer is " + this.cgpa;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
/*let s1 = new Student("ajay","pandey",5.8);
console.log(s1.details);*/ 
