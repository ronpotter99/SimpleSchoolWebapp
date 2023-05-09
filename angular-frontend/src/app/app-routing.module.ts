import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfessorsComponent } from './components/professors/professors.component';
import { MyClassesComponent } from './components/my-classes/my-classes.component';
import { ClassListingsComponent } from './components/class-listings/class-listings.component';


const routes: Routes = [
  {path: '', redirectTo: 'my-classes', pathMatch: 'full'},
  {path: 'my-classes', component: MyClassesComponent},
  {path: 'class-listings', component: ClassListingsComponent},
  {path: 'professors', component: ProfessorsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
