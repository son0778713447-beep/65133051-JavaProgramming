import java.util.Scanner;

public class Lab01_Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai hinh chu nhat: ");
        float chieuDai = scanner.nextFloat();
        System.out.println("Nhap chieu rong hinh chu nhat: ");
        float chieuRong = scanner.nextFloat();
        float chuVi = (chieuDai+chieuRong)*2;
        float dienTich = chieuDai * chieuRong;
        float canhNho = (chieuDai<chieuRong)? chieuDai:chieuRong;
        System.out.println("Chu vi hinh chu nhat: "+chuVi);
        System.out.println("Dien tich hinh chu nhat: "+dienTich);
        System.out.println("Canh nho hinh chu nhat: "+canhNho);
    }
}
