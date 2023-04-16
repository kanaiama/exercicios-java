/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aulapratica1;

/**
 *
 * @author kanaiama
 */
public class Pessoa {

    private Integer codigo;
    private String nome;
    
    public Pessoa(int codigo, String nome) {
        this.codigo= codigo;
        this.nome= nome;
    }
    
    public Integer getCodigo() {
        return codigo;
    }
   
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
