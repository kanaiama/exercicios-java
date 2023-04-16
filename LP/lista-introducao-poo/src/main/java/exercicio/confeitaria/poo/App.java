/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.confeitaria.poo;

/**
 *
 * @author kanaiama
 */
public class App {
    public static void main(String[] args) {
        
        Bolo bolo01 = new Bolo();
        bolo01.sabor = "chocolate";
        bolo01.valor = 30;
        bolo01.quantidadeVendida = 0;
        
        
        Bolo bolo02 = new Bolo();
        bolo02.sabor = "flocos";
        bolo02.valor = 50;
        bolo02.quantidadeVendida = 0;

        Bolo bolo03 = new Bolo();
        bolo03.sabor = "maracuja";
        bolo03.valor = 10;
        bolo03.quantidadeVendida = 0;
        
        
          bolo01.comprarBolo(30);
          bolo01.exibirRelatorio();    
          
          System.out.println("-----------------");
          
          bolo02.comprarBolo(40);
          bolo02.exibirRelatorio();
          
          System.out.println("-------------------");
          
          bolo03.comprarBolo(100);
          bolo03.exibirRelatorio();
          
          System.out.println("---------------------");
          
          bolo01.comprarBolo(90);
          bolo01.exibirRelatorio();
          
          System.out.println("-----------------------");
          
          bolo03.comprarBolo(5);
          bolo03.exibirRelatorio();
        
        
    }
}
