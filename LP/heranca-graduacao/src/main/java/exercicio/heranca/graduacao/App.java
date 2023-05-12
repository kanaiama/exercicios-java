/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.heranca.graduacao;

/**
 *
 * @author kanaiama
 */
public class App {
    public static void main(String[] args) {
        Consultoria c = new Consultoria("GiuGiu Consultas", 3);
        
        Desenvolvedor d = new Desenvolvedor
        ("Didi", 30, 6.00);
        
        Desenvolvedor d2 = new Desenvolvedor("Nathan", 120, 70.0);
        
        DesevolvedorMobile dM = new DesevolvedorMobile
        (50, 5.00, "Wil",
                5, 5.00);
        
        DesevolvedorMobile dM2 = new DesevolvedorMobile
        (50, 5.00, "Lele",
                5, 5.00);
        
        c.contratar(d);
        c.contratar(d2);
        c.contratar(dM);
        c.contratar(dM2);
        
        System.out.println(c.existePorNome("Didi"));
        
        System.out.println(c.getQuantidadeDesenvolvedores());
        System.out.println(c.getQuantidadeDesenvolvedoresMobile());
        System.out.println(c.getTotalSalarios());
        
        System.out.println(c.buscarDesenvolvedorPorNome("Wil"));
        
            
    }
}
