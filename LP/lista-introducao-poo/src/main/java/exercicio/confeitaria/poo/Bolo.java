    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicio.confeitaria.poo;

/**
 *
 * @author kanaiama
 */
public class Bolo {
    
    String sabor;
    Integer valor;
    Integer quantidadeVendida;

    public void comprarBolo(Integer quantidadeDesejada) {
        
        if((quantidadeDesejada + quantidadeVendida) > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para"
                    + " esse bolo.");
        } else {
            quantidadeVendida += quantidadeDesejada;
            valor *= quantidadeVendida;
        }
    }
    
    
    public void exibirRelatorio() {
        
        Integer valorTotal = valor * quantidadeVendida;
        System.out.println(String.format("O bolo sabor %s, foi comprado"
                + " %d vezes hoje, totalizando R$ %d",
                sabor, quantidadeVendida, valorTotal));
    }
}
