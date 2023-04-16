/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.desconto;

/**
 *
 * @author kanaiama
 */
public class CalculoDesconto {

    public Double calcularDesconto(Double valor, Integer quantidade) {
        Double valorFinal = valor * quantidade;
        
        if (quantidade == 1) {
            valorFinal *= 0.9;
        } else if (quantidade == 2) {
            valorFinal *= 0.8;
        } else {
            valorFinal *= 0.7;
        }
        
        return valorFinal;
    }
}
