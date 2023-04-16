package exercicio.controle.de.estimativa;

public class Atividade {
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel,
            Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }
    
    public void terminarAtividade(Integer diasUsados) {
        if(diasUsados > 0) {
            this.diasUsados = diasUsados;
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
    public void exibirRelatorio() {
        
        if(diasUsados > diasEstimados) {
            System.out.println("Você estimou " + diasEstimados + " dias mas a tarefa foi" +
                " feita em " + diasUsados + " dias("+ (diasUsados - diasEstimados) +
                    " dias a mais que o estimado). "
                        + "\nMelhore a estimativa!");
        } else if (diasUsados < diasEstimados) {
            System.out.println("Você estimou " + diasEstimados + " dias mas a tarefa foi" +
                " feita em " + diasUsados + " dias("+ (diasEstimados - diasUsados) + 
                    " dias menos que o estimado). "
                        + "\n Parabéns!");
        } else {
            System.out.println("Você estimou " + diasEstimados + " dias e a tarefa foi" +
                " feita em " + diasUsados + " dias."
                        + "\n Atendeu a estimativa com precisão!");
        }
    }
    
    public String getNomeAtividade() {
        return nomeAtividade;
    }


    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    @Override
    public String toString() {
        String fraseFormatada = String.format("\nNome da atividade: %s"
                + "\nResponsavel: %s "
                + "\nDias estimados: %d "
                + "\nDias usados: %d", nomeAtividade, responsavel,
                diasEstimados, diasUsados);
        
        return fraseFormatada;
    }
    
    
    
}
