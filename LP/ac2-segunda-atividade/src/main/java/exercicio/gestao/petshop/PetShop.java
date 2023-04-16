/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.gestao.petshop;

/**
 *
 * @author kanaiama
 */
public class PetShop {
    private String nome;
    private Double faturamentoTotal;

    
    public PetShop(String nome) {
        this.nome = nome;
        faturamentoTotal = 0.0;
    }
    
    public void darBanho(Pet pet, Double valor) {
        if(valor < 0) {
            System.out.println("Valor inválido!");
        }else {
            faturamentoTotal += valor;
            System.out.println("O valor do serviço foi de R$" + valor);
        }
    }
    
    public void darBanho(Pet pet, Double valor, Double desconto) {
        
        if(valor < 0 || desconto < 0.0) {
            System.out.println("Valores inválidos!");
        } else {
            Double valorDesconto = valor - (valor * (desconto / 100.0));
            
            if(valorDesconto > 0) {
                System.out.println("O valor do serviço foi de R$"+valor+""
                    + ". Aplicando desconto, o valor total é de: R$"
                    + valorDesconto);
                
                faturamentoTotal += valorDesconto;
            } else {
                System.out.println("Valor de desconto inválido!"); 
            }

        }
    }

    @Override
    public String toString() {
        String fraseFormatada = String.format("\nNome do PetShop: %s "
                + "\nFaturamento Total: %.2f", nome, faturamentoTotal);
        
        return fraseFormatada;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(Double faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }
    
    
    
}
