import { BrowserModule } from '@angular/platform-browser';

import { WelcomeComponent } from './welcome.component';

import { NgModule } from '@angular/core';

@NgModule({
  declarations: [
    WelcomeComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent]
})
export class WelcomeModule { }
