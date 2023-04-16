package exercicio.rh;

public class RecursosHumanos {
    private Integer totalPromocoes;
    private Integer totalSalariosReajustados;

    public RecursosHumanos() {
        this.totalPromocoes = 0;
        this.totalSalariosReajustados = 0;
    }
    
    public void reajustarSalario(Colaborador colab, Double valorReajuste) {
        
        if(valorReajuste > 0.0) {
            Double novoSalario = colab.getSalario() + valorReajuste;
            colab.setSalario(novoSalario);
            
            totalSalariosReajustados++;
            System.out.println("Salário reajustado");
        } else {
            System.out.println("Valor inválido");
        }
        
    }
    
    public void promoverColaborador(Colaborador colab,
            String novoCargo, Double novoSalario) {
        
        Boolean validarPromocao = novoSalario > colab.getSalario();
        
        if(validarPromocao && !novoCargo.equals(colab.getCargo())) {
            colab.setCargo(novoCargo);
            System.out.println("O novo cargo de " + colab.getNome() + " é: "
                    + novoCargo);

            totalPromocoes++;
        } else {
            System.out.println("Operação inválida!");
        }
    }
    
    
    public Integer getTotalPromocoes() {
        return totalPromocoes;
    }
    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    @Override
    public String toString() {
        String fraseFormatada = String.format("\nTotal de promoções: " + totalPromocoes
                + "\nTotal de salários reajustados: " + totalSalariosReajustados);
        
        return fraseFormatada;
    }
    
    
}
