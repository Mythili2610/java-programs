import java.util.Scanner;
public class ExceptionHandlingExample {
    public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
try{
System.out.print("Enter The First Numbers :");
int n1=Integer.parseInt(scanner.nextLine());
System.out.print("Enter The Second Numbers :");
int n2=Integer.parseInt(scanner.nextLine());
int result=n1/n2;
System.out.println("The Result is :"+result);
}catch(ArithmeticException e){
System.out.println("Error: Division by Zero is Not Allowed.");
}catch(NumberFormatException e){
System.out.println("Error: Invalid input. Please Enter a Valid Integer.");
}catch(Exception e){
System.out.println("An Unexpected Error Occurred:"+e.getMessage());
}finally{
scanner.close();
System.out.println("Program Execution Completed.");
}
}
}