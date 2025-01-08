import java.util.*;
public class PetAnimals{
public void eat(){
System.out.println("Eating...");
}
public static void main(String[] args){
PetAnimals ani=new PetAnimals();
ani.eat();
dog d=new dog();
d.bark();
puppy pup=new puppy();
pup.weep();
}
}
class dog extends PetAnimals{
public void bark(){
System.out.println("Barking...");
}
}
class puppy extends dog{
public void weep(){
System.out.println("Weeping...");
}
}


