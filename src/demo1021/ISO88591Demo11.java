package demo1021;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ISO88591Demo11 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in,"ISO8859-1");
//		String s1=sc.nextLine();
//		System.out.print(s1+"");
		String s="张";
		byte bs[]=s.getBytes("utf-8");
		for(byte b:bs){
			System.out.print(b+" ");
					
		}
		System.out.println();
		String s8="å¼";
		byte bs8[]=s8.getBytes("ISO8859-1");
		for(byte b:bs8){
			System.out.println(b+" ");
					
		}
		
		
		System.out.printf("%c%c", 0xbc,0xe5);
		
		
		
		//System.out.println(Integer.parseInt("4f60", 16));

	}

}
