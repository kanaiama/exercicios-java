/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtora;


/**
 *
 * @author kanaiama
 */
public class App {
    public static void main(String[] args) {
        Produtora p = new Produtora("GiuGiu Produtora", 3);
        
        Ator a = new Ator
        ("Didi", 30, 6.00);
        
        Ator a2 = new Ator("Nathan", 120, 70.0);
        
        Protagonista prota = new Protagonista
        (50, 5.00, "Wil",
                5, 5.00);
        
        Protagonista prota2 = new Protagonista
        (50, 5.00, "Lele",
                5, 5.00);
        
        p.contratar(a);
        p.contratar(a2);
        p.contratar(prota);
        p.contratar(prota2);
        
        System.out.println(p.existePorNome("Didi"));
        
        System.out.println(p.getQuantidadeAtores());
        System.out.println(p.getQuantidadeProtagonistas());
        System.out.println(p.getTotalSalarios());
        
        System.out.println(p.buscarAtorPorNome("Wil"));
    }
}
