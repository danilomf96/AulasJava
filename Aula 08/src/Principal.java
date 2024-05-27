public class Principal {

    public static void main(String[] args) {

        Contato c1 = new Contato();

        c1.setNome("Fulano");
        c1.setTelefone("41 99999-9999");

        Contato c2 = new Contato("Beltrano", "41 98888-8888");
        Contato c3 = new Contato("Cicrano", "SN");

        // Intancia de Agenda

        Agenda agenda1 = new Agenda();

        agenda1.salvarContato(c1);
        agenda1.salvarContato(c2);
        agenda1.salvarContato(c3);

        agenda1.limparAgenda();

        agenda1.salvarContato(c1);
        agenda1.salvarContato(c1);
        
        agenda1.buscarContato("Maria");
        agenda1.buscarContato("Fulano");
        agenda1.buscarContato("Beltrano");
    }
}