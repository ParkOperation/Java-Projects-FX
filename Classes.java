import java.util.*;

public class Classes {
    static class Animal{
        private String Name;
        private int Height;
        private String Color;
        private int Weight;
        private String TrophicEcology;

    public Animal(String Name, int Height, String Color, int Weight, String TrophicEcology){
        this.Name = Name;
        this.Height = Height;
        this.Color = Color;
        this.Weight = Weight;
        this.TrophicEcology = TrophicEcology;
    }
    public void Eat(){
        System.out.println(this.Name + " is eating...");
    }
    public void HuntorGather(){
        if (TrophicEcology.equals("Herbivore")){
            System.out.println(this.Name + " is going out to gather.");
        }
        else{
            System.out.println(this.Name + " is going out to hunt.");
        }
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setWeight(int Weight){
        this.Weight = Weight;
    }
    }
    
    public static void main(String[] args) {
        Animal elephant = new Animal("Elephant", 100, "Black", 2000, "Herbivore");
        Animal jaguar = new Animal("Jaguar", 20, "Orange", 50, "Carnivore");

        jaguar.Eat();
        elephant.Eat();
        jaguar.HuntorGather();
        elephant.HuntorGather();
        System.out.println("Elephant Name: "+elephant.Name);
        System.out.println("Elephant Weight: "+elephant.Weight);
        elephant.setName("Mario");
        elephant.setWeight(2024);
        System.out.println("New elephant name: "+elephant.Name);
        System.out.println("New elephant weight: "+elephant.Weight);
        System.out.println("Jaguar weight: " + jaguar.Weight);
        System.out.println("Jaguar name: "+jaguar.Name);
        jaguar.setWeight(150);
        jaguar.setName("Carlos");
        System.out.println("New jaguar weight: "+jaguar.Weight);
        System.out.println("New jaguar name: "+jaguar.Name);

        jaguar = null;
        elephant = null;

    }
    
}
