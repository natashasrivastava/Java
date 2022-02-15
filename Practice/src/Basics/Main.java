package Basics;

public class Main {
    static void printArmStrong(){
        for(int i=100;i<=999;i++)
        {
            int num = i;
            int ans =0;
            while(num>0)
            {
                int temp = num%10;
                ans += temp * temp*temp;
                num= num/10;
            }
            if(ans==i)
            {
                System.out.println(ans);
            }

        }

    }

    public static void main(String[] args) {
	    System.out.println("Hello World");
        System.out.println();
        int num = sumnum(20,30);
        System.out.println(num);
        System.out.println("Three digit Armstrong numbers are");
        printArmStrong();
        int x=3&5;
        int y = 3|5;
        System.out.println(x);
        System.out.println(y);

        int a=1;
        int b=2;
        int c = 3;
        a|=4;
        b>>=1;
        c<<=1;
        a^=c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);





    }

    private static int sumnum(int i, int i1) {
        return  i+i1;
    }
}
