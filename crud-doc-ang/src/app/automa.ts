import { StaticSymbol } from "@angular/compiler";
import { AddEvent, State } from "./state";

export class AutomaCrud implements State {

    stato: State;

    next(e: Event) {
        this.stato.next(e);
    }
}

export class Ricerca implements State {
    next(e: Event, a: AutomaCrud) {
        if (e instanceof AddEvent) {
            a.stato = new Aggiungi();
        }
    }
}

export class Aggiungi implements State {
    next(e: Event) {
        if (e instanceof AddEvent) {

        }
    }
}