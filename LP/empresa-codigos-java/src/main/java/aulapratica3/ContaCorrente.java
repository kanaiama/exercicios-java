/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica3;

/**
 *
 * @author kanaiama
 */
public class ContaCorrente {
    
    private Integer numero, agencia;
    private float limite;
    
    // Sobrecarga
    public ContaCorrente(Integer numero, Integer agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }
    
    public ContaCorrente(Integer numero, Integer agencia, float limite) {
        this.numero = numero;
        this.agencia = agencia;
        this.limite = limite;
    }
}
