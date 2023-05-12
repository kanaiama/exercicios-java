/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtora;

/**
 *
 * @author kanaiama
 */
public class Protagonista extends Ator{
    private Integer qtdHorasTrabalhadaProtagonista;
    private Double valorHoraTrabalhadaProtagonista;

    public Protagonista(Integer qtdHorasTrabalhadaProtagonista, 
            Double valorHoraTrabalhadaProtagonista, String nome, 
            Integer qtdHorasTrabalhada, Double valorHoraTrabalhada) {
        
        super(nome, qtdHorasTrabalhada, valorHoraTrabalhada);
        
        this.qtdHorasTrabalhadaProtagonista = qtdHorasTrabalhadaProtagonista;
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (valorHoraTrabalhadaProtagonista * qtdHorasTrabalhadaProtagonista);
    }

    public Integer getQtdHorasTrabalhadaProtagonista() {
        return qtdHorasTrabalhadaProtagonista;
    }

    public void setQtdHorasTrabalhadaProtagonista(Integer qtdHorasTrabalhadaProtagonista) {
        this.qtdHorasTrabalhadaProtagonista = qtdHorasTrabalhadaProtagonista;
    }

    public Double getValorHoraTrabalhadaProtagonista() {
        return valorHoraTrabalhadaProtagonista;
    }

    public void setValorHoraTrabalhadaProtagonista(Double valorHoraTrabalhadaProtagonista) {
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    @Override
    public String toString() {
        return String.format("\n%s"
                + "\nQuantidade de horas protagonista trabalhada: %d"
                + "\nQuantidade de valor hora protagonista trabalhada: %.2f", 
                super.toString(),
                qtdHorasTrabalhadaProtagonista, valorHoraTrabalhadaProtagonista);
    }
    
    
}
