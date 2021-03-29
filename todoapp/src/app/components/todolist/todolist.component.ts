import {Component, OnInit} from '@angular/core';
import {ListTodoService} from "../../services/list-todo.service";
import {PostService} from "../../services/post.service";
import {IListTodo} from "../../interface";

@Component({
  selector: 'app-todolist',
  templateUrl: './todolist.component.html',
  styleUrls: ['./todolist.component.css']
})
export class TodolistComponent implements OnInit {

  listTodo: IListTodo [];


  constructor(private listTodoService: ListTodoService, private postService: PostService) {
    this.listTodoService.listTo.subscribe(res => this.listTodo = res)
  }

  ngOnInit(): void {
    this.postService.getAll()
  }

}
