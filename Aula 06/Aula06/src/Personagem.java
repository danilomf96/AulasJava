public class Personagem {

    // Atributos
    String nome;
    String classe;
    int atk;
    int def;

    // Construtores
    public Personagem() {
    }

    public Personagem(String nome, String classe, int atk, int def) {
        // "this." faz referência ao atributo.
        // É importante para que o programa consiga diferenciar variável de
        // atributo.
        this.nome = nome;
        this.classe = classe;
        this.atk = atk;
        this.def = def;
    }

    // Métodos próprios
    public void copiarPersonagem(Personagem p) {
        this.nome = p.nome;
        this.classe = p.classe;
        this.atk = p.atk;
        this.def = p.def;
    }

    public void mostrarPersonagem() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Ataque: " + this.atk);
        System.out.println("Defesa: " + this.def);
    }

    public void apresentar() {
        System.out.println("Meu nome é " + nome);
    }

    public void personagemAleatorio() {
        String[] nomes = { "Glenn", "Glork", "Benn", "Jeff", "Hunrgh", "Feilow" };
        String[] classes = { "Mago", "Bruxo", "Barbaro", "Bardo", "Destruidor" };
        this.nome = nomes[(int) (Math.random() * nomes.length)];
        this.classe = classes[(int) (Math.random() * classes.length)];
        this.atk = (int) (Math.random() * 100) + 1;
        this.def = (int) (Math.random() * 100) + 1;
    }

    public void compararPersonagem(Personagem p) {
        if (this.atk > p.atk && this.def > p.def) {
            System.out.println(this.nome + " è mais poderoso em ataque e defesa que " + p.nome);
        } else if (this.atk > p.atk && this.def < p.def) {
            System.out.println(this.nome + " possui mais poder de ataque, mas sua defesa é mais fragil");
        } else if (this.atk < p.atk && this.def > p.def) {
            System.out.println(this.nome + "possui apenas mais defesa que ser adversario " + p.nome);
        } else {
            System.out.println(this.nome + " é mais fraco que " + p.nome);
        }

    }

}
