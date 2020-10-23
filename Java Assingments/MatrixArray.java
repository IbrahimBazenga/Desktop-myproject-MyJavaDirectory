/*the program below is used to used to find the product of matrix(multi-dimensional array),where the program takes in values from the user and gaves him the answer.

author:Ibrahim bazenga */


import java.util.Scanner;
class MatrixArray {

public static void main(String args[]) {
int r1, r2,c1,c2,sum = 0; int k=0;
//A,B,C;  rows and column 
//A for the 1st matrix and B for 2nd Matrix and C for the final resultant matrix.
Scanner mat= new Scanner(System.in);
//int [][] myArray = new int[3][3];

System.out.println("enter the no rows u want for the 1st  matrix");
r1= mat.nextInt();
System.out.println("enter the no columns u want for the 1st  matrix");
c1= mat.nextInt();

System.out.println("enter the no rows u want for the 2nd  matrix");
r2= mat.nextInt();
System.out.println("enter the no columns u want for the 2nd  matrix");
c2= mat.nextInt();

int A[][] = new int[r1][c1];
  int B[][] = new int[r2][c2];
   int C[][] = new int[r1][c2];


//values for matrix A 

System.out.println("enter the values for the 1st matrix");
for(int i =0; i < r1;i++){
for(int j =0; j < c1;j++){
 A[i][j] = mat.nextInt();
  

}
}

// values for matrix B

System.out.println("enter the values for the 2nd matrix");
for(int i =0; i < r2;i++){
for(int j =0; j < c2;j++){
 B[i][j]=mat.nextInt();
 

}
}

// remember that rows of the 1st matrix must be equals to  the column of the 2nd matrix.so put the condition here.


if(r1!=c2 ) {
System.out.println("this cant happen ,the rows and the columns must be the same");

}
 
else {
System.out.println("the result is as follows");
for(int i=0; i< r1; i++){
for(int j =0; j < c2;j++) {
for ( k=0; k<r2; k++){

C[i][j] +=   A[i][k]*B[k][j];}
}
}
}
 //[sum = 0;

//int sum = 0;
//sum =  sum + A[i][k]*B[k][j];


 //C[i][j] = sum;
 //sum = 0;
for (int  i=0; i<r1; i++){
for (int j=0; j<c2;j++){
System.out.print(C[i][j]+" ");
//System.out.print(" the result is " + sum);
}
}


}
}



