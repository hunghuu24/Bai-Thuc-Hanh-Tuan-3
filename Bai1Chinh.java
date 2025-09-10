import java.util.Scanner;
public class nguyentanchinh 
{
    public static void main(String[] args) 
    {
        int tuoi;
        double chieucao;
        boolean c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        sc.close();
    }
}