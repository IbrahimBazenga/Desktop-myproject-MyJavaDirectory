import java.util.Scanner;

 public class Adminn { 
String  student,course;
String name,newStudentName;
 int idNo,newStudentId;
 String courseName,newCourseName;
 int courseCode,newCourseCode;

/*the 1st step is to register student and register courses also .*/
// in class admin we'll have four methods,adding student ,adding course $ removing student , removing course and finally going back.


Scanner ibraz = new Scanner(System.in); 
// the 1st step is to register student and register courses also .
void registerStudent() {
System.out.println("enter ur name please");
  name = ibraz.nextLine();
System.out.println("enter ur ID please");
  idNo = ibraz.nextInt();

}
// method register courses
void registerCourses() {
System.out.println("enter the courseName to register");
 courseName = ibraz.nextLine();
System.out.println("enter the course code");
 courseCode = ibraz.nextInt();
}

void displayStudents(){
System.out.println(name +   "," + idNo);
}
void displayCourses(){
System.out.println(courseName +   "," + courseCode);
 }
 
void  addStudent() {
/*System.out.println("add a student ");
student = ibraz.nextLine();*/

System.out.println("enter the name of the new student");
 newStudentName = ibraz.nextLine();
System.out.println("ente ID of knew student please");
  newStudentId = ibraz.nextInt();
}
//break;
//method add course
void  addCourse() {

System.out.println("enter the  new courseName you want to add");
newCourseName = ibraz.nextLine();
System.out.println("enter the course code for the new course");
 newCourseCode = ibraz.nextInt();

}
// display1 after u added new course and new students.
void display1() {
System.out.println(newStudentName+   "," + newStudentId); }
void display12() {
System.out.println(newCourseName +   "," + newCourseCode );}
/*void displayNewCourses() {
System.out.println(newCourseName +   "," + newCourseCode );*/




// method remove student
void removeStudent() {
//if (int input = name  ) {
System.out.println("enter the name of the student u wanna delete"); 
name = ibraz.nextLine(); 
System.out.println("enter the ID  of the student u wanna remove ");
  idNo = ibraz.nextInt();
   System.out.println(name +   "," + idNo);
 // }  else {
  /*System.out.println("enter the name of the student u wanna delete");*/
  //newStudentName = ibraz.nextLine();
  /*System.out.println("enter the ID  of the student u wanna remove ");
  newStudentId =ibraz.nextInt();*/
//}
}
//break;
//method remove course

void  removeCourse() {
System.out.println("enter the  new courseName you want to remove");
newCourseName = ibraz.nextLine();
System.out.println("enter the course code of the course u want to remove");
 newCourseCode = ibraz.nextInt();
 System.out.println("the student withdrew fromthe courses below");
System.out.println(newCourseName +   "," + newCourseCode ); 
}
//break;
}
// next we go to class student,
class Student {
String name;
int idNo;
String courseName;
int courseCode;
Scanner ibraz = new Scanner(System.in); 
 
}
// class course
class Course {
Course name;
Course idNo;
Scanner ibraz = new Scanner(System.in); 
 
}

class mainn{

   public static void main(String arg[]) {
 System.out.println( " hey! welcome dear Parent/Guardian to the new School regisration\n .Due to on going Corona Pandemic we moved our regisration online for th fall 2020-2021"); 
 //create instace for class admin and student
 Student st = new Student();
Adminn admn = new Adminn();
Course crs = new Course();
 int n,idNo,m,i,n1,m1,n2,m2; //n1 for new students and m1 for new courses,S for new student array,K for new courses array,n2 for deleted student and m2 for deleted courses,SS for new deleted student array and KK for deleted courses array;
 String name;
 String courseName;
int courseCode;
boolean yn;

 
 Scanner ibraz = new Scanner(System.in);
 
        
  int ch;
   do { 
 
 System.out.println("Main Menu\n1 Admin\n2 Student\n3 Exit the program ");
//int ch;
//do {
//while (ch != 3){
System.out.println("Ur Choice :"); 
ch = ibraz.nextInt();

   //do {
 switch (ch) {
 case 1: System.out.println("========================================================");
 System.out.println("You logged in as an Admin");
  System.out.println(" Register First(for registration insert zero)\n1. Add student\n2 add Course\n3 Remove Student\n4 Remove Course\n5 back");
 System.out.println("whats ur choice?");
  int input = ibraz.nextInt();
  
 if( input == 0) { 
 System.out.println("how many student do you want to register?");
 n=ibraz.nextInt();
 Adminn C[] = new Adminn[n];
  for ( i = 0; i < C.length; i++) {
   C[i] = new Adminn();
   C[i].registerStudent();
        }
        
        } 
         
    else if(input == 1) {
    
  System.out.println("how many students u want to add?:"); 
   n1=ibraz.nextInt();
 Adminn S[] = new Adminn[n1];
  for ( i = 0; i < S.length; i++) {
   S[i] = new Adminn();
   S[i].addStudent();
   
        }
        
        }
        
       // break;
   
  //case 3:
  else if(input == 2) {
 
  System.out.println("how many courses u want to add?:"); 
   m1=ibraz.nextInt();
 Adminn K[] = new Adminn[m1];
  for ( i = 0; i < K.length; i++) {
   K[i] = new Adminn();
   //K[i].addStudent();
   K[i].addCourse();
   
   }
   
   }
   //}
   
    //break;
 // display after new students and courses are added.
  //case 4:
 
   // the next thing is method remove for both student and course,i.e u delete them.
    
   // case 2:
  

 else if( input == 3) {
 
  System.out.println("how many students u want to remove from the list?:"); 
   n2=ibraz.nextInt();
 Adminn SS[] = new Adminn[n2];
  for ( i = 0; i < SS.length; i++) {
   SS[i] = new Adminn();
   SS[i].removeStudent();

        }
        }
        
        
  // removing courses permently
else if( input == 4) {

 System.out.println("how many courses u want to remove from the list?:"); 
   m2=ibraz.nextInt();
 Adminn KK[] = new Adminn[m2];
  for ( i = 0; i < KK.length; i++) {
   KK[i] = new Adminn();
   KK[i].removeCourse();

        } 
        }
        //}
      else  if (input == 5){
System.out.println(" going back to main menu");  } 
 //}
       
      break;  
  case 2: 
  System.out.println("you logged in as a student");  
  System.out.println("Student\n1 Register Courses\n2 show Courses\n3 withdraw Courses\n4 back "); 
  System.out.println("how many course do you want to take?");
 m=ibraz.nextInt();       
 Adminn A[] = new Adminn[m];
  for ( i = 0; i < A.length; i++) {
   A[i] = new Adminn();
   A[i].registerCourses(); }
   // showing the courses  
   
   System.out.println("registered courses are:");

  for ( i = 0; i < A.length; i++) {
       A[i].displayCourses();                      
          
        }
 // withdrawing courses       
System.out.println("how many courses u want to withdraw from ?:"); 
   int w =ibraz.nextInt();
 Adminn W[] = new Adminn[w];
  for ( i = 0; i < W.length; i++) {
   W[i] = new Adminn();
   W[i].removeCourse();

        }     
        
   }
           
   }     
        

while (ch != 3.0);
}
}








