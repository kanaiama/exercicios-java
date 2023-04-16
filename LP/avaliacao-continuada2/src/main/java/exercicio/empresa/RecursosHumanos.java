package exercicio.empresa;

public class RecursosHumanos {
    Integer totalPromovido = 0;
    Integer totalSalarioReajustado = 0;
    

    
    void setReajustarSalario(Double valorReajuste, Colaborador colab) {
            colab.setSalario(colab.getSalario() + valorReajuste);
            
            totalSalarioReajustado++;
    }
    
    void setPromoverColaborador(Colaborador colab, String novoCargo, 
            Double novoSalario) {
        
            if(colab.salario < novoSalario) {
                colab.setCargo(novoCargo);
                colab.setSalario(novoSalario + colab.getSalario());
                totalPromovido++;
            } else {
                System.out.println("Operação inválida!");
            }
    }
}
