import java.util.Scanner;

class ArrayTrial {
public static void main(String arg[]) {


Scanner arr= new Scanner(System.in);

System.out.println("enter the lenght of the array");
 int length= arr.nextInt();
   int [] myArray = new int[length];

System.out.println("enter the elemnts of the array");
for (int i= 0; i < length; i++) {
 myArray[i]= arr.nextInt();


}


 int min = myArray[0];
 for (int i=0; i < myArray.length;i++){
 if (myArray[i] < min){
  min=myArray[i];
 
}
}

int max = myArray[0];
 for (int i=0; i < myArray.length;i++){
 if (myArray[i] > max){
  max=myArray[i];

}
}
int sum = 0;
//for (int i= 0; i > length; i++) {
for ( int i :myArray) {
sum = sum+i;
// myArray[i]= arr.nextInt();


}


System.out.println("The maximum no is " + max);
System.out.println("The minimum no is " + min);
System.out.println("The sumation of numbers is " + sum);
}
}


