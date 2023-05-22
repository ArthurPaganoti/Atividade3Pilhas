import java.util.Random;

public class PilhasDinamicas {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        StackDinamica pilhaUm = new StackDinamica();
        StackDinamica pilhaDois = new StackDinamica();
        StackDinamica pilhaTres = new StackDinamica();

        int numeroAleatorioUm, numeroAleatorioDois;

        for (int i = 0; i < 100; i++) {
            numeroAleatorioUm = aleatorio.nextInt(9) + 1;
            if (numeroAleatorioUm == 1 || numeroAleatorioUm == 2 || numeroAleatorioUm == 3) {
                pilhaUm.push(numeroAleatorioUm);
            } else if (numeroAleatorioUm == 4 || numeroAleatorioUm == 5 || numeroAleatorioUm == 6) {
                pilhaDois.push(numeroAleatorioUm);
            } else {
                pilhaTres.push(numeroAleatorioUm);
            }
        }

        for (int i = 0; i < 100; i++) {
            numeroAleatorioDois = aleatorio.nextInt(3) + 1;

            if (numeroAleatorioDois == 1 && !pilhaTres.isEmpty() && !pilhaDois.isEmpty()) {
                pilhaUm.push(pilhaTres.top().getValor());
                pilhaTres.pop();
                pilhaUm.push(pilhaDois.top().getValor());
                pilhaDois.pop();
            } else if (numeroAleatorioDois == 2 && !pilhaTres.isEmpty() && !pilhaUm.isEmpty()) {
                pilhaDois.push(pilhaTres.top().getValor());
                pilhaTres.pop();
                pilhaDois.push(pilhaUm.top().getValor());
                pilhaUm.pop();
            }

            if (pilhaUm.isEmpty() || pilhaDois.isEmpty() || pilhaTres.isEmpty()) {
                System.out.println("Uma das pilhas ficou vazia.");
                break;
            }

            System.out.println("Pilha Um: ");
            pilhaUm.imprimir();

            System.out.println("Pilha Dois: ");
            pilhaDois.imprimir();

            System.out.println("Pilha Três: ");
            pilhaTres.imprimir();
        }
    }
}