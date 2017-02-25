package com.practice.designpatterns.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStreamClient {

	public static void main(String[] args) throws IOException{
			int c;
			try{
					InputStream in = new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("/home/mallesh/java0.log")));
					
						while((c = in.read()) >= 0) {
							System.out.print((char)c);
						}
					
			}catch(Exception ex){
				 ex.printStackTrace();
			}

	}

}
