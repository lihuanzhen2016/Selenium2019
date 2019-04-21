package ch09.dataproviderdemo;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TxtDataProvider {


	public Object[][] getTestDataByTxt(String fileName) {
		File file = new File(fileName);
		Object[][] data = null;
		FileInputStream fis = null;
		InputStreamReader isreader = null;
		BufferedReader breader = null;
		String record;
		try {
			fis = new FileInputStream(file);
			isreader = new InputStreamReader(fis, "UTF-8");
			// 设定utf-8,使用带缓冲区的字符输入流BufferedReader读取文件内容
			breader = new BufferedReader(isreader);
			int cols = 0;
			// 忽略第一行
			record = breader.readLine();
		
			List<Object []> datalist = new ArrayList<Object []>();
			// 遍历读取文件除第一行外的所有内容，储存在名为datalist的ArrayList中
			while ((record = breader.readLine()) != null) {
				String fields[]=record.split("\t");
				datalist.add(fields);
			}
			breader.close();
			data = new Object[datalist.size()][];
			for (int i = 0; i < datalist.size(); i++) {
				
			
					data[i]=datalist.get(i);
							}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;
	}

	
 

}
