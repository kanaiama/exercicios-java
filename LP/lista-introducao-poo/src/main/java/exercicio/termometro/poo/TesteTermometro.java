/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.termometro.poo;

/**
 *
 * @author kanaiama
 */
public class TesteTermometro {
    public static void main(String[] args) {
        Termometro temp = new Termometro();
        
        temp.temperaturaAtual = 30.0;
        temp.temperaturaMax = 15.0;
        temp.temperaturaMin = 12.0;
        temp.fahreinheit = 40.0;
        
        temp.aumentaTemperatura(30.0);
        temp.diminuiTemperatura(12.0);
        temp.exibirFahreinheit();
    }
}
