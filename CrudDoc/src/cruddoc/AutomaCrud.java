package cruddoc;

public class AutomaCrud implements State {

    State stato;
    Crudabile ui;

    public AutomaCrud(Crudabile ui) {
        this.ui = ui;
        stato = new Ricerca();
        ui.entraRicerca();
    }

    @Override
    public void next(Event e) {
        System.out.println("Entrato nello stato " + stato);
        System.out.println("Ricevuto evento " + e);
        stato.next(e);
        System.out.println("Finito nello stato " + stato);
    }

    private class Ricerca implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {
                stato = new Aggiungi();
                ui.entraAggiungi();
            } else if (e instanceof SelezionaEvent) {
                stato = new Visualizza();
                ui.entraVisualizza();
            } else if (e instanceof RicercaEvent) {
            } else {
                System.out.println("Ricevuto evento " + e + " non previsto");
            }
        }

    }

    private class Aggiungi implements State {

        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                stato = new Visualizza();
                ui.entraVisualizza();
            } else if (e instanceof AnnullaEvent) {
                stato = new Ricerca();
                ui.entraRicerca();
            } else {
                System.out.println("Ricevuto evento " + e + " non previsto");
            }
        }

    }

    private class Visualizza implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {
                stato = new Aggiungi();
                ui.entraAggiungi();
            } else if (e instanceof SelezionaEvent) {
                stato = new Visualizza();
                ui.entraVisualizza();
            } else if (e instanceof ModificaEvent) {
                stato = new Modifica();
                ui.entraModifica();
            } else if (e instanceof RimuoviEvent) {
                stato = new Rimuovi();
                ui.entraRimuovi();
            } else if (e instanceof RicercaEvent) {
                stato = new Ricerca();
                ui.entraRicerca();
            } else {
                System.out.println("Ricevuto evento " + e + " non previsto");
            }
        }
    }

    private class Rimuovi implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AnnullaEvent) {
                stato = new Visualizza();
                ui.entraVisualizza();
            } else if (e instanceof ConfermaEvent) {
                stato = new Ricerca();
                ui.entraRicerca();
            } else {
                System.out.println("Ricevuto evento " + e + " non previsto");
            }
        }

    }

    private class Modifica implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AnnullaEvent) {
                stato = new Visualizza();
                ui.entraVisualizza();
            } else if (e instanceof ConfermaEvent) {
                stato = new Visualizza();
                ui.entraVisualizza();
            } else {
                System.out.println("Ricevuto evento " + e + " non previsto");
            }
        }

    }
}
