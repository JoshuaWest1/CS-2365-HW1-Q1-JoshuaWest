package HWQ1;

public class Circle {  
   private double Radius;//Declares the Circles Variable Radius
 

   
   public Circle(double RadInput) {//Used to input the users Radius Input
	   Radius = RadInput;
	  
   }
   
   public double getRadius() {//is the function to output the radius
     return Radius; 
   }
   
   
   public double getArea() {//is the function to output the Area
      return Math.PI*(Radius*Radius);//used to find area from Pi(R^2)
   }
   
 
   public double getCircumference() {//is the function to output the Circumference
      return 2*Radius*Math.PI;//used to find Circumference 2R*Pi
   }
   
}