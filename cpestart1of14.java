import java.util.Scanner;
public class cpestart1of14 {
    public static void main(String args[]){
        Scanner cin=new Scanner(System.in);
        int x=cin.nextInt();
        while(x!=0){
            int m=cin.nextInt();
            int n=cin.nextInt();
            counter(m, n);
        }
    }

    static void counter(int m, int n) {
        String[] week={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] month={0,10, 21, 7, 4, 9, 6, 11, 8, 5, 10, 7, 12};
        int index=(n-month[m])%7;
        index=index%7<0?index+7:index;
        System.out.println(week[index]);
    }
}