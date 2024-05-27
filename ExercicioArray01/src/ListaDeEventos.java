import java.util.ArrayList;
import java.util.List;

public class ListaDeEventos {

    private static List<Evento> listaEventos = new ArrayList<>();

    public static void AdicionarEvento(Evento evento) {
        listaEventos.add(evento);
        System.out.println("Evento " + evento.getNome() + " foi adicionado na lista.");
    }

    public static void mostrarEventos() {
        for (Evento evento : listaEventos) {
            System.out.println("\n---Eventos Agendados---");
            if (listaEventos.size() == 0) {
                System.out.println("\nA sua agenda de eventos esta vazia.");
                return;
            }
            System.out.println("\nEvento : " + evento.getNome());
            System.out.println("Local : " + evento.getLocal());
            System.out.println("Data : " + evento.getData());
        }
    }

    public static void excluirEventos(String nome) {
        for (Evento evento : listaEventos) {
            if (evento.getNome().equals(nome)) {
                listaEventos.remove(evento);
                System.out.println("\nEvento : " + evento.getNome() + " no Local "
                        + evento.getLocal() + " . Data ---> " + evento.getData() + " Foi excluido da Lista");
                return;
            }
            System.out.println("\nNenhum evento encontrado com esse nome.");
        }
    }
}
