/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.primeiro.exercicio.relacionamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanaiama
 */
public class Carrinho {
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList();
    }
    
    public Integer getQuantidade() {
        return produtos.size();
    }
    
    public void adicionar(Produto p) {
        produtos.add(p);
    }
    
    public Boolean existsPorNome(String nome) {
        for (Produto produto : produtos) {
            if(produto.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public Integer getQuantidadePorCategoria(String nome) {
        Integer qtdTotal = 0;
        for (Produto produto : produtos) {
            if(produto.getCategoria().equals(nome)) {
                qtdTotal += 1;
            }
        }
        return qtdTotal;
    }
    
    public void limpar() {
        produtos.clear();
        System.out.println("\nCarrinho esvaziado!");
    }
    
    public void removerPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            
            if(produto.getNome().equals(nome)) {
                produtos.remove(i);
                i--;
                System.out.println("\nFoi removido produto: " + nome);
            }
        }
    }
        
    public List<Produto> getPorNome(String nome) {
        List<Produto> produtosEncontrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if(produto.getNome().equals(nome)) {
                produtosEncontrados.add(produto);
            }
        }
        return produtosEncontrados;
    }
    
    public Double getValorTotal() {
        Double valorTotal = 0.0;
        
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco() * this.getQuantidade();
        }
        return valorTotal;
    }

    //Getters and Setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return String.format("\nCarrinho-"
                + "\nCliente: %s"
                + "\nProdutos: %s ", cliente, produtos);
    }
    
    
    
}
