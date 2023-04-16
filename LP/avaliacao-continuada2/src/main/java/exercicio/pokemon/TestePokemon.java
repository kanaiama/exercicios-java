/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.pokemon;

/**
 *
 * @author kanaiama
 */
public class TestePokemon {
    public static void main(String[] args) {
        Pokemon poke1 = new Pokemon();
        
        poke1.nome = "Charmander";
        poke1.tipo = "Fogo";
        poke1.forca = 5.0;
        
        Pokemon poke2 = new Pokemon();
        
        poke2.nome = "Vulpix";
        poke2.tipo = "Fogo";
        poke2.forca = 5.0;
        
        TreinadorPokemon treinar = new TreinadorPokemon();
        
        treinar.treinarPokemon(poke2);
        treinar.treinarPokemon(poke2);
        treinar.treinarPokemon(poke2);
        treinar.treinarPokemon(poke2);
        treinar.treinarPokemon(poke2);
        
        System.out.println(String.format
        ("Pokémon: %s "
                + "\nTipo: %s "
                + "\nForça: %.1f "
                + "\nQuantidade de Doces: %d",
                poke2.nome, poke2.tipo, poke2.forca,
                poke2.doce));
        
        System.out.println("-------------------------");
        treinar.evoluirPokemon("Ninetales", poke2);
        System.out.println("-------------------------");
        
        System.out.println(String.format
        ("Pokémon: %s "
                + "\nTipo: %s "
                + "\nForça: %.1f "
                + "\nQuantidade de Doces: %d",
                poke2.nome, poke2.tipo, poke2.forca,
                poke2.doce));
        
        
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("=============================");

        treinar.treinarPokemon(poke1);
        treinar.treinarPokemon(poke1);
        
        System.out.println(String.format
        ("Pokémon: %s "
                + "\nTipo: %s "
                + "\nForça: %.1f "
                + "\nQuantidade de Doces: %d",
                poke1.nome, poke1.tipo, poke1.forca,
                poke1.doce));
        
        System.out.println("-------------------------");
        treinar.evoluirPokemon("Charmeleon", poke1);
        System.out.println("-------------------------");
        
        System.out.println("=============================");

        System.out.println("Nome do treinador: " + treinar.nomeTreinador 
                + "\nNível: " + treinar.nivel);
    }
}
