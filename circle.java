import java.util.Scanner;
public class Area_of_Circle {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the readius of circle:"); 
      int r= sc.nextInt();

        double pi = 3.141;
        double area = pi*(r*r);
        double perimeter=2*(pi*r);

        System.out.println("Area of a Circle:"+Area);
        System.out.println(" Perimeter of a circle: " + perimeter);
    }
}