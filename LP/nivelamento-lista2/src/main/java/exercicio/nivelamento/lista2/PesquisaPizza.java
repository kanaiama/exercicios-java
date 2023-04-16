    package exercicio.nivelamento.lista2;

import java.util.Scanner;

public class PesquisaPizza {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer votoMussarela = 0;
        Integer votoCalabresa = 0;
        Integer votoQuatroQueijos = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Aluno " + i + ", digite o número correspondente ao"
                    + " seu sabor favorito de pizza (5 - mussarela, 25 "
                    + "- calabresa, 50 - quatro queijos): ");
            Integer voto = leitor.nextInt();
            
            switch (voto) {
                case 5:
                    votoMussarela++;
                    break;
                case 25:
                    votoCalabresa++;
                    break;
                case 50:
                    votoQuatroQueijos++;
                    break;
                default:
                    System.out.println("Opção inválida! Voto não será contabilizado.");
                    break;
            }
        }
        
        System.out.println("Quantidade de votos:");
        System.out.println("Mussarela: " + votoMussarela);
        System.out.println("Calabresa: " + votoCalabresa);
        System.out.println("Quatro queijos: " + votoQuatroQueijos);
        
        if (votoMussarela > votoCalabresa && votoMussarela > votoQuatroQueijos) {
            System.out.println("O sabor favorito da pesquisa é mussarela.");
        } else if (votoCalabresa > votoMussarela && votoCalabresa > votoQuatroQueijos) {
            System.out.println("O sabor favorito da pesquisa é calabresa.");
        } else if (votoQuatroQueijos > votoMussarela && votoQuatroQueijos > votoCalabresa) {
            System.out.println("O sabor favorito da pesquisa é quatro queijos.");
        } else {
            System.out.println("Houve empate entre os sabores.");
        }
    }
}