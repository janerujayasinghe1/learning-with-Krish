
import java.util.Scanner;

public class Application{

public static void main(String []args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the distance");
   int distance = sc.nextInt();  
   Freddy f1 = new Freddy(); 
   f1.freddyCalculation(distance);

}
}
