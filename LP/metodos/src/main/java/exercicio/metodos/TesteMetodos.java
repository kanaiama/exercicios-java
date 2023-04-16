package exercicio.metodos;

public class TesteMetodos{
    public static void main(String[] args) {
        
        // Para utilizar os métodos das nossas classes
        // Precisamos criar objetos
        // Ou seja, fazer uma instância
        
        Utilitario util = new Utilitario();
        Calculadora calc = new Calculadora();
        
        String nome01 = "Xampson";
        String nome02 = "Giuliana";
        
        util.exibirNomeFormatado(nome01);
        
        util.exibirNomeFormatado(nome02);
        
        System.out.println("Soma: ");
        
        Integer numDigitado = 10;
        Double numQuebrado = 10.0;
        
        Integer resultadoSoma = calc.somar(numDigitado, 32);
        System.out.println("Retorno com varíavel " + resultadoSoma);
        System.out.println("Direto no print" + calc.somar(numDigitado,32));
        
        Integer resultadoSubtrair = calc.subtrair(numDigitado, 32);
        System.out.println("Retorno com varíavel " + resultadoSubtrair);
         
        Integer resultadoMultiplicar = calc.multiplicar(numDigitado, 32);
        System.out.println("Retorno com varíavel " + resultadoMultiplicar);
         
        Double resultadoDividir = calc.dividir(numQuebrado, 10.0);
        System.out.println("Retorno com varíavel " + resultadoDividir);
            
        
        
    }
}
