package cruddoc;

public class AutomaCrud implements State {

    State stato;

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
            } else if (e instanceof SelezionaEvent) {
                stato = new Visualizza();
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
            } else if (e instanceof AnnullaEvent) {
                stato = new Ricerca();
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
            } else if (e instanceof SelezionaEvent) {
                stato = new Visualizza();
            } else if (e instanceof ModificaEvent) {
                stato = new Modifica();
            } else if (e instanceof RimuoviEvent) {
                stato = new Rimuovi();
            } else if (e instanceof RicercaEvent) {
                stato = new Ricerca();
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
            } else if (e instanceof ConfermaEvent) {
                stato = new Ricerca();
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
            } else if (e instanceof ConfermaEvent) {
                stato = new Visualizza();
            } else {
                System.out.println("Ricevuto evento " + e + " non previsto");
            }
        }

    }
}
