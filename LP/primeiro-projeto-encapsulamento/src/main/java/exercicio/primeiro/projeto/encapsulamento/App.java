package exercicio.primeiro.projeto.encapsulamento;

public class App {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNomeTitular("Wilson");

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNomeTitular("GiuGiu");

        conta1.depositar(10.0);
        conta2.sacar(10.0);
        conta2.depositar(20.0);
        conta2.sacar(2.0);

        System.out.println("C1 " + conta1.getSaldo());
        System.out.println("C2 " + conta2.getSaldo());
        
     
    }
}
