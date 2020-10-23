import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadOnFile2 {
public static void main (String[] args) {

try {

File ibr=new File("filename2.txt");
Scanner myReader=new Scanner(ibr);
while (myReader.hasNextLine()) {

String data= myReader.nextLine();
System.out.println(data);
}
myReader.close();
}
catch (FileNotFoundException e) {
System.out.println("an eror occured");
e.printStackTrace();
}
}
}

