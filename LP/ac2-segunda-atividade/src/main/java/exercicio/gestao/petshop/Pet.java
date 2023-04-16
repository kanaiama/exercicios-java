/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.gestao.petshop;

/**
 *
 * @author kanaiama
 */
public class Pet {
    private String nome;
    private String raca;
    private Integer qtdVisitasAoPetshop;
    private Double valorGastoEmPetshop;

    public Pet(String nome, String raca, Integer qtdVisitasAoPetshop,
            Double valorGastoEmPetshop) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitasAoPetshop = qtdVisitasAoPetshop;
        this.valorGastoEmPetshop = valorGastoEmPetshop;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitasAoPetshop() {
        return qtdVisitasAoPetshop;
    }

    public void setQtdVisitasAoPetshop(Integer qtdVisitasAoPetshop) {
        this.qtdVisitasAoPetshop = qtdVisitasAoPetshop;
    }

    public Double getValorGastoEmPetshop() {
        return valorGastoEmPetshop;
    }

    public void setValorGastoEmPetshop(Double valorGastoEmPetshop) {
        this.valorGastoEmPetshop = valorGastoEmPetshop;
    }
 
    
}
