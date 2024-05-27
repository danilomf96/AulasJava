public class Folha {
    public void EntradaDados(Func funcionario) {
        System.out.println("Nome do Funcionario : ");
        funcionario.setNome(Console.readString());
        System.out.println("Digite o valor da hora: ");
        funcionario.setValorH(Console.readFloat());
        System.out.println("Digite o numero de horas trabalhadas: ");
        funcionario.setHorasT(Console.readInt());
    }

    public void calcularBruto(Func funcionario) {
        float bruto = funcionario.getHorasT() * funcionario.getValorH();
        funcionario.setBrut(bruto);
        System.out.println("Salario Bruto : " + bruto);
    }

    public void IR(Func funcionario) {
        float bruto = funcionario.getBrut();
        float ir = calcularIR(bruto);
        System.out.println("Imposto de renda :" + ir);
        funcionario.setLiq(bruto - ir);
    }

    public void INSS(Func funcionario) {
        float bruto = funcionario.getBrut();
        float inss = calcularINSS(bruto);
        System.out.println("INSS : " + inss);
        funcionario.setLiq(funcionario.getLiq() - inss);
    }

    private float calcularIR(float bruto) {
        if (bruto <= 1372.82) {
            return 0;
        } else if (bruto <= 2743.25) {
            return (bruto * (15 / 100)) - 205.92f;
        } else if (bruto > 2743.25) {
            return (bruto * (0.275f)) - 548.82f;
        }
        return 0;
    }

    private float calcularINSS(float bruto) {
        if (bruto <= 868.29) {
            return bruto * (8 / 100);
        } else if (bruto <= 1447.14) {
            return bruto * (9 / 100);
        } else if (bruto <= 2894.27) {
            return bruto * (11 / 100);
        }
        return 318.37f;
    }
}
