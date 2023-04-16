/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicio.projeto.individual;

import java.util.Scanner;

/**
 *
 * @author kanaiama
 */
public class ImcApp {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        PesoIdeal pesoIdeal = new PesoIdeal();
        
        Integer escolha;
        
        Integer escolhaGenero;
        Double peso;
        Double altura;
        Double imc = 0.0;

         do{
            System.out.println("--------------------------------------");
            System.out.println("|      BEM-VINDO AO IMC SÁUDE !      |");
            System.out.println("--------------------------------------");
            System.out.println("|       Olá, o que deseja fazer?     |");
            System.out.println("-------------------------------------");

            System.out.println("| 1 - Calcular IMC                   |");
            System.out.println("| 2 - Ver sáude                      |");
            System.out.println("| 3 - Peso Ideal                     |");
            System.out.println("| 4 - Sair                           |");
            System.out.println("--------------------------------------");
            
            escolha = leitor.nextInt();
            
            if(escolha == 0 || escolha > 4) {
                System.out.println("Opção inválida!");
            } else {
                 switch (escolha) {
                    case 1:
                            System.out.println("Insira seu peso: ");
                            peso = leitor.nextDouble();

                            System.out.println("Insira sua altura: ");
                            altura = leitor.nextDouble();
                            
                            imc += (peso / (altura * altura));
                            
                            
                            System.out.println(String.format("Seu"
                                    + " imc é: %.2f ", imc));
                            break;
                            
                    case 2:
                        if(imc == 0) {
                            System.out.println("Faça o cálculo IMC para continuar!");
                            break;
                        } else {
                            if(imc < 18.5) {
                                System.out.println("Você está abaixo do peso");
                            } else if(imc <= 24.9) {
                                System.out.println("Seu peso está normal");
                            } else if(imc <= 29.9) {
                                System.out.println("Você está pré-obeso");
                            } else if (imc <= 34.9) {
                                System.out.println("Você está com obesidade grau 1");
                            } else if(imc <= 39.9) {
                                System.out.println("Você está com obesidade grau 2");
                            } else {
                                System.out.println("Você está com obesidade grau 3");
                            }
                            break;
                        }
                    case 3:
                        System.out.println(" - Tabela peso ideal - ");
                        System.out.println("1- Peso ideal por altura"
                                + " para mulheres");
                        System.out.println("2- Peso ideal por altura "
                                + " para homens");
                        
                        escolhaGenero = leitor.nextInt();
                        
                        if(escolhaGenero >= 3 || escolhaGenero == 0){
                            System.out.println("Valor inválido.");
                        } else {
                            if(escolhaGenero == 1) {
                                System.out.println("Diga sua altura: ");
                                altura = leitor.nextDouble();
                                
                                System.out.println(
                                        pesoIdeal.pesoIdealFeminino(altura));
                                
                            } else {
                                System.out.println("Diga sua altura: ");
                                altura = leitor.nextDouble();
                                
                                System.out.println(
                                        pesoIdeal.pesoIdealMasculino(altura));
                            }
                        }
                        
                 }
            }
        }while(escolha != 4);
         
    }
}
    