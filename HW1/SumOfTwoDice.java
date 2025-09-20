import java.util.Scanner;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=(int) (Math.random()*6+1);
        int b=(int) (Math.random()*6+1);
        System.out.println(a+b);
    }
}
