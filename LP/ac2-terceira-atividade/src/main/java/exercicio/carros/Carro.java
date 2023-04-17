package exercicio.carros;

public class Carro {
    private String modelo;
    private Double valor;
    private Integer ano;
    private String marca;

    public Carro(String modelo, Double valor, Integer ano, String marca) {
        this.modelo = modelo;
        this.valor = valor;
        this.ano = ano;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    

    @Override
    public String toString() {
        String fraseFormatada = 
                String.format("\nModelo: %s"
                        + "\nValor: %.2f"
                        + "\nAno: %d"
                        + "\nMarca: %s", modelo, valor, ano, marca);
       
        return fraseFormatada;
    }
    
    
    
}
