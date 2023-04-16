/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicio.correcao.exercicio.metodo.marco;

/**
 *
 * @author kanaiama
 */
public class ClasseSocial {
    Double calcularQtdSalario(Double renda) {
        return renda / 1045.0;        
    }
    
    Double calcularQtdSalario(Double renda, Double salarioMinimo) {
        return salarioMinimo / renda;
    }
    
    String classificarClasseSocial(Double qtdSalarios) {
    
        
        if(qtdSalarios > 20.0) {
            return "A"; 
        } else if(qtdSalarios >= 10.0 && qtdSalarios <= 20.0) {
            return "B";
        } else if(qtdSalarios >= 4.0 && qtdSalarios < 10.0) {
            return"C";
        } else if(qtdSalarios >= 2.0 && qtdSalarios < 4.0) {
            return "D";
        } else {
            return "E";
        }
    }
    
    void exibirRelatorioClasseSocial(Double renda) {
        Double qtdSalario = calcularQtdSalario(renda);
        String classeSocial = classificarClasseSocial(qtdSalario);
        
        System.out.println(String.format(
        "Você recebe aproximadamnete %.1f sálarios-mínimos. \n" +
                "Você pertence a classe social %s.",
                 qtdSalario, classeSocial));
    }
}
