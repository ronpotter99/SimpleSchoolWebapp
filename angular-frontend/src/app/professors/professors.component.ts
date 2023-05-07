import {Component, OnInit} from '@angular/core';
import {Person} from "../models/person";
import {PersonService} from "./person.service";
import {ClassService} from "./class.service";
import {Class} from "../models/class";

@Component({
  selector: 'app-professors',
  templateUrl: './professors.component.html',
  styleUrls: ['./professors.component.css']
})
export class ProfessorsComponent implements OnInit {

  professors: Array<Person> = [];
  selectedProfessorClasses: Array<Class> = [];

  constructor(private personService: PersonService, private classService: ClassService) {
  }

  ngOnInit() {
    this.personService.getProfessors().subscribe((data: Person[]) => {
      this.professors = data;
    })
  }

  selectClasses(professorId: number) {
    this.classService.getProfessorsClasses(professorId).subscribe((data: Class[]) => {
      this.selectedProfessorClasses = data;
    })
  }
}
