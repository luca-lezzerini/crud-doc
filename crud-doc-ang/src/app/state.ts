import { AutomaCrud } from "./automa";

export interface State {
    next(e: Event, a?:AutomaCrud);
}

export interface Event {
}

export class AddEvent implements Event{}