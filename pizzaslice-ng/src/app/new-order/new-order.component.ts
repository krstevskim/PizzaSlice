import { Component, OnInit } from '@angular/core';
import {Pizza} from '../models/pizza';
import {Ingredient} from '../models/ingredient';
import {FormControl} from '@angular/forms';

@Component({
  selector: 'app-order',
  templateUrl: './new-order.component.html',
  styleUrls: ['./new-order.component.css']
})
export class NewOrderComponent implements OnInit {

  constructor() { }
  ingredients: Ingredient[] = [
      {id:1, name: "Basic Ingr 1"},
      {id:2, name: "Basic Ingr 2"},
      {id:3, name: "Basic Ingr 3"},
      {id:4, name: "Basic Ingr 4"}
  ];
  ingredients2: Ingredient[] = [

      {id:5, name: "Basic Ingr 5"},
      {id:6, name: "Basic Ingr 6"},
      {id:3, name: "Basic Ingr 3"},
      {id:4, name: "Basic Ingr 4"}
  ];
  allIngredients: Ingredient[] = [

      {id:1, name: "Basic Ingr 1"},
      {id:2, name: "Basic Ingr 2"},
      {id:3, name: "Basic Ingr 3"},
      {id:4, name: "Basic Ingr 4"},
      {id:5, name: "Basic Ingr 5"},
      {id:6, name: "Basic Ingr 6"},
  ];
  filterPizzaQuery:string = "";
  selectedPizza: Pizza;
  filterIngredientsModel: number[] =[];
  filterIngredients = new FormControl([]);
  pizzas: Pizza[] = [
      {id:1, name: "Pizza1", ingredients: this.ingredients, price: 220},
      {id:2, name: "Pizza2", ingredients: this.ingredients, price: 220},
      {id:3, name: "Pizza3", ingredients: this.ingredients2, price: 220},
      {id:4, name: "Pizza4", ingredients: this.ingredients2, price: 220},
      {id:5, name: "Pizza5", ingredients: this.ingredients2, price: 220},
      {id:6, name: "Pizza6", ingredients: this.ingredients, price: 220},
      {id:7, name: "Pizza7", ingredients: this.ingredients, price: 220},
      {id:8, name: "Pizza8", ingredients: this.ingredients, price: 220},
      {id:9, name: "Pizza9", ingredients: this.ingredients, price: 220}
  ];
  ngOnInit(): void {
  }


  filterQuery() {
       return this.pizzas.filter(pizza => this.filterIngredientsModel.every(ing => pizza.ingredients.find(i => i.id == ing)));
  }
  pizzaClick(event){
    console.log(event);
  }
  onSelectedPizza(event: Pizza){
      this.selectedPizza = event;
      console.log("new selected pizza", event);
  }
}
