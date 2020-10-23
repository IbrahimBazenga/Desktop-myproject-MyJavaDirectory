import  java.io. FileWriter;
import java.io.IOException;

public class WriteOnFile2 {
public static void main(String[] args) {

try {

FileWriter ibr=new FileWriter("filename2.txt");
ibr.write("this is 2nd file am trying to create and write on it and even though files are bit challenging they are also fun");
ibr.close();
System.out.println(" i hope my 2nd writing on a file is succefull");
}
catch (IOException e) {

System.out.println("there is an error");
e.printStackTrace();
}
}
}

