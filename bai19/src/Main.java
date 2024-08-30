import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String chuoi = sc.nextLine();

        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Số lần kí tự 'a' xuất hiện: " + count);
        }
    }
