import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ClassService {

  private REST_API_BASE = '/api';

  constructor(private httpClient: HttpClient) { }

  public getProfessorsClasses(professorId: number) {
    return this.httpClient.get(this.REST_API_BASE + '/person/' + professorId + '/teaches')
  }
}
