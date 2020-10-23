import java. io. File;
import java. io. IOException;
 /*
public class CreateFile2 {
 public static void main(String[] args) {

try {

File ibr=new File("/temp3.txt");
if (ibr.createNewFile()) {

System.out.println("created the 2nd file"  + ibr.getName());

} else {
System.out.println("file alredy exists");
}
}catch (IOException e) {

System.out.println("sorry there is an error");
e.printStackTrace();
}
}
}

*/
public class CreateFile2 {
  public static void main(String[] args) {
    try {
      File ibr = new File("filename1.txt");
      if (ibr.createNewFile()) {
        System.out.println(" the 2nd File created succefully: " + ibr.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
