import java.util.Scanner;
public class Bai4Chinh 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien ban gui: ");
        double sotien = sc.nextDouble();
        System.out.println("Nhap lai suat hang nam: ");
        double laisuat = sc.nextDouble();
        System.out.println("Nhap so thang gui: ");
        int sothang = sc.nextInt();
        double tienlai = sotien * (laisuat / 100) * sothang / 12;
        double tongtien = sotien + tienlai;
        System.out.println("So tien ban gui: vnđ" + sotien);
        System.out.println("Lai suat hang nam: %" + laisuat);
        System.out.println("So thang gui: vnđ" + sothang);
        System.out.printf("Tien lai cuoi ky: %.2f\n vnđ", tienlai);
        System.out.printf("Tong tien goc cuoi ky: %.2f\n vnđ", tongtien);
        sc.close();
    }    
}
