public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("José", "jose@hotmail.com");
        System.out.println(p1.toString());

        Aluno a1 = new Aluno("jose junior", "junior@hotmail.com", "5560594185");

        System.out.println(a1.toString());

        Professor pf = new Professor("Jason", "jasobreiro@up.edu.br", "996655");
        System.out.println(pf.toString());

        Bolsista b = new Bolsista("Carlos", "carlos@hotmail.com", "5560584120", "Parcial");
        System.out.println(b.toString());
    }
}
