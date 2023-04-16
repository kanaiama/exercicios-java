package exercicio.metodos;

public class Utilitario{
    // Retorno: esse não tem, é void
    // Nome: exibirLinha (camelCase
    // Argumentos: não tem, fica dentro dos ()
    // Corpo: fica dentro das {}
    
    public void exibirLinha() {

        System.out.println("--------*--------");
    }    
    
    public void exibirNome(String nomeExibir) {
        
        System.out.println("Meu nome é: " + nomeExibir);
    }
    
    //Métodos diferentes podem ter argumentos iguais
    //Pois eles nascem e morrem dentro do método
    public void exibirNomeFormatado(String nomeExibirFormatado) {
        
       exibirLinha();
       exibirNome(nomeExibirFormatado);
       exibirLinha();      

        System.out.println("\n");
    }
}