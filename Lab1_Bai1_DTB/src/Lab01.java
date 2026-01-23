import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        float diemTB = scanner.nextFloat();
        System.out.println("Ho va ten: "+hoTen);
        System.out.println("Diem trung binh: "+diemTB);
    }
}
