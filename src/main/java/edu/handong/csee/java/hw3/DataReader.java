package edu.handong.csee.java.hw3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
	
	
public static void main(String args[]) { // main method
		
		DataReader dataReader = new DataReader();
		dataReader.getData(args[0]); // get data from command line

	} // run as - run configuration - arguments - C:\Chat-Java-20180519T015546Z-001\Chat-Java (where the chat files are)
	


	
	public ArrayList<String> getData(String strDir) {
		// (1) get directory
		File myDir = getDirectory(strDir);

		// (2) get list of files from the directory
		File[] files = getListOfFilesFromDirectory(myDir);

		// (3) read strings from the file.
		ArrayList<String> messages = readFiles(files);

		return messages;
	}

	private File getDirectory(String strDir) // 디렉토리를 리턴해주는 메소드
	{
		File myDirectory = new File(strDir);
		return myDirectory;
	}

	private File[] getListOfFilesFromDirectory(File dataDir) {
		// dataDir.list(); // list()는 스트링 어레이를 리턴함. 근데 우리는 File[] 어레이를 원함.

		for (File file : dataDir.listFiles()) // 디렉토리 찾은걸 보여줌
		{
			System.out.println(file.getAbsolutePath());
		}
		return dataDir.listFiles(); // 이걸 찾던 것이다!
	}

	private ArrayList<String> readFiles(File[] files) {
		ArrayList<String> messages = new ArrayList<String>();
		
		String fileName = files[0].getName(); // args[0]에서 받아오는것과 같음
		System.out.println("FileName : " + fileName);
		
		Scanner inputStream = null;
		System.out.println("The file "+ fileName+"\ncontains the following lines : \n");
		
		try {
			inputStream = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println ("Error opening a file : "+fileName);
			System.exit(0);
		}
		
		while (inputStream.hasNextLine()) {
		
			String line = inputStream.nextLine();
			messages.add(line);
			System.out.println(line);
		}
		inputStream.close();
	
		
		return messages;
	}
	
	

}
