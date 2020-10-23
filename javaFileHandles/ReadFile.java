import java. io .File;
import java. io .FileNotFoundException;// imprted to handle errors
import java.util.Scanner; //scanner to read txt fles

public class ReadFile {
public static void main(String[] args) {

try {
File ibr= new File("tmp1.text");
Scanner myReader=new Scanner(ibr);
while(myReader.hasNextLine()) {

String data= myReader.nextLine();
System.out.println(data);
}

myReader.close();
} catch(FileNotFoundException e) {

System.out.println("An error occured");

e.printStackTrace();
}
}
}
