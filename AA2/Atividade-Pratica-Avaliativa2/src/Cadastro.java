import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List<Imovel> listaImovel = new ArrayList<>();

    public static void cadastrar(Imovel imovel) {
        listaImovel.add(imovel);
    }

    public static List<Imovel> getListaImovel() {
        return listaImovel;
    }

    public static void setListaImovel(List<Imovel> listaImovel) {
        Cadastro.listaImovel = listaImovel;
    }

    public static Imovel buscar(int id) {
        for (Imovel imovel : listaImovel) {
            if (imovel.getId() == id) {
                return imovel;
            }
        }
        return null;
    }

    public static void excluir(Imovel imovel) {
        listaImovel.remove(imovel);
    }
}
