import java.util.*;
public class animal{
public void eat(){
System.out.println("Eating...");}
public static void main(String[] args){
animal ani=new animal();
ani.eat();
dog d=new dog();
d.bark();}}
class dog extends animal{
public void bark(){
System.out.println("Barking...");}
}

