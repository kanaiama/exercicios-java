package exercicio.primeiro.projeto.encapsulamento;


public class ContaBancaria {
    //Atributos = Características
    private Double saldo = 0.0;
    private String nomeTitular;
    
    //Métodos = Comportamentos
    void depositar(Double valorDeposito) {
        if(valorDeposito > 0.0) {
            saldo += valorDeposito;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
    void sacar(Double valorSaque) {
        if(valorSaque <= saldo && valorSaque > 0) {
            saldo -= valorSaque;
            System.out.println("Saque realizado!");
        }else {
            System.out.println("Valor inválido!");          
        }
    }
    
    
    //Usamos this para apontar qual é o atributo
    // util quando temos uma variável/argumentos com o mesmo nome do atributo

    
    //Alt + Insert para gerar
    public Double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
