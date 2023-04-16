package exercicio.exercicio.lista3;

import java.util.Scanner;

public class TesteClasseSocial {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        CalculoSalario calc = new CalculoSalario();
        
        System.out.println("Digite sua renda: ");  
        Double salarioDigitado = leitor.nextDouble();
        
        System.out.println("Você recebe aproximadamente: " + 
                calc.calcularSalario(salarioDigitado));
        
        System.out.println("Sua classe social é: " +
                calc.devolverClasseSocial(salarioDigitado));
    }
}
