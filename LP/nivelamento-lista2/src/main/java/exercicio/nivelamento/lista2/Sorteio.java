package exercicio.nivelamento.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
         Scanner l = new Scanner (System.in);
         
         System.out.println("Diga um numero de 1 a 100");
         Integer num = l.nextInt();
         
         Integer par = 0;
         Integer impar = 0;
         Integer primeiraVez = 0;
         
         for (int i = 1; i <= 200; i++) {
             Integer sorteio = ThreadLocalRandom.current().nextInt(1, 101);
             System.out.println(sorteio);
             
             if(sorteio.equals(num) && primeiraVez == 0) {
                 primeiraVez = i;
             }
             
             if(sorteio % 2 == 0) {
                 par++;
             } else {
                 impar++;
             }
            
        }
         
         System.out.println("Foi sorteado " + par +
                 " números pares e " + impar + " números ímpares");
    }
}
