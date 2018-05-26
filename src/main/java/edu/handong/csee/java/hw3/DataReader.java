package edu.handong.csee.java.hw3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
	
public static void main(String args[]) { // main method
		
		DataReader dataReader = new DataReader();
		System.out.println(args[0]);
		
		dataReader.getData(args[0]); // get data from command line // #0 is it only way to get args[0] from CLI, with the main method containing getData method?
		// can't I divide main and DataReader and still get the args[0] data?
	
		// #1 how does this work?
	} // run as - run configuration - arguments - C:\Chat-Java-20180519T015546Z-001\Chat-Java (where the chat files are)
	
	public ArrayList<String> getData(String strDir) { // input is from args[0].
		// (1) get directory
		File myDir = getDirectory(strDir);

		// (2) get list of files from the directory
		File[] files = getListOfFilesFromDirectory(myDir);

		// (3) read strings from the file.
		ArrayList<String> messages = extractRawString(files);

		return messages;
	}

	private File getDirectory(String strDir) // input from args[0]
	{
		File myDirectory = new File(strDir);
		return myDirectory; // returns directory(location) of the file.
	}

	private File[] getListOfFilesFromDirectory(File dataDir) { // getting files from the directory.
		// dataDir.list();

		for (File file : dataDir.listFiles())
		{
			System.out.println(file.getAbsolutePath());
		}
		return dataDir.listFiles(); // returns an array of files. (Object type is File)
	}

	private ArrayList<String> extractRawString(File[] files) {
		
		ArrayList<String> messages = new ArrayList<String>(); // actual ArrayList<String> to get the raw strings.
		
		for (int i = 0; i<files.length ; i++)
		{
			String fileName = files[i].getAbsolutePath(); // transform the filename into String.
		
			try {
		         BufferedReader br = new BufferedReader(
		                  new InputStreamReader(
		                               new FileInputStream(fileName)));
		         String thisLine = null;
		         
		         while ((thisLine = br.readLine()) != null) { // while loop begins here
		            messages.add(thisLine);
		            //System.out.println(messages.get(i));
		            System.out.println(thisLine);
		         }
		         br.close();
		      } catch (IOException e) {
		         e.printStackTrace();
		      } // end while 
			
		}

		return messages; // returning the raw Strings, contained in the ArrayList<String>, named as 'messages'.
	}
	
}
