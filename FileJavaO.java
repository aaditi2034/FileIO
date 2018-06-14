import java.io.*;
import java.util.*;
 
public class FileJavaO 
{ 
    public static void main(String[] args) throws IOException 
    {
	try{    
             FileOutputStream fout=new FileOutputStream("D:\\ADITI\\languages\\internship_internity\\data.txt");    
             String s="Welcome to the data.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
        }catch(Exception e){System.out.println(e);}         
    }
}