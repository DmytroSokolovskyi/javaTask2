import {Component, Input, OnInit} from '@angular/core';
import {IListTodo} from "../../interface";
import {ListTodoService} from "../../services/list-todo.service";
import {FormControl, FormGroup} from "@angular/forms";
import {PostService} from "../../services/post.service";

@Component({
  selector: 'app-onelist',
  templateUrl: './onelist.component.html',
  styleUrls: ['./onelist.component.css']
})
export class OnelistComponent implements OnInit {

  @Input()
  oneList: IListTodo;

  editListId: number;


  editForm = new FormGroup({title: new FormControl(''),})

  constructor(private listTodoService:ListTodoService, private postService :PostService) {
    this.listTodoService.editList.subscribe(i => this.editListId = i )
  }

  ngOnInit(): void {
  }

  editList(id: number): void {
    this.listTodoService.editList.next(id)
  }

  getEditList(id: number) {
    this.postService.editList(id, this.editForm.value.title)
    console.log("qqqqq")
    this.listTodoService.editList.next(0);
  }

  deleteList(id: number) {
    this.postService.deleteList(id);
  }
}
