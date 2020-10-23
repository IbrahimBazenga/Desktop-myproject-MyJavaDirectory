import java.io.File;

public class GetInfoFile2 {
public static void main(String[] args){

File ibr=new File("filename2.txt");
if(ibr.exists()) {
System.out.println("File name: " +ibr.getName());
System.out.println("absolute path: " +ibr.getAbsolutePath());
System.out.println("Writable: " +ibr.canWrite());
System.out.println("Readable: " +ibr.canRead());
System.out.println("File size in bytes: " +ibr.length());
System.out.println("File list: " +ibr.list());
}
else {
System.out.println("File does not exist");
}
}
}
