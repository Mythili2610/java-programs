import java.util.*;
public class Pets{
public void eat(){
System.out.println("Eating...");
}
public static void main(String[] args){
Pets ani=new Pets();
ani.eat();
dog d=new dog();
d.bark();
cat c=new cat();
c.meow();
}
}
class dog extends Pets{
public void bark(){
System.out.println("Barking...");
}
}
class cat extends Pets{
public void meow(){
System.out.println("Meowing...");
}
}


