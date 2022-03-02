package com.Property_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws IOException {
		File f=new File("C:\\Users\\MY PC\\eclipse-workspace\\Adactin\\src\\main\\java\\com\\Property_File\\adactin.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getppath() {
		String ppath=p.getProperty("ppath");
		return ppath;
	}
	public String getUname() {
		String Uname=p.getProperty("Uname");
		return Uname;
	}
	public String getPass() {
	String Pass = p.getProperty("Pass");
	return Pass;
	}

}
