import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Extra } from '../models/extra';
import { Pizza } from '../models/pizza';

@Component({
    selector: 'app-extra',
    templateUrl: './extra.component.html',
    styleUrls: ['./extra.component.css']
})
export class ExtraComponent implements OnInit {

    constructor() { }

    @Input() extras: Extra[];

    @Output() selectedExtrasChange = new EventEmitter<Extra[]>();
    @Input() selectedExtras: Extra[] = [];

    ngOnInit(): void {
    }

    onClick(extra: Extra) {
        const index = this.selectedExtras.indexOf(extra);
        if (index > -1) {
            this.selectedExtras.splice(index, 1);
        }
        else {
            this.selectedExtras.push(extra);
        }
        console.log(this.selectedExtras);
        this.selectedExtrasChange.emit(this.selectedExtras);
    }

    ifContains(extra: Extra) {
        return this.selectedExtras.includes(extra);
    }
}
