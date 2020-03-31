package cpe;

import java.util.*;

public class cpestart1of10 {
	public static void main(String arg[]){
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()) {
			long y=cin.nextLong();
			if(y==0) {
				break;
			}
		    int z=0;
		    cases(y,z);
        }
        cin.close();
	}
	public static void cases(long y,long z) {
		while(y>0) {
			if(y>10) {
			  z+=y%10;
			  y/=10;
			}else {
				z+=y;
				y=0;
			}
		}
		if(z>=10) {
			y=z;
			z=0;
			cases(y,z);
		}else {
			System.out.println(z);
		}
	}
}