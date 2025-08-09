import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        LISTA 5 EXERCICIOS
//        EXERCICIO 1
//        int[] vetores = new int[5];
//        vetores[0] = 10;
//        vetores[1] = 20;
//        vetores[2] = 30;
//        vetores[3] = 40;
//        vetores[4] = 50;
//
//        for (int i = 0; i < vetores.length; i++) {
//            System.out.println(vetores[i]);
//        }

        //EXERCICIO 2
//        Crie um vetor de 10 posições do tipo int. Solicite ao usuário que informe os 10 valores e, ao final, exiba todos os números digitados usando um laço for.

//        int[] vetores = new int[10];
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um elemento: ");
//        vetores[0] = scanner.nextInt();
//        System.out.println("Digite um elemento: ");
//        vetores[1] = scanner.nextInt();
//        System.out.println("Digite um elemento: ");
//        vetores[2] = scanner.nextInt();
//        System.out.println("Digite um elemento: ");
//        vetores[3] = scanner.nextInt();
//        System.out.println("Digite um elemento: ");
//        vetores[4] = scanner.nextInt();
//        System.out.println("Digite um elemento: ");
//        vetores[5] = scanner.nextInt();
//        System.out.println("Digite um elemento: ");
//        vetores[6] = scanner.nextInt();
//        System.out.println("Digite um elemento: ");
//        vetores[7] = scanner.nextInt();
//        System.out.println("Digite um elemento: ");
//        vetores[8] = scanner.nextInt();
//        System.out.println("Digite um elemento: ");
//        vetores[9] = scanner.nextInt();
//
//        for(int i = 0; i < vetores.length; i++){
//            System.out.print(vetores[i]);
//        }

        //Exercicio 3
//        Scanner scanner = new Scanner(System.in);
//        int[] vetores = new int[5];
//        int resultado = 0;
//
//        System.out.println("Digite um valor: ");
//        vetores[0] = scanner.nextInt();
//        System.out.println("Digite outro valor: ");
//        vetores[1] = scanner.nextInt();
//        System.out.println("Digite outro valor: ");
//        vetores[2] = scanner.nextInt();
//        System.out.println("Digite outro valor: ");
//        vetores[3] = scanner.nextInt();
//        System.out.println("Digite outro valor: ");
//        vetores[4] = scanner.nextInt();
//
//
//        for (int i = 0; i < vetores.length; i++) {
//            resultado += vetores[i];
//        }
//        System.out.println(resultado);

        //Exercicio 4
//        Scanner scanner = new Scanner(System.in);
//        int[] vetores = new int[6];
//
//        for(int i = 0; i < vetores.length; i++){
//            System.out.println("Digite o numero: " + (i + 1) + ":");
//            vetores[i] = scanner.nextInt();
//            }
//
//        int maior = vetores[0];
//        for(int i = 1; i < vetores.length; i++){
//            if(vetores[i] > maior){
//                maior = vetores[i];
//            }
//
//        }
//        System.out.println("o maior e: " + maior);

        //Exercicio 5
//        Scanner scanner = new Scanner(System.in);
//        int[] vetores = new int[10];
//        int contadorPares = 0;
//
//        for(int i = 0; i < vetores.length; i++){
//            System.out.println("Digite o numero: " + (i + 1) + ":");
//            vetores[i] = scanner.nextInt();
//
//            if(vetores[i] % 2 == 0){
//                contadorPares++;
//            }
//        }
//        System.out.println("Vetores da pares: " + contadorPares);

        //Exercicio 6
        Scanner scanner = new Scanner(System.in);
        int[] vetor =  new int[8];
        boolean encontrado = false;

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o numero: " + (i + 1));
            vetor[i] = scanner.nextInt();
        }
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == valorBusca){
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println("Vetor encontrado" + vetor);
        } else {
        }
    }