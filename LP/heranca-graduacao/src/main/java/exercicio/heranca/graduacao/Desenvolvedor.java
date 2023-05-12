/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.heranca.graduacao;

/**
 *
 * @author kanaiama
 */
public class Desenvolvedor {
    protected String nome;
    protected Integer qtdHorasTrabalhada;
    protected Double valorHoraTrabalhada;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhada, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhada = qtdHorasTrabalhada;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public Double getSalario() {
        return (valorHoraTrabalhada * qtdHorasTrabalhada);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhada() {
        return qtdHorasTrabalhada;
    }

    public void setQtdHorasTrabalhada(Integer qtdHorasTrabalhada) {
        this.qtdHorasTrabalhada = qtdHorasTrabalhada;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return String.format("- Desenvolvedor -"
                + "\nNome: %s"
                + "\nQuantidade de horas trabalhadas: %d"
                + "\nQuantidade de valor hora trabalhada: %.2f", 
                nome, qtdHorasTrabalhada, valorHoraTrabalhada);
    }
    
    
    
}
