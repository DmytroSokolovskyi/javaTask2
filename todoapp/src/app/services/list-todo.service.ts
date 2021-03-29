import { Injectable } from '@angular/core';
import {BehaviorSubject} from "rxjs";
import {IListTodo} from "../interface";

@Injectable({
  providedIn: 'root'
})


export class ListTodoService {

  listTo = new BehaviorSubject<IListTodo[]>(null);
  editList = new BehaviorSubject<number>(0);
  searchList: any = new BehaviorSubject<any>('')
  constructor() { }
}
