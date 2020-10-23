import java.util.Scanner;



class Simultanous {
public static void main(String arg[]) {
    double a1,a2,b1,b2,c1,c2,det,detx,dety,x,y;
    a1=2.0;
    a2=1.0;
    b1=3.0;
    b2=4.0;
    c1=9.0;
    c2=2.0;

 

Scanner sml= new Scanner(System.in);

System.out.println(" enter the 1st uknown of equation one(a1):");

a1= sml.nextDouble();
System.out.println(" enter the 2nd   uknown of equation one(b1):");
b1= sml.nextDouble();

System.out.println(" enter the sum of equation one(c1)");
c1= sml.nextDouble();


System.out.println(" enter the 1st uknown of equation two(a2):");
a2= sml.nextDouble();
System.out.println(" enter the 2nd   uknown of equation two(b2):");
b2= sml.nextDouble();
System.out.println(" enter the sum of equation two(c2)");
c2= sml.nextDouble();


System.out.println( "this is is how the equation looks like :");



System.out.println(a1 + "+"       +b1 + "="    + c1);


System.out.println(a2 +  "+"       +b2 +  "="   + c2);



 System.out.println( "a1 and b1 rep the unkown x and y respectively,the same applies for a2 and b2"); 


System.out.println( "calculating the value of x and y");


// calculating the value of x and y

if ((a1 == 0 && b1== 0 && c1== 0)||(a2 == 0 &&b2 == 0
&& c2==0)) {     // 0 x + 0 y = 0
    System.out.println("The equation has infinite solution\n"); }

  else
 if((a1==0&&b1==0&&c1!=0)||(a2==0&&b2==0&&c2!=0))  {
 System.out.println("The equation has no solution\n"); }
else
if (a1==0) {
 System.out.println("The equation has unique solution\n");
y=c1/b1;
x= (c2-b2*y) /a2;

System.out.println("The value of y is"  +y);
System.out.println("The value of x is"  +x);
}

 else 
if (a2==0) {
 System.out.println("The equation has infinite solution but\n");
y=c2/b2;
x=(c1-b1*y) /a1;

System.out.println("The value of y is"  +y);
System.out.println("The value of x is"  +x);

}

   else 
if(b1==0)
    {
    System.out.println("The equation has unique solution but\n"); 
        x=c1 / a1;
        y=(c2 - a2*x) / b2;
System.out.println("The value of y is"  +y);
System.out.println("The value of x is"  +x);


  
}

else 
if(b2==0)
    {
    System.out.println("The equation has unique solution but\n"); 
        x=c2 / a2;
        y=(c2 - a2*x) / b2;
System.out.println("The value of y is"  +y);
System.out.println("The value of x is"  +x);
} 
  
// if non of the above conditions is fullfilled then we try this

else {
/*if ((a1*n) >= 1 && (b1*n) >=1 && (a2*n) >=1
&& (b2*n) >=1) 
 {
 System.out.println("This is how we do it, baby\n");
x= (c1-(b1*n))/(a1*n);
//y= (c2- (n*a2)*(c1-b1)/(b2*a2*n*n));
*/


//  in matrix form:
    //  a1  b1  |  c1
    //  a2  b2  |  c2
    
    //  find determinant D:
    //  a1  b1
    //  a2  b2
    det = b1*a2 - a1*b2;
    
    //  find determinant Dx:
    //  c1  b1
    //  c2  b2

    detx=b1*c2 - b2*c1;
    
    x= detx/det;
    
    //  find determinant Dy:
    //  a1  c1
    //  a2  c2
    dety=c1*a2 - c2*a1;
    
    y=dety / det;
    
System.out.println("The value of y is"  +y);

System.out.println("The value of x is"  +x);
}


}

}













