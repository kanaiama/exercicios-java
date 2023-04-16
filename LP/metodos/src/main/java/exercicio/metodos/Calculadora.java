package exercicio.metodos;

public class Calculadora {
    
    //Evitar colocar print do retorno dentro do próprio método
    //Isso pode me fazer esquecer de usar o retorno onde o método é chamado
    Integer somar(Integer num01, Integer num02) {
        return num01 + num02;
    }
    
    public void exibirSoma (Integer num01, Integer num02) {
        System.out.println(num01 + num02);
    }
    
    // subtrair
    // multiplicar
    // dividir
    
    Integer subtrair(Integer num01, Integer num02) {
        return num01 - num02;
    }
    
    Integer multiplicar(Integer num01, Integer num02) {
        return num01 * num02;
    }
    
    Double dividir(Double num01, Double num02) {
        return num01 / num02;
    }
    
    String retornaFraseAprovacao(Double nota) {
        if(nota >= 6) {
            return "Passou!";
        } else {
            return "Reprovou :(";
        }
    }
    
    Boolean isPar(Double numVerificar) {
        Boolean isPar;
        
//        if(numVerificar % 2 == 0) {
//            isPar = true;
//        } else {
//            isPar = false;
//        }
        //Assim também funciona
        
        isPar = numVerificar % 2 == 0;

        //Assim também funciona com uma linha:
        //return numVerificar % 2 == 0;
        
        return isPar;
    }
    
     Integer somar (Integer num01, Integer num02, Integer num03) {
        return num01 + num02 + num03;
    }
}
