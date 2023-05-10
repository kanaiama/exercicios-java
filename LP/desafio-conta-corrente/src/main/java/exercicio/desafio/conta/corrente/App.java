/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.desafio.conta.corrente;

/**
 *
 * @author kanaiama
 */
public class App {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("GiuGiu", 1800.00);
        
        cc.depositar(2000.00, 4, 2, 2023);
        cc.sacar(1300.00, 3, 5, 2023);
        
        cc.exibirExtrato();
        
    }
}
