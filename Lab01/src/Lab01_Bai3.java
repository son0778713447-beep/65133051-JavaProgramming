import java.util.Scanner;

public class Lab01_Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao canh cua mot khoi lap phuong");
        float canhLapPhuong = scanner.nextFloat();
        float theTichLapPhuong = canhLapPhuong*canhLapPhuong*canhLapPhuong;
        System.out.println("The tich cua khoi lap phuong: "+theTichLapPhuong);
    }
}
