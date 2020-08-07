import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Pizza} from '../models/pizza';
import {Ingredient} from '../models/ingredient';

@Component({
  selector: 'app-pizza',
  templateUrl: './pizza.component.html',
  styleUrls: ['./pizza.component.css']
})
export class PizzaComponent implements OnInit {

  constructor() { }

  @Input() pizzas: Pizza[];

  @Input() selectedPizza: Pizza;
  @Output() selectedPizzaChange = new EventEmitter<Pizza>();

  ngOnInit(): void {

  }

  onClick(event){
      this.selectedPizza = event;
      this.selectedPizzaChange.emit(event);
  }
}
