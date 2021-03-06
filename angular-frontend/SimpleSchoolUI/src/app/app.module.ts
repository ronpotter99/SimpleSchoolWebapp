import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ProfessorsComponent} from './professors/professors.component';
import {UserService} from "./professors/user.service";
import {HttpClientModule} from "@angular/common/http";
import {CommonModule} from "@angular/common";
import {ClassService} from "./professors/class.service";

@NgModule({
  declarations: [
    AppComponent,
    ProfessorsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule
  ],
  providers: [UserService, ClassService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
