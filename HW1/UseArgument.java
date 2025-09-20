import java.util.Scanner;

public class UseArgument {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1=sc.next();
        String name2=sc.next();
        String name3=sc.next();

        System.out.println("Hi "+name3+", "+name2+", and "+name1);
    }
}
