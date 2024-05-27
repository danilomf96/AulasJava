public class Principal {
    public static void main(String[] args) {
        Professor professor = new Professor("Jason", "jasobreiro@up.edu.com.br", "Java");
        Aluno a1 = new Aluno("fulano", "fulano@gmail.com", 2, "Manha");

        System.out.println(professor.falar());
        System.out.println(a1.falar());

        Concurseiro c1 = new Concurseiro();
        System.out.println(c1.estudar());
    }
}
