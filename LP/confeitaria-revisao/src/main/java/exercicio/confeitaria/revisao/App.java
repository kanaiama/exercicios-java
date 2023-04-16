package exercicio.confeitaria.revisao;
 
public class App {
    public static void main(String[] args) {
        Bolo bolo1 = new Bolo();
        bolo1.sabor = "Morango";
        bolo1.valor = 2000.0;
        
        Bolo bolo2 = new Bolo();
        bolo2.sabor = "Chocolate";
        bolo2.valor = 10.0;
        
        bolo1.comprarBolo(20);
        bolo1.comprarBolo(80);
        bolo1.comprarBolo(100);
        bolo1.exibirRelatorio();
        
        bolo2.comprarBolo(99);
        bolo2.exibirRelatorio();
    }
}
