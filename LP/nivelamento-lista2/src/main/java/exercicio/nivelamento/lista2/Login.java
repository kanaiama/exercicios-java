package exercicio.nivelamento.lista2;

import java.util.Scanner;


public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        
        System.out.println("Digite seu login: ");
        String login = leitor.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senha = leitor.nextLine();
        
        
        do {
             System.out.println("Login e/ou senha inválido(s)!");
             System.out.println("Digite seu login: ");
             login = leitor.nextLine();
             
             System.out.println("Digite sua senha: ");
             senha = leitor.nextLine();
        }while(!"admin".equals(login) || !"#SPtech2022".equals(senha));
        
        System.out.println("Login realizado com sucesso!");
    }
}
