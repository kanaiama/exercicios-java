/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.encomendas.poo;

/**
 *
 * @author kanaiama
 */
public class Encomenda {
    
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    
    Double distancia;
    Double valorEncomenda;
    
    
    Double calcularFrete() {
        Double frete = 0.0;
        
        if("P".equals(tamanho)) {
            frete = (valorEncomenda * 0.01);
             
        } else if ("M".equals(tamanho)) {
            frete = (valorEncomenda * 0.03);
            
        } else {
            frete = (valorEncomenda * 0.05);
            
        }
      
          if(distancia < 50.0) {
              frete += 3.0;
              
          } else if(distancia <= 200) {
              frete += 5.0;
              
          } else {
              frete += 7.0;
              
          } 
        return frete;
    }
    
    public void emitirEtiqueta() {
        Double totalCompra = calcularFrete() + valorEncomenda;
        
        System.out.println("***** ETIQUETA PARA ENVIO *****");
        System.out.println("Endereço do remetente: " + enderecoRemetente);
        System.out.println("Endereço do destinatário: " + enderecoDestinatario);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("-----------------------------------------------");
        System.out.println("Valor encomenda: " + valorEncomenda);
        System.out.println("Valor frete: " + calcularFrete());
        System.out.println("-----------------------------------------------");
        System.out.println("Valor total: " + totalCompra);
    }
}
