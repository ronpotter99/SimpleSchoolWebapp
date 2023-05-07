import {Person} from "./person";

export class Class {
  id: number;
  name: string;
  department: string;
  code: string;
  professor: Person;
  enrolledStudents: Array<Person>;
}
