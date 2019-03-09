import { IStudent } from './Istudent';
import { Component } from '@angular/core';

@Component({
  selector: 'sw-student',
  templateUrl: './student.component.html'
})
export class StudentComponent {
  private student : IStudent ;
  private message : String = "Their is a message from YOU KNOW WHO";
  private imgUrl : String = "../../assets/voldemort.jpg";
  private width : number = 300;
  private height : number = 400;
  private courses : [];
  constructor(){
    this.student = {
      cgpa : 7.5,
      name : 'ajay',
      Role : 'Java Script Developer',
      company : 'aurion pro'
    }
  }
  public get bgcolor (){
    if(this.student.cgpa<7){
      return  "red";
    }else{
      return  "green";
    }
    return 0;
  }

  public handleClick(){
    this.courses = ["Java","Python","JavaScript"];
  }
}
