import java.util.Scanner;

 public class Admin { 
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
 System.out.println("Below Students and thier respective courses are deleted permerntly from registration portal\n");
 System.out.println(name +   "," + idNo);
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

class main{

   public static void main(String arg[]) {
 System.out.println( " hey! welcome dear Parent/Guardian to the new School regisration\n .Due to on going Corona Pandemic we moved our regisration online for th fall 2020-2021"); 
 //create instace for class admin and student
 Student st = new Student();
Admin admn = new Admin();
 int n,idNo,m,i,n1,m1,n2,m2; //n1 for new students and m1 for new courses,S for new student array,K for new courses array,n2 for deleted student and m2 for deleted courses,SS for new deleted student array and KK for deleted courses array;
 String name;
 String courseName;
int courseCode;
boolean yn;

 
 Scanner ibraz = new Scanner(System.in);
 System.out.println("========================================================");
 System.out.println("how many student do you want to register?");
 n=ibraz.nextInt();
 Admin C[] = new Admin[n];
  for ( i = 0; i < C.length; i++) {
   C[i] = new Admin();
   C[i].registerStudent();
        } 
 
 System.out.println("how many course do you want to take?");
 m=ibraz.nextInt();       
 Admin A[] = new Admin[m];
  for ( i = 0; i < A.length; i++) {
   A[i] = new Admin();
   A[i].registerCourses();
        } 
        
  int ch;
   do {
 /*System.out.println("Main Menu\n1. Display All\n 2.  add a student\n 3. add a course\n 4. display1\n 5. remove student\n 6 . remove course\n 7 .Exit ");*/
 System.out.println("Main Menu\n1. Display All\n 2.update1(adding  new students and a courses and displaying them.)\n 3.Update2(removing students and withdrwaingcourses and displaying them)\n 4 .Exit the program ");

System.out.println("Ur Choice :"); 
ch = ibraz.nextInt();
 switch (ch) {
 case 1:
  System.out.println("registered students are:");
  for ( i = 0; i < C.length; i++) {
  C[i].displayStudents();
  }
  
    System.out.println("registered courses are:");

  for ( i = 0; i < A.length; i++) {
       A[i].displayCourses();                      
          
        }
     break;
   
  case 2:
  System.out.println("how many students u want to add?:"); 
   n1=ibraz.nextInt();
 Admin S[] = new Admin[n1];
  for ( i = 0; i < S.length; i++) {
   S[i] = new Admin();
   S[i].addStudent();
   
   
        }
       // break;
   
  //case 3:
  System.out.println("how many courses u want to add?:"); 
   m1=ibraz.nextInt();
 Admin K[] = new Admin[m1];
  for ( i = 0; i < K.length; i++) {
   K[i] = new Admin();
   //K[i].addStudent();
   K[i].addCourse();
   
   }
    //break;
 // display after new students and courses are added.
  //case 4:
  System.out.println(" the new registartion portal after update is "); 
  for ( i = 0; i < C.length; i++) {
  C[i].displayStudents();
  }
  for ( i = 0; i < A.length; i++) {
       A[i].displayCourses();                      
            }           
                         
 for ( i = 0; i < S.length; i++) 
 {
S[i].display1();
    }
for ( i = 0; i < K.length; i++) {
 K[i].display12(); 
   }   
       break;
   // the next thing is method remove for both student and course,i.e u delete them.
    
    case 3:
  System.out.println("the choice below deletes a number of students and thier courses permenently from the portal!!!\n Do you still want to continue delete? T/F");
  yn = ibraz.nextBoolean();
 if( yn ==true) {
 // yn = ibraz.nextBoolean();
 // if (true == Y ) {
 //yn = Y;
  System.out.println("how many students u want to remove from the list?:"); 
   n2=ibraz.nextInt();
 Admin SS[] = new Admin[n2];
  for ( i = 0; i < SS.length; i++) {
   SS[i] = new Admin();
   SS[i].removeStudent();

        }
        
        
  // removing courses permently
    System.out.println("how many courses u want to remove from the list?:"); 
   m2=ibraz.nextInt();
 Admin KK[] = new Admin[m2];
  for ( i = 0; i < KK.length; i++) {
   KK[i] = new Admin();
   KK[i].removeCourse();

        } 
        }    
  else{
 System.out.println("nothing has been deleted from the list");
        
        } 
        break;
   }
           
   }     
        
//call the methods.
//admn.registerStudent();
//admn.registerCourses();
/*admn.addStudent();
admn.addCourse();
admn.removeStudent();
admn.removeCourse() ;
//st.registerStudent();*/
while (ch != 4);
}
}








