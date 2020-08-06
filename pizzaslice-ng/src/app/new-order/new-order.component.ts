import { Component, OnInit } from '@angular/core';
import {Pizza} from '../models/pizza';
import {Ingredient} from '../models/ingredient';
import {FormControl} from '@angular/forms';
import { Extra } from '../models/extra';
import { OrderRequest } from '../models/orderRequest';

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
    extras: Extra[] = [
        {id:1, name:"Extra1", price: 120},
        {id:2, name:"Extra2", price: 150},
        {id:3, name:"Extra3", price: 130},
        {id:4, name:"Extra4", price: 220},
        {id:5, name:"Extra5", price: 520},
    ]
    selectedExtras: Extra[] = [];

    orders: OrderRequest[] = [];
  ngOnInit(): void {
  }


  filterQuery() {
       return this.pizzas.filter(pizza => this.filterIngredientsModel.every(ing => pizza.ingredients.find(i => i.id == ing)));
  }

  onSelectedPizza(event: Pizza){
      this.selectedPizza = event;
      console.log("new selected pizza", event);
  }
  onSelectedExtras(event: Extra[]) {
        this.selectedExtras = event;
  }

  concatExtras(extras: Extra[]){
      return extras.join(",");
  }
  calculatePriceOfOrder(order: OrderRequest) {
        let price = 0;
        price +=order.pizzas.price;
        order.extras.map(extra => {
            price += extra.price;
        })
      return price;
  }

    removeOrder(order: OrderRequest) {
      const index = this.orders.indexOf(order);
        if (index > -1) {
            this.orders.splice(index, 1);
        }
    }

    addOrder() {

      console.log(this.selectedPizza);
      console.log(this.selectedExtras);
        if(this.selectedPizza != null){
            let newOrder = {pizzas: this.selectedPizza, extras: this.selectedExtras};
            this.orders.push(newOrder);
        }
        this.selectedPizza = null;
        this.selectedExtras = [];
    }
    editOrder(order: OrderRequest) {
        this.selectedPizza = order.pizzas;
    }
}
