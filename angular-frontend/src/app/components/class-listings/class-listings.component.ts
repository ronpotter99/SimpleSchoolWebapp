import { Component, OnInit } from '@angular/core';
import { Class } from 'src/app/models/class';
import { ClassService } from 'src/app/services/class.service';

@Component({
  selector: 'app-class-listings',
  templateUrl: './class-listings.component.html',
  styleUrls: ['./class-listings.component.css']
})
export class ClassListingsComponent implements OnInit {

  classes: Array<Class> = [];

  constructor(private classService: ClassService) {
  }

  ngOnInit() {
    this.classService.getAllClasses().subscribe((data: Class[]) => {
      this.classes = data;
    })
  }

}
