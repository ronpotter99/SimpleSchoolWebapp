import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private REST_API_BASE = '/api';

  constructor(private httpClient: HttpClient) { }

  public getProfessors() {
    return this.httpClient.get(this.REST_API_BASE + '/user/teaches')
  }
}
