package com.xworkz.examples;

import java.util.Scanner;

public class RemoveAndCountWhitespaces {

	public static void main(String[] args) {

		String str="Xworkz is a training institute";
		String s="";
		String revWord="";
		int count=0;
		for(char ch:str.toCharArray()) {
			if(ch==' ') {
				count+=1; //count=count+1
			}
			else {
				s+=ch; //s=s+ch
			}
		}
		System.out.println("white spaces:"+count);
		System.out.println("string wihtout white spaces:"+s);
		String s1[]=str.split(" ");
		Scanner sc=new Scanner(System.in);
		String rev=sc.next();
		String name="";
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals(rev)) {
				char ch[]=rev.toCharArray();
				for(int j=ch.length-1;j>=0;j--) {
					name=name+ch[j];
				}
			}
		}
		for(int i=0;i<s.length();i++) {
			if(s1[i].equals(rev)) {
				s1[i]=name;
			}
		}
		for(int i=0;i<s.length();i++) {
			System.out.println(s1[i]);
		}
		
			
		}
	

}
