import {Component, OnInit} from '@angular/core';
import {User} from "../models/user";
import {UserService} from "./user.service";
import {ClassService} from "./class.service";
import {Class} from "../models/class";

@Component({
  selector: 'app-professors',
  templateUrl: './professors.component.html',
  styleUrls: ['./professors.component.css']
})
export class ProfessorsComponent implements OnInit {

  professors: Array<User> = [];
  selectedProfessorClasses: Array<Class> = [];

  constructor(private userService: UserService, private classService: ClassService) {
  }

  ngOnInit() {
    this.userService.getProfessors().subscribe((data: User[]) => {
      console.log(data);
      this.professors = data;
    })
  }

  selectClasses(professorId: number) {
    this.classService.getProfessorsClasses(professorId).subscribe((data: Class[]) => {
      this.selectedProfessorClasses = data;
    })
  }
}
