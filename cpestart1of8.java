
import java.util.*;

public class cpestart1of8 {
	public static void main(String arg[]) {
        Scanner cin=new Scanner(System.in);
		String st=cin.nextLine();
		int cases=Integer.parseInt(st);
		
		int f[]=new int[26];
		for(int i=0;i<26;i++) {
			f[i]=0;
		}
		
		
		for(int i=0;i<cases;i++) {		
		String input=cin.nextLine();
		for(int j=0;j<input.length();j++) {
			if(input.charAt(j)>=65 &&input.charAt(j)<=90) {
				f[input.charAt(j)-65]++;
			}else if(input.charAt(j)>=97&&input.charAt(j)<=122){
				f[input.charAt(j)-97]++;
			}
		}
		}
		
		int max=0;
		for(int i=0;i<26;i++) {
			if(f[i]>max)max=f[i];
		}
		
		for(int i=max;i>0;i--) {
			for(int j=0;j<26;j++) {
				if(f[j]==i)System.out.println((char)(j+65)+" "+i);
			}
		}
		
	cin.close();
	}
}