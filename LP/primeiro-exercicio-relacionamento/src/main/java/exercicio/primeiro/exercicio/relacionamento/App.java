/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.primeiro.exercicio.relacionamento;

/**
 *
 * @author kanaiama
 */
public class App {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho("Giugiu");
        
        Produto produto1 = new Produto("Caneta", "Escola", 2.5);
        carrinho.adicionar(produto1);

        Produto produto2 = new Produto("Lápis", "Escola", 5.00);
        carrinho.adicionar(produto2);

        Produto produto3 = new Produto("Shampoo","Cosmético", 0.5);
        carrinho.adicionar(produto3);
        
        
        System.out.println(carrinho);
    }
}
