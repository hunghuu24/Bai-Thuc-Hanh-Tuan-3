import java.util.Scanner;

public class bai3giang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen thu nhat: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so nguyen thu hai: ");
        int b = scanner.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = (b != 0) ? (double)a / b : Double.NaN;
        System.out.println("Tong: " + tong);
        System.out.println("Tieu: " + hieu);
        System.out.println("Tich: " + tich);
        if (b != 0) {
            System.out.println("Thuong: " + thuong);
        } else {
            System.out.println("Khong the chia cho 0.");
        }
        scanner.close();
    }
}