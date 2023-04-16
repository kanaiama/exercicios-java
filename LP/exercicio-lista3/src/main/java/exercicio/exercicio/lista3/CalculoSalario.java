package exercicio.exercicio.lista3;

public class CalculoSalario {
    
    Double calcularSalario(Double salarioDigitado) {
                
        return (salarioDigitado / 1045.0);
    }
    
    String devolverClasseSocial(Double salarioMinimo) {
    
        
        if(salarioMinimo >= 20900.0) {
            return "A"; 
        } else if(salarioMinimo >= 10450.0 && salarioMinimo <= 20900.0) {
            return "B";
        } else if(salarioMinimo >= 4180.0 && salarioMinimo <= 10450.0) {
            return"C";
        } else if(salarioMinimo >= 2090.0 && salarioMinimo <= 4180.0) {
            return "E";
        } else {
            return "D";
        }
    }
}