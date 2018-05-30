package edu.handong.csee.java.hw3;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
public class DataWriter {
	
	public void writeAFile(ArrayList<String> lines, String targetFileName)
	{
		try {
			File file = new File(targetFileName);
			FileOutputStream fileOutStream = new FileOutputStream(file);
			DataOutputStream dataOutStream = new DataOutputStream(fileOutStream);
			
			for(String line :lines)
			{
				dataOutStream.write((line+"\n").getBytes());
			}
			dataOutStream.close();
			fileOutStream.close();
			
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
