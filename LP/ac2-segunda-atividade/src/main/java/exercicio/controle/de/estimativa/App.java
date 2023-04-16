package exercicio.controle.de.estimativa;

public class App {
    public static void main(String[] args) {
        Atividade ativ1 = new Atividade
        ("Pular", "Wilson", 10);
        
        Atividade ativ2 = new Atividade
        ("Estudar LP", "Didi", 2);
        
        Atividade ativ3 = new Atividade
        ("Rezar", "Natan", 1);
   
        ativ1.terminarAtividade(5);
        ativ2.terminarAtividade(8);
        ativ3.terminarAtividade(1);
        
        ativ1.exibirRelatorio();
        ativ2.exibirRelatorio();
        ativ3.exibirRelatorio();
        
        
        System.out.println(ativ1);
        System.out.println(ativ2);
        System.out.println(ativ3);
        
    }
}
