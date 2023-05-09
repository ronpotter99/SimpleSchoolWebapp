import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ClassService {

  private REST_API_BASE = '/api';

  constructor(private httpClient: HttpClient) { }

  public getAllClasses() {
    return this.httpClient.get(this.REST_API_BASE + '/class/all')
  }

  public getClass(classId: number) {
    return this.httpClient.get(this.REST_API_BASE + '/class/' + classId)
  }

  public getClassesPersonTeaches(professorId: number) {
    return this.httpClient.get(this.REST_API_BASE + '/class/taughtBy/' + professorId)
  }

  public getClassesPersonTakes(studentId: number) {
    return this.httpClient.get(this.REST_API_BASE + '/class/enrolledIn/' + studentId)
  }
}
