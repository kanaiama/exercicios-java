package exercicio.confeitaria.revisao;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;
    
    public void comprarBolo(Integer quantidadeDesejada) {
        
        if((quantidadeVendida + quantidadeDesejada) > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para"
                + " esse bolo");
            
        } else {
            quantidadeVendida += quantidadeDesejada;
            
        }
        
    };
    
    public void exibirRelatorio() {
        System.out.println(String.format("O bolo sabor %s, foi comprado"
                + " %d vezes hoje, totalizando R$%.2f",
                sabor, quantidadeVendida, (valor*quantidadeVendida)));
    };
}
