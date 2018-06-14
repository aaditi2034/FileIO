import java.io.*;
import java.util.*;
 
public class FileCopyDelete
{ 
    public static void main(String[] args) throws IOException 
    {
	try{
		System.IO.File.Copy("D:\\ADITI\\languages\\internship_internity\\data.txt", "D:\\ADITI\\languages\\internship_internity\\data1.txt", true);    
           }
	     else{System.out.println("File is not empty");}
        }catch(Exception e){System.out.println(e);}         
    }
}