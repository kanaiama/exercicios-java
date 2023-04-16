/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica1;

/**
 *
 * @author kanaiama
 */
public class PessoaApp {
   
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa(1, "Helder");
        
        Pessoa pessoa2 = new Pessoa(2, "Ana");
    
        System.out.println("O nome do objeto pessoa1 é: " + pessoa1.getNome());
        
        pessoa1.setNome("Elder");
        
        System.out.println("O nome do objeto pessoa1 é: " + pessoa1.getNome());
    }
}
