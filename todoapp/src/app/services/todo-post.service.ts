import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {TodoService} from "./todo.service";
import {ITodo} from "../interface";
import {URL} from '../config'

@Injectable({
  providedIn: 'root'
})
export class TodoPostService {

  todos: ITodo[];


  constructor(private httpClient: HttpClient, private todoService: TodoService) {
  }

  saveTodo(title, body, finaldate, idList: number) {
    const todo = {title, body, finaldate}
    console.log(URL.saveTodo + idList)
    this.httpClient.post<number>(URL.saveTodo + idList, todo).subscribe(() => {
      this.httpClient.get(URL.getTodo).subscribe(value => console.log(value));
    })
  }
}
