package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaUtil {
    
    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList<>();
    }

    public Integer count() {
        return inteiros.size();
    }
    
    public void add(Integer valor) {
       if(valor != null) {
            inteiros.add(valor);
       }
    }

    public void remove(Integer valor) {
       if(valor != null) {
        inteiros.remove(valor);
       }
    }

    public Integer countPares() {
        if(inteiros.isEmpty()){
            return 0;
        } else {
            Integer par = 0;
            for (int i = 0; i < inteiros.size(); i++) {
               Integer numeroAtual = inteiros.get(i);
               if(numeroAtual % 2 == 0) {
                   par++;
                }
            }
            return par;
        }
    }

    public Integer countImpares() {
        if(inteiros.isEmpty()){
            return 0;
        } else {
            Integer impar = 0;
            for (int i = 0; i < inteiros.size(); i++) {
               Integer numeroAtual = inteiros.get(i);
               if(numeroAtual % 2 == 1) {
                   impar++;
                }
            }
            return impar;
        }            
    }

    public Integer somar() {
        if(inteiros.isEmpty()){
            return 0;
        } else {
            Integer somaTotal = 0;
            for (Integer inteiro : inteiros) {
                somaTotal += inteiro;
            }
            return somaTotal;
        }         
    }

    public Integer getMaior() {
       if(inteiros.isEmpty()){
            return 0;
        } else {
           Integer maior = inteiros.get(0);
           for (Integer inteiro : inteiros) {
               if(inteiro > maior) {
                   maior = inteiro;
               }
           }
           return maior;
       }
    }

    public Integer getMenor() {
        if(inteiros.isEmpty()){
            return 0;
        } else {
           Integer menor = inteiros.get(0);
           for (Integer inteiro : inteiros) {
               if(inteiro < menor) {
                   menor = inteiro;
               }
           }
           return menor;
       }
    }

    public Boolean hasDuplicidade() {
        Boolean verificar = false;
        for (int i = 0; i < inteiros.size(); i++) {
            for (int j = 0; j < inteiros.size(); j++) {
                if(Objects.equals(inteiros.get(i), inteiros.get(j)) && i != j) {
                    verificar = true;
                }
            }
        }
        return verificar;
    }
}
