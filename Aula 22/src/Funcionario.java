public class Funcionario extends Pessoa {
    private float valorHora;
    private float horasTrab;
    private float salarioBruto;

    public void setHorasTrab(float horasTrab) throws Exception {
        if (valorHora <= 0) {
            throw new Exception("Horas trabalhadas nao podem ser menor que 0.");
        }
        this.horasTrab = horasTrab;
    }
    public void setValorHora(float valorHora) throws Exception {
        if (valorHora<=0) {
            throw new Exception("O valor da Hora nao pode ser menor que 0.");
            
        }
        this.valorHora = valorHora;
    
    }
    
    public void calcularSalario(){
        salarioBruto = valorHora * horasTrab;
    }


    public float getHorasTrab() {
        return horasTrab;
    }
    public float getSalarioBruto() {
        return salarioBruto;
    }
    public float getValorHora() {
        return valorHora;
    }


}
