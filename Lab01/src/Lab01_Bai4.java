import java.util.Scanner;

public class Lab01_Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap so c: ");
        int c = scanner.nextInt();
        float delta = b*b-4*a*c;
        System.out.println("Delta: "+delta);
        if(delta>0)
        {
            System.out.println("Can delta: "+Math.sqrt(delta));
        }
        else
            System.out.println("Delta am, khong co nghia khi can");
    }
}
