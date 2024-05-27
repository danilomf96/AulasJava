public class ExAula04 {
    public static void ex05() {
        int[] vet = new int[5];
        int valor;
        int quant = 0;
        System.out.println("Exercicio 05");
        System.out.println("Informe 5 valores inteiros para compor o vetor : ");

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Valor para a posiçao " + i + " : ");
            vet[i] = Console.readInt();
        }

        System.out.println("Vetor Registrado!");
        System.out.print("Informe um outro valor inteiro : ");
        valor = Console.readInt();

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == valor) {
                quant++;
            }
        }
        System.out.println("\nO valor " + valor + " aparece " + quant + " vezes no vetor!");

    }

    public static void ex06() {
        float vet[] = new float[5];
        float[] vet2 = { 4, 1, 2, 2, 1 };
        float media = 0;

        System.out.println("Digite as 5 notas: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Console.readFloat();
            media += vet[i] * vet2[i];
            // media = media + vet[i] * vet2[i]
        }
        media = media / 10;
        // media /= media / 10

        System.out.println("\n Media do aluno: " + media);
    }
}
