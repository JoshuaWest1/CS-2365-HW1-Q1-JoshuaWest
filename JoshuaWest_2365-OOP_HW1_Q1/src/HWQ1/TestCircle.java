package HWQ1;
import java.util.Scanner;


public class TestCircle {  
   public static void main(String[] args) {

	   int loop = 0;//used for the while loop
	   double InputRadius = 0;//initializes the users input for radius
	   
	   while(loop == 0) {//beginning of while loop for Greater than 0 and less than 50
		   
	   Scanner UserRadius = new Scanner(System.in);//used for the user's input for radius
     
	    System.out.println("Enter a Radius Between 0.0 and 50.0");//informs the user of instruction

      InputRadius = UserRadius.nextDouble();//stores users radius variable
      
	   
      if(InputRadius > 0 && InputRadius < 50) { loop = 1;}//if radius fits into guidelines, end loop
      else {System.out.println("\nERROR TRY AGAIN\n");}
	   }
	   
	  
	   
      Circle c = new Circle(InputRadius);//creates new circle object
	   

      System.out.println("The circle has a"
      + "\n radius of \t\t "  + c.getRadius() 
      + "\n area of \t\t " + c.getArea()
      + "\n circumfrence of \t " + c.getCircumference());
      //outputs info about the circle
    
	   
   }
}