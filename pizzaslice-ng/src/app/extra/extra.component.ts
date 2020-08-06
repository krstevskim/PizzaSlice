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

    @Output() selectedExtras = new EventEmitter<Extra[]>();
    selectedExtrasArray: Extra[] = [];

    ngOnInit(): void {
    }

    onClick(extra: Extra) {
        const index = this.selectedExtrasArray.indexOf(extra);
        if (index > -1) {
            this.selectedExtrasArray.splice(index, 1);
        }
        else {
            this.selectedExtrasArray.push(extra);
        }
        console.log(this.selectedExtrasArray);
        this.selectedExtras.emit(this.selectedExtrasArray);
    }

    ifContains(extra: Extra) {
        return this.selectedExtrasArray.includes(extra);
    }
}
