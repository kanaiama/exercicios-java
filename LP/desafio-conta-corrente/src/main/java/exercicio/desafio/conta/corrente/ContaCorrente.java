/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.desafio.conta.corrente;
    
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanaiama
 */
public class ContaCorrente {
    private String titular;
    private Double saldo;
    private List<Historico> historico;

    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.historico = new ArrayList<>();
    }

    
    
    public void depositar(Double valor, Integer dia, Integer mes, Integer ano) {
        saldo += valor;
        Historico h = new Historico(dia, mes, ano, valor, "Deposito");
        historico.add(h);
        System.out.println("Foi depositado: " + valor + "\n Saldo atual: " + saldo);
        
    }
    
    public void sacar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (saldo >= valor) {
            saldo -= valor;
            Historico h = new Historico(dia, mes, ano, valor, "Saque");
             historico.add(h);
             System.out.println("Foi sacado: " + valor + "\n Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void exibirExtrato() {
         System.out.println("\nEXTRATO:");
         System.out.println("Titular: " + titular);
         System.out.println("Saldo: " + saldo);
         System.out.println("Histórico:");
        for (Historico h : historico) {
            System.out.println(h.getOperacao() +
                    " - " + h.getValor() + " - " + h.getDia() 
                    + "/" + h.getMes() + "/" + h.getAno());
        
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Historico> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Historico> historico) {
        this.historico = historico;
    }

 

    @Override
    public String toString() {
        return String.format("\n - Conta Corrente - "
                + "\nTitular: %s "
                + "\nSaldo: %.2f "
                + "\nHistórico: %s", titular, saldo, historico);
    }
    
    
}
