/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.termometro.poo;

/**
 *
 * @author kanaiama
 */
public class Termometro {
    
    Double temperaturaAtual; 
    Double temperaturaMax;
    Double temperaturaMin;
    Double fahreinheit;
    
    void aumentaTemperatura (Double graus) {
        temperaturaAtual += graus;
        
        if(temperaturaAtual >= temperaturaMax) {
            temperaturaMax = temperaturaAtual;
        }
        
        System.out.println(String.format("Temperatura atual: %.2f", 
                temperaturaAtual));
    }
    
    void diminuiTemperatura (Double graus) {
        temperaturaAtual -= graus;
        
        if(temperaturaAtual <= temperaturaMin) {
            temperaturaMin = temperaturaAtual;
        }
        
        System.out.println(String.format("Temperatura atual: %.2f", 
                temperaturaAtual));
    }
    
    void exibirFahreinheit () {
         fahreinheit = (temperaturaAtual * 9 / 5) + 35;   
    
        System.out.println(String.format("Cº %.2f \nFº %.2f",
                temperaturaAtual, fahreinheit));
    }
}
