import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {PostService} from "../../services/post.service";
import {ListTodoService} from "../../services/list-todo.service";
import {IListTodo} from "../../interface";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  myForm = new FormGroup({title: new FormControl(''),});
  searchForm = new FormGroup({key: new FormControl(''),});
  searchList: IListTodo;

  constructor(private postService: PostService, private listTodoService: ListTodoService) {
    this.listTodoService.searchList.subscribe(value => this.searchList = value);
  }

  save():void {
    console.log(this.myForm.value.title)
    this.postService.seveListTodo(this.myForm.value.title);
  }
  search():void{
    this.postService.search(this.searchForm.value.key);
    console.log(this.searchList)
  }


  ngOnInit(): void {
  }


}
