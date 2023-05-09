import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ProfessorsComponent} from './components/professors/professors.component';
import {PersonService} from "./services/person.service";
import {HttpClientModule} from "@angular/common/http";
import {CommonModule} from "@angular/common";
import {ClassService} from "./services/class.service";
import { MyClassesComponent } from './components/my-classes/my-classes.component';
import { ClassListingsComponent } from './components/class-listings/class-listings.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    MyClassesComponent,
    ClassListingsComponent,
    ProfessorsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule,
    FormsModule
  ],
  providers: [PersonService, ClassService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
