package edu.handong.csee.java.hw3;

import java.io.File;
import java.util.ArrayList;

public class DataReader {

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

		// some logic that read files must be here.
		// 이 부분은 내가 채워야됨.
		
		
		return messages;
	}
	
	

}
