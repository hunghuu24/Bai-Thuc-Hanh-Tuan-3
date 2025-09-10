import java.util.Scanner;
public class vinhquangbai4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so tien gui: ");
        double tienGui= sc.nextDouble();
        System.out.print("Lai suat hang nam: ");
        double laiSuat= sc.nextDouble();
        System.out.print("So thang gui: ");
        int soThang= sc.nextInt();
        double tienLai= tienGui*laiSuat/100/12*soThang;
        System.out.printf("So tien lai sau %d thang la: %.2f", soThang, tienLai);
        double tiengoc= tienGui+tienLai;
        System.out.printf("\nSo tien goc sau %d thang la: %.2f", soThang, tiengoc);
        sc.close();
    }
}
