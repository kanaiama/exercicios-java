package exercicio.frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Frutas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        List<String> nomesFrutas = new ArrayList(); 
        nomesFrutas.add("maçã");
        nomesFrutas.add("banana");
        nomesFrutas.add("abacaxi");
        nomesFrutas.add("pêssego");
        
        
        System.out.println("Digite o nome de alguma fruta: ");
        String frutaDigitada = leitor.nextLine().toLowerCase();
                
        Boolean encontrouFruta = false;
        
        for (String fruta : nomesFrutas) {
            if(fruta.toLowerCase().equals(frutaDigitada)) {
                encontrouFruta = true;
                break;
            }
        }
        
        if (encontrouFruta) {
             System.out.printf("A fruta %s existe na lista."
                     , frutaDigitada);
        } else {
             System.out.printf("Não existe a fruta %s na lista."
                     , frutaDigitada);
        }
    }
}
