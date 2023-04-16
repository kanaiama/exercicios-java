package exercicio.primeira.prova;

import java.util.Scanner;

public class PrimeiraProva {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
     
        Integer escolha;
        
        Double valorDepositado;
        Double saldoUsuario = 0.0;
        Double valorSaque;
        Double saldoRendimento = 0.0;
        Double rendimentoAtual = saldoRendimento;
        
        do{
            System.out.println("--------------------------------------");
            System.out.println("|         SPTECH INVESTIMENTOS       |");
            System.out.println("--------------------------------------");
            System.out.println("|       Olá, o que deseja fazer?     |");
            System.out.println("-------------------------------------");

            System.out.println("| 1 - Depositar                      |");
            System.out.println("| 2 - Sacar                          |");
            System.out.println("| 3 - Simular rendimentos            |");
            System.out.println("| 0 - Sair                           |");
            System.out.println("--------------------------------------");
            
            escolha = leitor.nextInt();
            
            if(escolha >= 4) {
                System.out.println("Opção inválida!");
            } else {
                switch (escolha) {
                    case 1:
                            System.out.println("Insira um valor a ser"
                                    + " depositado: ");
                            valorDepositado = leitor.nextDouble();

                            if(valorDepositado <= 0) {
                                System.out.println("Valor inválido!");                        
                            } else {
                                saldoUsuario += valorDepositado;
                                saldoRendimento += saldoUsuario * 0.10;
                                System.out.println("Depósito realizado"
                                        + " com sucesso!");
                                System.out.println("Saldo atual: " + saldoUsuario);
                            }
                            break;


                    case 2: 
                        System.out.println("Insira um valor para sacar: ");
                        valorSaque = leitor.nextDouble();

                        if(valorSaque <= 0) {
                            System.out.println("Valor inválido!");  
                        } else if (valorSaque > saldoUsuario) {
                            System.out.println("Valor insuficiente"
                                    + " para sacar!");
                            break;
                        } else {
                            saldoUsuario -= valorSaque;
                            System.out.println("Saque realizado com sucesso!");
                            System.out.println("Saldo atual: " + saldoUsuario);
                        }
                        break;

                    case 3:
                        if(saldoUsuario >= 0) {
                            System.out.println("Saldo atual: R$"+ saldoUsuario);
                            System.out.println("Mês 1 | Saldo: R$"+ saldoUsuario);
                            for (int i = 2; i <= 12; i++) {
                                rendimentoAtual = rendimentoAtual + saldoUsuario;
                                System.out.println("Mês "+ i + " | Saldo: R$" + (rendimentoAtual * 0.10));
                            }
                        } else {
                            System.out.println("Saldo zerado, opção inválida.");
                        }
                        break;
                    default: 
                        System.out.println("Até mais!");
                    break;
                }
            }
        } while (escolha != 0);
    }
}
    