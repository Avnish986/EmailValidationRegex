package com.email.validate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {

	public static void main(String[] args) {
		System.out.println("Email validation");
		Scanner s=new Scanner(System.in);
		String email=s.nextLine();
		Pattern pattern=Pattern.compile("^[a-z A-Z]+([_+-.][a-z A-Z]+)*@{1}[a-z A-Z]+.{1}[a-z A-Z]{2}$");		
		Matcher matcher=pattern.matcher(email);
		
		boolean matchFound=matcher.find();
		if(matchFound)
		System.out.println("Valid");
		else
		System.out.println("Invalid");
		}
	}


