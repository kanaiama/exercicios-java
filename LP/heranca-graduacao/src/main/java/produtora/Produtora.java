/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanaiama
 */
public class Produtora {
     private String nome;
    private Integer vagas;
    private List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }

    
    public Boolean existePorNome(String nome) {
        Boolean existsPorNome = false;
        
        if(nome != null) {
            for (Ator ator1 : atores) {
                if(ator1.getNome().equalsIgnoreCase(nome)) {
                    existsPorNome = true;
                }
            }            
        }
        
        return existsPorNome;
    }
    
    public void contratar(Ator a) {
         Integer validarContrato = 0;
         
         if(vagas > 0) {
            if(atores != null) {
                for (Ator ator1 : atores) {
                    if(ator1.getNome().
                            equalsIgnoreCase(a.getNome())) {
                        validarContrato++;
                    }
                }

                if(validarContrato == 0) {
                    atores.add(a);
                    vagas--;
                } 
            }
         } else {
             System.out.println("Sem vagas disponíveis!");
         }
    }
    
    public Integer getQuantidadeAtores() {
        return atores.size();
    }
    
    public Integer getQuantidadeProtagonistas() {
        Integer quantidadeAtores = 0;
        for (Ator ator1 : atores) {
            if(ator1 instanceof Protagonista) {
                quantidadeAtores++;
            }
        }
        
        return quantidadeAtores;
    }
    
    public Double getTotalSalarios() {
        Double totalSalario = 0.0;
        for (Ator ator1 : atores) {
            totalSalario += ator1.getSalario();
        }
        
        return totalSalario;
    }
    
    public Ator buscarAtorPorNome(String nome) {
        if(nome != null){
            for (Ator ator1 : atores) {
                if(ator1.getNome().equalsIgnoreCase(nome)) {
                    return ator1;
                }
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    @Override
    public String toString() {
        return String.format("- Produtora - "
                + "\nNome: %s"
                + "\nVagas: %d"
                + "\nAtores: %s",
                nome, vagas, atores);
    }

   
}
