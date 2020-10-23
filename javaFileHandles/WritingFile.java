import java. io.FileWriter;
import java. io.IOException;

public class WritingFile {
 public static void main(String[] args) {

try{
FileWriter ibr= new FileWriter("tmp1.text");
ibr.write("this is the 1st time am trying java files did it once with bayo but the naija nigger sucks  tricky but fun");
ibr.close();

System.out.println(" i hope its succefully done");

}
catch (IOException e) {

System.out.println("an error occured");
e.printStackTrace();
// t's a method on Exception instances that prints the stack trace of the instance to System.err-we talking of e.printStackTrace.
}
}
}
