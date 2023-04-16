/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.idade;

/**
 *
 * @author kanaiama
 */
public class Idade {
      
    public void classificaldade(Integer idade, String faixaEtaria) {
        
        if(idade >= 0 && idade <= 2) {
            faixaEtaria = "Bebê";
        } else if (idade <= 11) {
            faixaEtaria = "Criança";
        } else if (idade <= 19) {
            faixaEtaria = "Adolescente";
        } else if (idade <= 30) {
            faixaEtaria = "Jovem";
        } else if (idade <= 60) {
            faixaEtaria = "Adulto";
        } else {
            faixaEtaria = "Idoso";
        }
    }
}
