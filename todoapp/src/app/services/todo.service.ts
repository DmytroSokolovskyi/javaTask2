import { Injectable } from '@angular/core';
import {ITodo} from "../interface";
import {BehaviorSubject} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  todos = new BehaviorSubject<ITodo[]>(null);

  constructor() { }
}
