package com.email.validate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {

	public static void main(String[] args) {
		System.out.println("Email validation");
		Scanner s=new Scanner(System.in);
		String email=s.nextLine();
		Pattern pattern=Pattern.compile("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$");		
		Matcher matcher=pattern.matcher(email);
		
		boolean matchFound=matcher.find();
		if(matchFound)
		System.out.println("Valid");
		else
		System.out.println("Invalid");
		}
	}


