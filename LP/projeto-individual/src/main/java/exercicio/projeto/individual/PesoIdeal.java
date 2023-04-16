/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.projeto.individual;

/**
 *
 * @author kanaiama
 */
public class PesoIdeal{
        String pesoIdealFeminino (Double altura){
        
        if(altura >= 1.50 && altura < 1.52 ) {
            return "Seu peso ideal é de 45-52";
        } else if (altura >= 1.52 && altura < 1.55) {
            return "Seu peso ideal é de 44-46";
        } else if (altura >=  1.55 && altura < 1.57) {
            return "Seu peso ideal é de 47-48";
        } else if (altura >= 1.57 && altura < 1.60) {
            return "Seu peso ideal é de 48-51";
        } else if (altura >= 1.60 && altura < 1.63) {
            return "Seu peso ideal é de 49-53";
        } else if (altura >= 1.63 && altura < 1.65) {
            return "Seu peso ideal é de 51-56";
        }else if (altura >= 1.65 && altura < 1.68) {
            return "Seu peso ideal é de 52-59";
        }else if (altura >= 1.68 && altura < 1.70) {
            return "Seu peso ideal é de 53-62";
        }else if (altura >= 1.70 && altura < 1.73) {
            return "Seu peso ideal é de 55-64";
        }else if (altura >= 1.73 && altura < 1.75) {
            return "Seu peso ideal é de 56-67";
        }else if (altura >= 1.75 && altura < 1.78) {
            return "Seu peso ideal é de 52-59";
        }else if (altura >= 1.78 && altura < 1.80) {
            return "Seu peso ideal é de 52-59";
        }else if (altura >= 1.80 && altura < 1.83) {
            return "Seu peso ideal é de 52-59";
        }else if (altura >= 1.83 && altura < 1.85) {
            return "Seu peso ideal é de 52-59";
        }else {
            return "Seu peso ideal é de 52-59";
        }
    }
    
        String pesoIdealMasculino (Double altura) {
        if(altura >= 1.57 && altura < 1.60) {
            return "Seu peso ideal é de 52-55";
        } else if (altura >= 1.60 && altura < 1.63) {
            return "Seu peso ideal é de 54-58";
        } else if (altura >=  1.63 && altura < 1.68) {
            return "Seu peso ideal é de 57-62";
        } else if (altura >= 1.68 && altura < 1.70) {
            return "Seu peso ideal é de 59-66";
        } else if (altura >= 1.70 && altura < 1.73) {
            return "Seu peso ideal é de 61-69";
        } else if (altura >= 1.73 && altura < 1.75) {
            return "Seu peso ideal é de 63-73";
        }else if (altura >= 1.75 && altura < 1.78) {
            return "Seu peso ideal é de 66-77";
        }else if (altura >= 1.78 && altura < 1.80) {
            return "Seu peso ideal é de 68-80";
        }else if (altura >= 1.80 && altura < 1.83) {
            return "Seu peso ideal é de 70-84";
        }else if (altura >= 1.83 && altura < 1.85) {
            return "Seu peso ideal é de 72-85";
        }else if (altura >= 1.85 && altura < 1.88) {
            return "Seu peso ideal é de 75-91";
        }else if (altura >= 1.88 && altura < 1.90) {
            return "Seu peso ideal é de 77-95";
        }else if (altura >= 1.90 && altura < 1.92) {
            return "Seu peso ideal é de 79-98";
        }else if (altura >= 1.92 && altura < 1.93) {
            return "Seu peso ideal é de 82-102";
        }else {
            return "Seu peso ideal é de 84-106";
        }
    }
}
