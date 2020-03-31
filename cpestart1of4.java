package cpe;

import java.util.Scanner;
public class cpestart1of4 {
	private static int n(int a,int b) {
    int c,d = 0,f;
    if(a>b) {
    	f=b;
    	b=a;
    	a=f;
    }
    for(int i=a;i<=b;i++) {  			
   			int j=i;
   			c=1;		
   			while(j!=1) {			
   			switch(j%2) {
   			case 0:
   				j=j/2;
   				c++;
   				break;
   			case 1:
   				j=j*3+1;
   				c++;
   				break;
   			} 			
   		}
   			if(c>d) {
   				d=c;
   			} 			
   		}
    return d;
	}
	public static void main(String arg[]) {
		
		
	Scanner cin=new Scanner(System.in);
       while(cin.hasNext()) {
    	   int a = cin.nextInt(),b = cin.nextInt(),c = 0;
    	   c=n(a,b);		
   		   System.out.println(a+" "+b+" "+c);	
         }
         cin.close();
    }	
}