package exercicio.controle.de.estimativa;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {
        // Para criar uma lista,
        // usaremos um objeto do tipo ARrayList
        // Essa classe tem vários métodos que ajudam
        
        //Métodos mais usados:
        // add: adiciona objeto na lista
        // get: busca objeto pelo índice
        // size: retorna tamanho da lista
        // remove: remove por indice ou objeto
        
        //Estranha pq aceita qualquer tipo (nao e bom)
        List listaEstranha = new ArrayList();
        listaEstranha.add("Nathan");
        listaEstranha.add(42);
        listaEstranha.add(42.0);
        listaEstranha.add(false);
        
        System.out.println(listaEstranha);
        
        //Criando lista com tipo!
        List<String> nomes = new ArrayList();
        nomes.add("Bob");
        nomes.add("Maria");
        nomes.add("Nathan");
        nomes.add("Didi");
        nomes.add("Zeze");
        
        String terceiroNome = nomes.get(3);
        System.out.println("Nome do índice 3: " + terceiroNome);
        
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(
                    String.format("%dº nome: %s",
                            i, nomes.get(i)));
        }
        
        //Removendo o William
        nomes.remove("Didi");
        nomes.remove(3); // melhor esse!
        
        //Lista de objetos com nossas classes
        List<Atividade> atividades = new ArrayList();
        
        Atividade ativ1 = new Atividade
        ("Pular", "Wilson", 10);
        
        Atividade ativ2 = new Atividade
        ("Estudar LP", "Didi", 2);
        
        Atividade ativ3 = new Atividade
        ("Rezar", "Natan", 1);  
        
        atividades.add(ativ1);
        atividades.add(ativ2);
        atividades.add(ativ3);
        
        System.out.println("============================");
        
        //Exiba somente atividades com menos de 5 estimados
        System.out.println("Com for tradicional: ");
        for (int i = 0; i < atividades.size(); i++) {
            Atividade atividadeDaVez = atividades.get(i);
            
            if(atividadeDaVez.getDiasEstimados() <= 5) {
                System.out.println(atividadeDaVez);
            }
        }
        
        System.out.println("============================");
        //Enhanced for
        //Enhanced for para usar remove
        //Enhanced for não existe indice
        
        System.out.println("Com enhanced for: ");
        for (Atividade atividadeDaVez : atividades) {
            if(atividadeDaVez.getDiasEstimados() <= 5) {
                System.out.println(atividadeDaVez);
            }
        }
        
    }
}
