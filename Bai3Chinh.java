import java.util.Scanner;
public class Bai1
{
    public static void main(String[] args)
    {
       int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Tong hai so la: " + (a+b));
        System.out.println("Hieu hai so la: " + (a-b));
        System.out.println("Tich hai so la: " + (a*b));
        System.out.println("Thuong hai so la: " + ((double)a/b));
        System.out.println("Chia lay du hai so la: " + (a%b));
        sc.close();

    }
}
