package edu.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader obj=new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter loc and pincode");
		String str=obj.readLine();
		System.out.println("Entered string is   "   +  str);

	}

}
