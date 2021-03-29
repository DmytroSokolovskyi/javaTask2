import {ITodo} from "./itodo";

export interface IListTodo {
  id: number;
  title: string;
  cretedAt: string;
  updatedAt: string;
  todos: ITodo [];
}
