import { BrowserModule } from '@angular/platform-browser';

import { WelcomeComponent } from './welcome.component';
import { StudentComponent} from '../student/student.component'

import { NgModule } from '@angular/core';

@NgModule({
  declarations: [
    WelcomeComponent,
    StudentComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent]
})
export class WelcomeModule { }
