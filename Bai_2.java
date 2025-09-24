import java.util.Scanner;

public class bai2giang {
    public static void main(String[] args) {
        // Khai báo các biến với các kiểu dữ liệu khác nhau
        String ten;
        int tuoi;
        double chieuCao;
        boolean thichLapTrinh;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        ten = scanner.nextLine();

        System.out.print("Nhap tuoi cua ban: ");
        tuoi = scanner.nextInt();

        System.out.print("Nhap chieu cao cua ban(m): ");
        chieuCao = scanner.nextDouble();

        System.out.print("Ban co thich lap trinh khong: ");
        thichLapTrinh = scanner.nextBoolean();
        scanner.close();
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Chieu cao: " + chieuCao + " m");
        System.out.println("Thich lap trinh: " + thichLapTrinh);
    }
}