package rased;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class farhat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Properties prob=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Maven\\raja\\razzak\\src\\main\\java\\rased\\faizul.properties");
		prob.load(fis);
		System.out.println(prob.getProperty("smoke"));
		System.out.println(prob.getProperty("integration"));
		prob.setProperty("Sanity", "Testing the main feather");
		FileOutputStream fos=new FileOutputStream("D:\\\\Maven\\\\raja\\\\razzak\\\\src\\\\main\\\\java\\\\rased\\\\faizul.properties");
		prob.store(fos, null);
	}

}
