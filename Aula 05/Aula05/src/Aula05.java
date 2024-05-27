public class Aula05 {
    public static void main(String[] args) {
        // ExAula04.ex05();
        // ExAula04.ex06();

        // declaração de novo objeto aluno
        Aluno aluno = new Aluno();
        // armazenar dados no aluno
        aluno.nome = "Danilo";
        aluno.curso = "ADS";
        aluno.turno = "manhã";
        aluno.campus = "osório";
        System.out.println("Dados do Aluno : ");
        System.out.println("Nome " + aluno.nome);
        System.out.println("Curso " + aluno.curso);
        System.out.println("Turno " + aluno.turno);
        System.out.println("Campus " + aluno.campus);

        Aluno aluno2 = new Aluno();
        System.out.println("Cadastro do segundo aluno:");
        System.out.print("\nDigite o Nome do Aluno");
        aluno2.nome = Console.readString();
        System.out.print("\nDigite seu Curso : ");
        aluno2.curso = Console.readString();
        System.out.print("\nDigite o Turno : ");
        aluno2.turno = Console.readString();
        System.out.print("\nDigite o Campus : ");
        aluno2.campus = Console.readString();

        // Funçao toString existente do java para ajudar no codigo, configurar dentro do
        // objeto
        System.out.println("Dados do aluno 2:");
        System.out.println(aluno2.toString());

        // instanciando aluno a3

        Aluno a3 = new Aluno("Fulano", "Ads", "Noite", "osorio");
        System.out.println("Dados do Aluno 3");
        System.out.println(a3.toString());

    }
}
