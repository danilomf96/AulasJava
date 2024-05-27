import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class GerenciadorRelogio {
    private static ArrayList<Relogio> listaRelogios = new ArrayList<>();
    private static final String ARQUIVO = "relogios.txt";

    public static void salvarRelogio(Relogio relogio) throws IOException {
        try (FileWriter fWriter = new FileWriter(ARQUIVO, true);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {
            bWriter.write(relogio.toString() + "\n");
            lerArquivo();
        }
    }

    public static void lerArquivo() throws IOException {
        listaRelogios.clear();
        try (FileReader fileReader = new FileReader(ARQUIVO); BufferedReader bReader = new BufferedReader(fileReader)) {
            String linha;
            while ((linha = bReader.readLine()) != null) {
                Relogio tempRelogio = new Relogio();
                tempRelogio.fromString(linha);
                listaRelogios.add(tempRelogio);
            }
        }
    }

    public static void verificarListaVazia() throws Exception {
        if (listaRelogios.isEmpty()) {
            throw new Exception("\nNão há relogios cadastrados");
        }
    }

    public static Relogio buscarRelogio(int codigo) throws Exception {
        verificarListaVazia();
        for (Relogio tempRelogio : listaRelogios) {
            if (tempRelogio.getCodigo() == codigo) {
                return tempRelogio;
            }
        }
        throw new Exception("Relogio com o codigo " + codigo + " não encontrado");

    }

    private static void atualizarArquivo() throws IOException {
        try (FileWriter fileWriter = new FileWriter(ARQUIVO);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Relogio tempRelogio : listaRelogios) {
                bufferedWriter.write(tempRelogio.toString());
            }
        }
    }

    public static void apagarRelogio(int codigo) throws Exception {
        verificarListaVazia();
        boolean encontrado = false;
        for (Relogio tempRelogio : listaRelogios) {
            if (tempRelogio.getCodigo() == codigo) {
                listaRelogios.remove(tempRelogio);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new Exception("Relogio com o codigo " + codigo + " não encontrado");
        }
        atualizarArquivo();
    }

    public static void atualizarRelogio(Relogio relogio) throws Exception {
        verificarListaVazia();
        for (Relogio tempRelogio : listaRelogios) {
            if (tempRelogio.getCodigo() == relogio.getCodigo()) {
                tempRelogio = relogio;
            }
        }
        atualizarArquivo();
    }

    public static void apagarTodos() throws IOException, Exception {
        verificarListaVazia();
        try (FileWriter fileWriter = new FileWriter(ARQUIVO);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("");
        }
    }

    public static ArrayList<Relogio> getListaRelogios() throws Exception {
        verificarListaVazia();
        return listaRelogios;
    }
}
