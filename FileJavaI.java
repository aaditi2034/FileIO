import java.io.*;
import java.util.*;
 
public class FileJavaI
{ 
    public static void main(String[] args) throws IOException 
    {
	try{    
             FileInputStream fin=new FileInputStream("D:\\ADITI\\languages\\internship_internity\\data.txt");    
	     int i=0;
             while((i=fin.read())!=-1){
             	System.out.println((char)i);
	     }    
	     fin.close();
        }catch(Exception e){System.out.println(e);}         
    }
}