import {User} from "./user";

export class Class {
  id: number;
  name: string;
  department: string;
  code: string;
  professor: User;
  enrolledStudents: Array<User>;
}
