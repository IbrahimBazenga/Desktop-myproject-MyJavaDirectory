import java.util .Scanner;

class BankSystem {

//  attributes which i decided to hide it.
private String name;
private String accno;
private long IDno;
private int initDeposit;// change all deposit to int
private long totalAmount;
private int newDeposit;
 private long balance;
 private long amt;

//getter methods


public String getName() {
return name;
}

public String getAccNo() {
return accno;
}

public long getIdNo() {
return IDno;
}


public int getInitDeposit() {
return initDeposit;
}

public long getTotalAmount() {
return totalAmount;
}

public int getNewDeposit() {
return newDeposit;
}


public long getBalance() {
return balance;
}


public long getAmt() {
return amt;
}

// setter methods

public void setName(String name){
this.name=name;
}

public void setAccNo(String accno) {
this.accno=accno;
}

public void setIdNo(long accno) {
this.IDno=IDno;
}

public void setInitDeposit(int initDeposit) {
this.initDeposit=initDeposit;
}

public void setTotalAmount(long totalAmount) {
this.totalAmount=totalAmount;
}

public void newDeposit(int newDeposit) {
this.newDeposit=newDeposit;
}

public void newBalance(long newBalance) {
this.balance=balance;
}


public void newAmt(long newAmt) {
this.amt=amt;
}

Scanner ibraz = new Scanner(System.in);
//1st method openning an account

void openAccount() {
System.out.println("enter ur name");
name=ibraz.next();

System.out.println("enter ur accno please");
accno=ibraz.next();

System.out.println("enter ur national ID please");
IDno=ibraz.nextLong();

System.out.println("enter your initial Deposit");
initDeposit=ibraz.nextInt();
}


// the  method displaying account details

void showAccount() {


System.out.println(name +  "," + accno + ","
+ IDno + "," + initDeposit);
}

//the method of adding and depositing more money

void deposit() {

System.out.println("enter your  newDeposit");
newDeposit=ibraz.nextInt();
totalAmount=initDeposit+newDeposit;
}

//the withdraw method
void withdraw() {
}
}

// xlass main
 class actualBank {

   public static void main(String arg[]) {

Scanner ibraz=new Scanner(System.in);

// create object for class Banksytem

BankSystem myobj= new BankSystem();


String name;
String accno;
long IDno;
 int initDeposit; 
int newDeposit;
long totalAmount;
long balance;
long amt;
int n;


System.out.println("==================");
System.out.println("1st step is to open an account");

System.out.println("how many customers do you intend to open an acccount for them?");
 n=ibraz.nextInt();
 BankSystem C[] = new BankSystem[n];
        for (int i = 1; i < C.length; i++) {
            C[i] = new BankSystem();
            C[i].openAccount();
        }


System.out.println("Enter Name: ");
        name = ibraz.next();
System.out.println("Enter Account No:");
        accno = ibraz.next();
System.out.println("Enter your national ID: ");
        IDno = ibraz.nextLong();
        System.out.println("Enter your initial deposit: ");
        initDeposit = ibraz.nextInt();
for (int i = 1; i < C.length; i++) {
            C[i] = new BankSystem();
            C[i].openAccount();
        }


// calling the show details method
System.out.println("===============");
System.out.println("the details of the bank account u opened is:");


myobj.showAccount();

 
System.out.println(name +  "," + accno + ","
+ IDno + "," + initDeposit);


       



// calling the deposit method /*long totalAmountlong balance; 
myobj.deposit();
System.out.println(" confirm  your newDeposit deposit");
newDeposit=ibraz.nextInt();
totalAmount=initDeposit + newDeposit ;
System.out.println("your total amount is " +totalAmount);

// calling the  withdrawal method

myobj.withdraw();
System.out.println(" enter the amount u intend to withdraw");
amt=ibraz.nextLong();
if ( totalAmount > amt ) { 
balance = totalAmount  - amt;
System.out.println(" withdraw succefull");
System.out.println(" the remaining balance in your account is " +balance);

} else {
System.out.println(" sorry, can't do the transaction");



}
}
}

















