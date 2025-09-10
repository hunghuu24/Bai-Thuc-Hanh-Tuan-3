import java.util.Scanner;
public class vinhquangbai2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi cua ban: ");
        int age = sc.nextInt();
        System.out.print("Nhap chieu cao cua ban (cm): ");
        int height = sc.nextInt();
        System.out.print("co thich lap trinh khong? (y/n): ");
        char programmingInterest = sc.next().charAt(0);
        System.out.println("Thong tin cua ban:");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chieu cao: " + height + " cm");
        System.out.println("Thich lap trinh: " + (programmingInterest == 'y' ? "Co" : "Khong"));
    }
}
