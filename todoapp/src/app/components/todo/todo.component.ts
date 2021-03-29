import {Component, Input, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {TodoPostService} from "../../services/todo-post.service";

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  @Input()
  idList: number;

  createTodo = new FormGroup({
    title: new FormControl(''),
    body: new FormControl(''),
    finaldate: new FormControl(''),
  });


  constructor(private todoService: TodoPostService) {
  }

  ngOnInit(): void {
  }

  saveTodo() {
    console.log("seve todo")
    this.todoService.saveTodo(this.createTodo.value.title,
      this.createTodo.value.body,
      this.createTodo.value.finaldate,
      this.idList)
  }
}
