/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.pokemon;

/**
 *
 * @author kanaiama
 */
public class TreinadorPokemon {
    String nomeTreinador = "Wil";
    Integer nivel = 0;
    
    
    public void treinarPokemon(Pokemon poke) {
        poke.setForca(poke.getForca() * 1.10);
        poke.setDoce(poke.getDoce() + 10);
        
        nivel += 2;
    }
    
    public void evoluirPokemon(String nomeEvolucao, Pokemon poke) {
        
        if(poke.doce >= 50) {
            poke.setNome(nomeEvolucao);
            poke.doce -= 50;
            nivel += 10;
            poke.setForca(poke.getForca() * 2.0);
            System.out.println("Pokémon " + poke.nome + " evoluir para -> " +
                    nomeEvolucao);
        } else {
            System.out.println("Não foi possível realizar a operação");
        }
        
    }
    
}
