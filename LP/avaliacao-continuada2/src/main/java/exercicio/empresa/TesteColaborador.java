package exercicio.empresa;

public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colab1 = new Colaborador();
        colab1.nome = "Giugiu";
        colab1.cargo = "Professora";
        colab1.salario = 100.0;
        
        
        Colaborador colab2 = new Colaborador();
        colab2.nome = "Wilson";
        colab2.cargo = "Assistente";
        colab2.salario = 110.0;
        
        RecursosHumanos rh = new RecursosHumanos();
        
        rh.setReajustarSalario(50.0, colab1);
        
        rh.setReajustarSalario(10.0, colab2);
        
        rh.setPromoverColaborador(colab1, "Diretora",
                180.0);
                
        rh.setPromoverColaborador(colab2, "Professor Titular",
                300.0);
        
        System.out.println("colab1: " + colab1.nome + " foi promovida para: "
                + colab1.cargo + " com salario atual de: " + colab1.salario);
        System.out.println("colab1: " + colab2.nome + " foi promovida para: "
                + colab2.cargo + " com salario atual de: " + colab2.salario);
        
        System.out.println("Total de promovidos: " + rh.totalPromovido);
        System.out.println("Total de salários reajustados: " + 
                rh.totalSalarioReajustado);

    }
}
