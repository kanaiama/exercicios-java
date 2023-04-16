package exercicio.gestao.petshop;


public class App {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Xiao", "Pinscher"
                , 1, 50.0);
        
        PetShop petShop = new PetShop("AmigosPet");
        
        
        petShop.darBanho(pet1, 50.0);
        petShop.darBanho(pet1, 50.0, 5.0);
        
        System.out.println(petShop);
       
    }
}
