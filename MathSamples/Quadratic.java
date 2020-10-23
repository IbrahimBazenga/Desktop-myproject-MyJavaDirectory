import java.util.Scanner;
/* this sample code below tries to solve quadratic equation using java language.
its a polynomial of degree 2,there are several methods of solving but here we'll stick to the famous quadratic formulae 
author:Bazenga*/ 

class Quadratic {

public static void main(String arg[]) {
 //double a,b,c,x;
double det, firstRoot,secondRoot,root;
Scanner q = new Scanner(System.in);

System.out.println("enter the first element(ax^2)");
double a = q.nextDouble();


System.out.println("enter the second element(bx)");
double b= q.nextDouble();


System.out.println("enter the third element(c)");
double c= q.nextDouble();

System.out.println("the sumation of equation is");
double s= q.nextDouble();

System.out.println("the equation is ax^2 + bx + c = ?");

System.out.println(a+  "+"  + b +   "+"   +c +  "="  +s);

// use the quadratic formulae to get the values of 

det = (b*b)-(4*a*c);
if (det > 0) {

 firstRoot = (-b + Math.sqrt(det))/(2*a) ;  
 secondRoot = (-b -Math.sqrt(det))/(2*a);
System.out.println( "the value of  first root  is : " + firstRoot);

System.out.println( "the value of  second root  is : " + secondRoot);

}
else { if(det == 0){
root = (-b)/(2*a);
         System.out.println("Root is :: "+root);
}
}
}
}
