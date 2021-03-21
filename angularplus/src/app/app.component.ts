import {Component, Input} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ICarModel} from './interface/ICar.model';
import {OnInit} from '@angular/core';
import {environment} from 'src/environments/environment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  car = {model: '', year: 0};
  
  cars: ICarModel [];

  carWithId: ICarModel;


  constructor(private http: HttpClient) {
  }


  save(myForm: any): void {
    console.log(this.car);
    this.http.post<any>(environment.MYAPI + 'save', this.car)
      .subscribe(value => console.log(value));
  }

  getById(id): void {
    this.http.get<ICarModel>(environment.MYAPI + id)
      .subscribe(value => this.carWithId = value);
  }

  dellById(id): void {
    this.http.delete<any>(environment.MYAPI + id)
      .subscribe(value => console.log(value));
  }

  ngOnInit(): void {
    this.http.get<ICarModel[]>(environment.MYAPI)
      .subscribe(value => this.cars = value);
  }

}
