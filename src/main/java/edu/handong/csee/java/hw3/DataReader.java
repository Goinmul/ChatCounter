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

	private File getDirectory(String strDir) // ���丮�� �������ִ� �޼ҵ�
	{
		File myDirectory = new File(strDir);
		return myDirectory;
	}

	private File[] getListOfFilesFromDirectory(File dataDir) {
		// dataDir.list(); // list()�� ��Ʈ�� ��̸� ������. �ٵ� �츮�� File[] ��̸� ����.

		for (File file : dataDir.listFiles()) // ���丮 ã���� ������
		{
			System.out.println(file.getAbsolutePath());
		}
		return dataDir.listFiles(); // �̰� ã�� ���̴�!
	}

	private ArrayList<String> readFiles(File[] files) {
		ArrayList<String> messages = new ArrayList<String>();

		// some logic that read files must be here.
		// �� �κ��� ���� ä���ߵ�.
		
		
		return messages;
	}
	
	

}
