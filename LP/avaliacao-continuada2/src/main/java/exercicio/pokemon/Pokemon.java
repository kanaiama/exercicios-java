/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.pokemon;

/**
 *
 * @author kanaiama
 */
public class Pokemon {
    String nome;
    String tipo;
    Double forca = 10.0;
    Integer doce = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoce() {
        return doce;
    }

    public void setDoce(Integer doce) {
        this.doce = doce;
    }
    
    
}
