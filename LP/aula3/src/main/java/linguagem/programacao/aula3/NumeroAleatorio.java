package linguagem.programacao.aula3;

import java.util.concurrent.ThreadLocalRandom;

public class NumeroAleatorio {
    public static void main(String[] args) {
        
        // Também tem uma classe Math.random
        // MAS precisa criar um objeto
        // Um jeito mais simples:
        
        Integer numeroAleatorio =
                ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println("Número aleátorio " + numeroAleatorio);
        
        Double doubleAleatorio = 
                ThreadLocalRandom.current().nextDouble(1.7, 35.8);

        System.out.println(String.format("Aleátorio real: %.2f", doubleAleatorio));
    }
}
