import java. io. File;

public class GetFileInfo {
 public static void main(String[] args) {

File ibr=new File("tmp1.text");

if (ibr.exists()) {

System.out.println("File name: " + ibr.getName());
System.out.println("Absolute path: " + ibr.getAbsolutePath());
System.out.println("Writable: " + ibr.canWrite());
System.out.println("Readable: " + ibr.canRead());
System.out.println("File size in bytes: " + ibr.length());
} else {
System.out.println("the file does not exist");

}
}
}
