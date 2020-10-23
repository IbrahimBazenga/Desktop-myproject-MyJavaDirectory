import java.util.Scanner;

class ElectricBills {
 public static void main(String arg[]) {

Scanner stima=new Scanner(System.in);

/*String customer;
double hourlyConsumption;
double dailyConsumption;
double totalConsumption;
double monthlyConsumption;*/

System.out.println("how much watts did the user consume per hour");
double hourlyConsumption=stima.nextDouble();
double dailyConsumption=(hourlyConsumption)*(24);
double monthlyConsumption= (dailyConsumption)*(30);
System.out.println("the watts cosumption per day is " + dailyConsumption);

System.out.println("the watts cosumption per month is " + monthlyConsumption);

double monthlyInKwh= (monthlyConsumption)/(1000);
System.out.println(" the total  monthly consumption in kWh is " + monthlyInKwh);

double totalCost= (monthlyInKwh)*(7);

System.out.println(" the total cost per month is " + totalCost);

}
}



