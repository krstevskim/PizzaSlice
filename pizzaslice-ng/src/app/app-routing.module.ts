import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {NewOrderComponent} from "./new-order/new-order.component";
import {OrderComponent} from "./order/order.component";
import {OrdersComponent} from "./orders/orders.component";
import {LoginComponent} from "./login/login.component";

const routes: Routes = [
    {path: '', pathMatch: 'full', redirectTo: 'home'},
    {path: 'home', component: HomeComponent},
    {path: 'order', component: NewOrderComponent},
    {path: 'order/:id', component: OrderComponent},
    {path: 'orders', component: OrdersComponent},
    {path: 'login', component: LoginComponent},
    {path: '**', redirectTo: 'home'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
