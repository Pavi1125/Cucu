package com.Property_File;

import java.io.IOException;

public class Configuration_Helper {
	public Configuration_Helper() {
	}
public static Configuration_Reader getInstanceCR() throws IOException {
	Configuration_Reader r=new Configuration_Reader();
	return r;
}
public static Configuration_Helper getInstance() {
	Configuration_Helper h=new Configuration_Helper();
	return h;
}
}
