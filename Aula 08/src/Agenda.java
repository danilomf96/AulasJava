public class Agenda {
    private Contato[] agenda;
    private int pos;

    public Agenda() {
        agenda = new Contato[3];
        pos = 0;
    }

    public void salvarContato(Contato contato) {

        if (pos >= agenda.length) {
            System.out.println("Agenda está cheia");
            return;
        }
        agenda[pos] = new Contato();
        agenda[pos] = contato;
        pos++;
        System.out.println("Contato " +  contato.getNome() + "(" + contato.getTelefone() + ") foi salvo na sua agenda!");
    }

    public void limparAgenda(){
        for (int i = 0; i < agenda.length; i++) {
            agenda[i] = new Contato();
            pos = 0;
            System.out.println("\nAgenda limpa com sucesso!");
        }
    }

    public void buscarContato(String nome){
        boolean encontrou = false;
        for (int i = 0; i < pos; i++) {
            if(agenda[i].getNome().equals(nome)){
                System.out.println("\nContato localizado:");
                System.out.println(agenda[i].toString());
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("\nContato " + nome + " não foi encontrado...");
        }
    }
}
