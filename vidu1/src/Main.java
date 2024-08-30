import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int so1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int so2 = scanner.nextInt();

        int tong = so1 + so2;
        int hieu = so1 - so2;
        int tich = so1 * so2;
        double thuong = (double) so1 / so2;

        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        System.out.println("Thương: " + thuong);
    }
}