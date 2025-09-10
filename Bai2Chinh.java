import java.util.Scanner;
public class Bai2Chinh 
{
    public static void main(String[] args) 
    {
        int tuoi;
        double chieucao;
        boolean c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi cua ban: ");
        tuoi = sc.nextInt();
        System.out.println("Nhap chieu cao cua ban (m): ");
        chieucao = sc.nextDouble();
        System.out.println("Ban co thich lap trinh khong?");
        c = sc.nextBoolean();
        System.out.println("Ten: " + name + "\nTuoi: " + tuoi + "\nChieu cao: " + chieucao + "\nThich lap trinh: " + c);
        sc.close();
    }
    
}
