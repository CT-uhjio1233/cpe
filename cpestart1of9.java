package cpe;

import java.util.Scanner;

public class cpestart1of9 {
	public static void main(String[] args) {
	String st= "1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./'";
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()) {
		String input=cin.nextLine();
		char x[] =new char[input.length()];
		
		for(int i=0;i<input.length();i++) {
			
			for(int j=0;j<st.length();j++) {
				if(st.charAt(j)==input.charAt(i)&&input.charAt(i)!=32) {
				 x[i]=st.charAt(j-2);
				}
				else if(input.charAt(i)==32) {
					x[i]=32;
				}
				else if(input.charAt(i)>=65&&input.charAt(i)<=90){
					char p=(char) (input.charAt(i)+32);
					if(p==st.charAt(j)) {
						x[i]=st.charAt(j-2);
					}
				}
				
			
			}
			
		}
		for(int i=0;i<input.length();i++) {
			System.out.print(x[i]);
		}
		
    }
    cin.close();

}

}