/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica2;

/**
 *
 * @author kanaiama
 */
public class ClienteApp {
     public static void main(String[] args) {
        
        ClientePF clientepf1 = new ClientePF("xxxxxyz ", "bairro tal ",
                "111121211");
        
        
        ClientePJ clientepj1 = new ClientePJ("xxxxxyz ", "bairro tal ",
                "2341232132");
     
        
         System.out.println("Clientes pf dados: " + clientepf1.getNome() +
                 clientepf1.getEndereco() + clientepf1.getCpf());
         
         
         
         System.out.println(clientepf1.toString());
         System.out.println(clientepj1.toString());
    }
    
}