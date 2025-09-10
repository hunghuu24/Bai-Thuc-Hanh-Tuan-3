import java.util.Scanner;

public class bai4giang {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien gui: ");    
        double soTienGui = scanner.nextDouble();
        System.out.print("Nhap lai suat nam (%): ");
        double laiSuatNam = scanner.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int soThangGui = scanner.nextInt();
        double laiSuatThang = laiSuatNam / 100 / 12;
        double tongtiennhan = soTienGui * Math.pow(1 + laiSuatThang, soThangGui);
        double sotienlai = tongtiennhan - soTienGui;
        System.out.printf("Tong so tien nhan duoc sau %d thang la: %,.0f VND\n", soThangGui, tongtiennhan); 
        System.out.printf("So tien lai sau %d thang la: %,.0f VND\n", soThangGui, sotienlai);
        scanner.close();
    }
}
