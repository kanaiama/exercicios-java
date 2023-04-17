/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.carros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanaiama
 */
public class App {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList();
        
        Carro carro1 = new Carro
        ("Civic", 120000.00, 2019, "Hyundai");
       
        carros.add(carro1);
        
        Carro carro2 = new Carro
        ("Santa Fé", 40000.00, 2013, "Hyundai");
       
        carros.add(carro2);
        
        Carro carro3 = new Carro
        ("Audi R3 Turbo", 100000.00, 2017, "Audi");
       
        carros.add(carro3);
        
        Carro carro4 = new Carro
        ("Golf GTI", 180000.00, 2021, "Volkswagen");
       
        carros.add(carro4);
        
        Carro carro5 = new Carro
        ("BMW X6", 755000.00, 2022, "BMW");
       
        carros.add(carro5);
        
        System.out.println("Carros com ano maior que 2018: ");
        
        for (Carro carro : carros) {
            if(carro.getAno() > 2018) {
                System.out.println("\nCarro - " + carro);
            }
        }
        System.out.println("=========================");
        System.out.println("Carros da Hyundai: ");
        
        for (Carro carro : carros) {
            if(carro.getMarca().equals("Hyundai")) {
                System.out.println(carro);
            }
        }
        System.out.println("=========================");
        System.out.println("Carros com o valor menor que 60.000: ");
        
        for (Carro carro : carros) {
            if(carro.getValor() < 60000) {
                System.out.println(carro);
            }
        }
    }
}
