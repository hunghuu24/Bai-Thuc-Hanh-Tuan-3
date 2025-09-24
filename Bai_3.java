import java.util.Scanner;
public class Bai_3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        int a=sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int b=sc.nextInt();
        System.out.println("Tong hai so la: "+(a+b));
        System.out.println("Hieu hai so la: "+(a-b));
        System.out.println("Tich hai so la: "+(a*b));
        System.out.println("Thuong hai so la: "+(a/b));
        System.out.println("Chia lay du hai so la: "+(a%b));
        sc.close();
    }
}
