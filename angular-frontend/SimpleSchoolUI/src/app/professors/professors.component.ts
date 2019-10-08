import {Component, OnInit} from '@angular/core';
import {User} from "../models/user";
import {UserService} from "./user.service";

@Component({
  selector: 'app-professors',
  templateUrl: './professors.component.html',
  styleUrls: ['./professors.component.css']
})
export class ProfessorsComponent implements OnInit {

  professors: Array<User> = [];

  constructor(private userService: UserService) {
  }

  ngOnInit() {
    this.userService.getProfessors().subscribe((data: User[]) => {
      console.log(data);
      this.professors = data;
    })
  }
}
