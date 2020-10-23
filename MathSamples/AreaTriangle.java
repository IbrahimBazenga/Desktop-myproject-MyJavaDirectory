import java.util.Scanner;

class AreaTriangle {
public static void main(String arg[]){

Scanner sc = new Scanner(System.in);

System.out.println("enter the base measurment of the triangle");
double b= sc.nextDouble();

System.out.println("enter the height measurment of the triangle");
double h= sc.nextDouble();
double area=((b)*(h))/(2);
System.out.println("the area of the triangle is "  +  area);
}
}

