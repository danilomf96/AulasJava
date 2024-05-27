public class Aluno {
    // Atributos do Aluno
    String nome;
    String curso;
    String turno;
    String campus;

    //construtores
    public Aluno(){
    }

    public Aluno(String nome, String curso, String turno, String campus){
        this.nome = nome;
        this.turno = turno;
        this.campus = campus;
        this.curso = curso;
    }

    @Override
    public String toString() {
        String txt = "Nome: " + nome + "\n"
                + "Curso :" + curso + "\n"
                + "Turno: " + turno + "\n"
                + "Campus: " + campus;
        return txt;
    }
}
