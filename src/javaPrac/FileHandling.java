package javaPrac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import org.apache.commons.io.FileUtils;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

         // Reading and wrtting files should be done by bufferread and bufferWrite , can also be done by Fileouptustream and fileinoutstream butthey cant read it line by line instead rewads it characterwise
		//fileinoutstream but

		
		
		// Creation of folder
		File folder = new File("C:\\Users\\Jit\\Desktop\\Selenium\\Autofolder");

		// If the folder does not exist then create it

		if (!folder.exists()) {

			if (folder.mkdir()) {

				System.out.println("Directory is created!");

			} 
			else {

				System.out.println("Failed to create directory!");
				//folder.delete();
			}
		}

		// Creation of Sub folders

		File subFolders = new File("C:\\Users\\Jit\\Desktop\\Selenium\\Autofolder\\Subfolder\\Subfolder1\\Subfoldr2");
		
		if (!subFolders.exists()) {

			if (subFolders.mkdirs()) { // even if Autofolder,Subfolder,Subfolder1,Subfoldr2 does not exist it will create these folders one by one 

				System.out.println("Multiple directories are created!");

			} else {

				System.out.println("Failed to create multiple directories!");

			}
		}

		
		//Moving  files - this is not working
		//Move the file from - C:/Javaseleniumworld/Code.txt to - C:/QTPworld/Code.txt
/*
		File from = new File("C:\\Users\\Jit\\Desktop\\Selenium\\Fromfolder");

		File to = new File("C:\\Users\\Jit\\Desktop\\Selenium\\Tofolder");

		//Rename

		if (from.renameTo(to))

		System.out.println("Successfully Moved the file");

		else

		System.out.println("Error while moving the file");
*/
		
		//Copying files and mvoing files are all done with the FileUtils its easy
		//1st Way
	//	Files.copy(from.toPath(),to.toPath()); // thi worls only in Java 7
		
		File fromFile = new File("C:\\Users\\Jit\\Desktop\\Selenium\\Fromfolder\\FileHandling part1.docx");
		File fromFile2 = new File("C:\\Users\\Jit\\Desktop\\Selenium\\Fromfolder\\FileHandling part2.docx");
		File toFolder = new File("C:\\Users\\Jit\\Desktop\\Selenium\\Tofolder");
		File toFile = new File("C:\\Users\\Jit\\Desktop\\Selenium\\Tofolder\\Tofile.docx");
		File moveFile = new File("C:\\Users\\Jit\\Desktop\\Selenium\\Fromfolder\\MoveFile.docx");
		File toMoveFolder = new File("C:\\Users\\Jit\\Desktop\\Selenium\\ToMovefolder");
		
		FileUtils.copyFileToDirectory(fromFile,toFolder); // copies one file from one folder into another
		FileUtils.copyFile(fromFile2,toFile); // copies one file with another name 
		FileUtils.moveFileToDirectory(moveFile,toMoveFolder,true); // nboth this and moveToDirecory works the same
		FileUtils.moveToDirectory(moveFile, toMoveFolder, true);
		
		
		

		}

}
