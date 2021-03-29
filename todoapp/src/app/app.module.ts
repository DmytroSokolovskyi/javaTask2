import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { MainComponent } from './components/main/main.component';
import { TodolistComponent } from './components/todolist/todolist.component';
import {HttpClientModule} from "@angular/common/http";
import { TodoComponent } from './components/todo/todo.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { OnelistComponent } from './components/onelist/onelist.component';

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    TodolistComponent,
    TodoComponent,
    OnelistComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
