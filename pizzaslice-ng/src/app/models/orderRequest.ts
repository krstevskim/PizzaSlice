import { Pizza } from './pizza';
import { Extra } from './extra';

export interface OrderRequest {
    pizzas: Pizza;
    extras: Extra[];
}
