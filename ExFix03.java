package ExFix03;

import java.util.Scanner;

class ExFix03 {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            
            int[] vet1 = new int[5];

            System.out.println("Número de matrícula do aluno: ");
            int matricula = leitor.nextInt();

            leitor.nextLine();

            System.out.println("Nome do aluno: ");
            String nome = leitor.nextLine();

            for(int i = 0; i < vet1.length; i++){
                System.out.println("Nota " + (i+1) + ": ");
                int vlrNota = leitor.nextInt();
                if (vlrNota > 10) {
                    break;
                }
                vet1[i] = vlrNota;
            }

            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome: " + nome);
            for(int i = 0; i < vet1.length; i++){
                System.out.println("Nota " + (i+1) + ": " + vet1[i]);
            } 
            leitor.close();
        }
    }