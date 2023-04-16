package exercicio.nivelamento.lista2;

public class Potencia {
    public static void main(String[] args) {
        
        Integer b = 2;
        Integer r = 1;
        
       for (int e = 5; e != 0; e--) {
           r = b * r;
        }
       
        System.out.println("Resultado: " + r);
    }
}
