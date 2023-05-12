/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.heranca.graduacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanaiama
 */
public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;
    
    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
    }
    
    public Boolean existePorNome(String nome) {
        Boolean existsPorNome = false;
        
        if(nome != null) {
            for (Desenvolvedor desenvolvedor1 : desenvolvedores) {
                if(desenvolvedor1.getNome().equalsIgnoreCase(nome)) {
                    existsPorNome = true;
                }
            }            
        }
        
        return existsPorNome;
    }
    
    public void contratar(Desenvolvedor d) {
         Integer validarContrato = 0;
         
         if(vagas > 0) {
            if(desenvolvedores != null) {
                for (Desenvolvedor desenvolvedor1 : desenvolvedores) {
                    if(desenvolvedor1.getNome().
                            equalsIgnoreCase(d.getNome())) {
                        validarContrato++;
                    }
                }

                if(validarContrato == 0) {
                    desenvolvedores.add(d);
                    vagas--;
                } 
            }
         } else {
             System.out.println("Sem vagas disponíveis!");
         }
    }
    
    public Integer getQuantidadeDesenvolvedores() {
        return desenvolvedores.size();
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer quantidadeDesenvolvedores = 0;
        for (Desenvolvedor desenvolvedor1 : desenvolvedores) {
            if(desenvolvedor1 instanceof DesevolvedorMobile) {
                quantidadeDesenvolvedores++;
            }
        }
        
        return quantidadeDesenvolvedores;
    }
    
    public Double getTotalSalarios() {
        Double totalSalario = 0.0;
        for (Desenvolvedor desenvolvedor1 : desenvolvedores) {
            totalSalario += desenvolvedor1.getSalario();
        }
        
        return totalSalario;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome) {
        if(nome != null){
            for (Desenvolvedor desenvolvedor1 : desenvolvedores) {
                if(desenvolvedor1.getNome().equalsIgnoreCase(nome)) {
                    return desenvolvedor1;
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

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }

    public void setDesenvolvedores(List<Desenvolvedor> desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }

    @Override
    public String toString() {
        return String.format("- Consultoria - "
                + "\nNome: %s"
                + "\nVagas: %d"
                + "\nDesenvolvedores: %s",
                nome, vagas, desenvolvedores);
    }
    
}
