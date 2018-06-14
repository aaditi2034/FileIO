package testProject;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FileCopyDelete
{
	static void deleteFile()
	{
		File file = new File("D:\\ADITI\\languages\\internship_internity\\data.txt");
		if(file.exists())
		{
			if(file.delete())
				System.out.println("File Deleted");
		}
		else 
			System.out.println("File does not Exists");
	}
	
	static void copyFile()
	{
		Path source  = Paths.get("D:\\ADITI\\languages\\internship_internity\\data.txt");
		Path target = Paths.get("D:\\ADITI\\languages\\internship_internity\\data1.txt");
		try
		{
			Files.copy(source, target);
			System.out.println("File Copied");
		}
		catch(FileAlreadyExistsException ex)
		{
		    ex.printStackTrace();
		}
		catch (IOException e)
		{
		 		    e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		copyFile();
		deleteFile();
	}
}