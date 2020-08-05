import {Ingredient} from './ingredient';

export interface Pizza {
    id: number;
    name: string;
    ingredients: Ingredient[];
    price: number;
}
