/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.encomendas.poo;

/**
 *
 * @author kanaiama
 */
public class App {
    public static void main(String[] args) {
        
        Encomenda encomenda01 = new Encomenda();
        encomenda01.valorEncomenda = 200.0;
        encomenda01.distancia = 201.3;
        encomenda01.tamanho = "P";
        encomenda01.enderecoRemetente = "Rua Haddock Lobo 530";
        encomenda01.enderecoDestinatario = "Rua Alface da Silva 10";
        
        encomenda01.calcularFrete();
        encomenda01.emitirEtiqueta();
    }
}
