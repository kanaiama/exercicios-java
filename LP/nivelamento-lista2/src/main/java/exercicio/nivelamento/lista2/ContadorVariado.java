package exercicio.nivelamento.lista2;

public class ContadorVariado {
    public static void main(String[] args) {
        
        for (double i = 0.15; i <= 5; i+= 0.15) {
            String frase = String.format("%.2f", i);
            System.out.println(frase);
        }
    }
}
