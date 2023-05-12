/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.heranca.graduacao;

/**
 *
 * @author kanaiama
 */
public class DesevolvedorMobile extends Desenvolvedor{
    private Integer qtdHorasTrabalhadaMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesevolvedorMobile(Integer qtdHorasTrabalhadaMobile, 
            Double valorHoraTrabalhadaMobile, String nome, 
            Integer qtdHorasTrabalhada, Double valorHoraTrabalhada) {
        
        super(nome, qtdHorasTrabalhada, valorHoraTrabalhada);
        
        this.qtdHorasTrabalhadaMobile = qtdHorasTrabalhadaMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (valorHoraTrabalhadaMobile * qtdHorasTrabalhadaMobile);
    }
    
    
    public Integer getQtdHorasTrabalhadaMobile() {
        return qtdHorasTrabalhadaMobile;
    }

    public void setQtdHorasTrabalhadaMobile(Integer qtdHorasTrabalhadaMobile) {
        this.qtdHorasTrabalhadaMobile = qtdHorasTrabalhadaMobile;
    }

    public Double getValorHoraTrabalhadaMobile() {
        return valorHoraTrabalhadaMobile;
    }

    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile) {
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public String toString() {
        return String.format("\n%s"
                + "\nQuantidade de horas mobile trabalhada: %d"
                + "\nQuantidade de valor hora mobile trabalhada: %.2f", 
                super.toString(),
                qtdHorasTrabalhadaMobile, valorHoraTrabalhadaMobile);
    }
    
    
}
