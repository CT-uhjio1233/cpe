

import java.util.Scanner;
import java.math.BigInteger;;
public class cpe5 {
public static void multiple(BigInteger x) {
		String m="11";
		String z="0";
		BigInteger y=new BigInteger(m);
		BigInteger ze=new BigInteger(z);
		if(x.compareTo(ze)!=0) {
			if(x.mod(y).compareTo(ze)!=0) {
			System.out.println(x+" is not a multiple of 11.");
		    }
		   else {
			System.out.println(x+" is a multiple of 11.");
		   }
		}
	}
	public static void main(String arg[]) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()) {
		String n=cin.nextLine();		
		BigInteger x=new BigInteger(n);	
		multiple(x);
        }
        cin.close();
	}
}