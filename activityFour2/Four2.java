package activityFour2;

import java.io.*;

public class Four2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	        try {
	            File file = new File("src/resource/newfile.txt");
	            boolean fStatus = file.createNewFile();
	            if(fStatus) {
	                System.out.println("File created successfully!");
	            } else {
	                System.out.println("File already exists at this path.");
	            }

	            //get the file Object
	            File fileUtil = FileUtils.getFile("src/resource/newfile.txt");
	            //Read file
	            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

	            //Create directory
	            File destDir = new File("resources");
	            //Copy file to directory
	            FileUtils.copyFileToDirectory(file, destDir);

	            //Get file from new directory
	            File newFile = FileUtils.getFile("newfile.txt");
	            //Read data from file
	            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
	            //Print it
	            System.out.println("Data in new file: " + newFileData);
	        } catch(IOException errMessage) {
	            System.out.println(errMessage);
	        }
	    }

	}
