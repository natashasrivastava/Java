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




    }

    private static int sumnum(int i, int i1) {
        return  i+i1;
    }
}
