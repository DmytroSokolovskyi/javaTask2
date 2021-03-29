import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {URL} from '../config'
import {ListTodoService} from "./list-todo.service";
import {IListTodo} from "../interface";


@Injectable({
  providedIn: 'root'
})
export class PostService {
  list: IListTodo[];


  constructor(private httpClient: HttpClient, private listTodoService: ListTodoService) {
  }


  seveListTodo(title: String): void {
    this.httpClient.post<string>(URL.save, title)
      .subscribe(() => {
        this.httpClient.get<IListTodo[]>(URL.main)
          .subscribe(val => this.listTodoService.listTo.next(val))

      })
  }

  getAll(): void {
    this.httpClient.get<IListTodo[]>(URL.main)
      .subscribe(val => this.listTodoService.listTo.next(val))
  }

  editList(id, title): void {
    this.httpClient.put<string>(URL.update + id, title)
      .subscribe(() => {
        this.httpClient.get<IListTodo[]>(URL.main)
          .subscribe(val => this.listTodoService.listTo.next(val))
      })
  }

  deleteList(id: number): void {
    this.httpClient.delete<number>(URL.main + id)
      .subscribe(() => {
        this.httpClient.get<IListTodo[]>(URL.main)
          .subscribe(val => this.listTodoService.listTo.next(val))
      })
  }

  search(key): void {
    this.httpClient.post<IListTodo[]>(URL.search, key)
          .subscribe(q => this.listTodoService.searchList.next(q))
     console.log(this.listTodoService.searchList.value)
      }
}
