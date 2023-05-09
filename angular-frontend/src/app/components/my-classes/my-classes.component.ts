import { Component, OnInit } from '@angular/core';
import { PersonService } from 'src/app/services/person.service';
import { ClassService } from 'src/app/services/class.service';
import { Person } from 'src/app/models/person';
import { Class } from 'src/app/models/class';

@Component({
  selector: 'app-my-classes',
  templateUrl: './my-classes.component.html',
  styleUrls: ['./my-classes.component.css']
})
export class MyClassesComponent implements OnInit {

  people: Array<Person> = [];
  selectedPerson: Person = null;
  selectedPersonClasses: Array<Class> = [];

  constructor(private personService: PersonService, private classService: ClassService) {
  }

  ngOnInit() {
    this.personService.getAllPeople().subscribe((data: Person[]) => {
      this.people = data;
    })
  }

  selectNewPerson() {
    if(!this.selectedPerson) {
      this.selectedPersonClasses = []
    } else {
      this.classService.getClassesPersonTakes(this.selectedPerson.id).subscribe((data: Class[]) => {
        this.selectedPersonClasses = data;
      })
    }
  }
}
