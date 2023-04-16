package linguagem.programacao.aula3;

import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("for de 0 a 10");
        
        for (int i = 0; i <= 10; i++) {
            
            System.out.println(i);
        }
        
        System.out.println("for de 10 a 0");
        
        for (int i = 10; i >= 0; i--){
        
            System.out.println(i);
        }
        
        System.out.println("while 0 a 10");
        
        int i = 0;
        
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        
        System.out.println("while - adivinhe o número");
        
        //Vai ser 42!
        System.out.println("DIgite um número:");
     
        Integer numeroDigitado = leitor.nextInt();
        
        while(numeroDigitado != 42) {
            System.out.println("Adivinhe o número: ");
            numeroDigitado = leitor.nextInt();
        }
        
        System.out.println("Acertou!");
        
        System.out.println("do while - adivinhe o númerop");
        
        System.out.println("Digite um número");
        numeroDigitado = leitor.nextInt();
        
        
        do {
             System.out.println("Adivinhe o número: ");
                numeroDigitado = leitor.nextInt();
        }while(numeroDigitado != 42);
        
        System.out.println("Acertou!");
    }   
}
