public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
//        for (int i = 0; i <= 10; i++) {
//            int soChan = i * 2;
//            sum += soChan;
//        }
        while (i <= 10) {
            sum += i * 2;
            i++;
        }
        System.out.println("Tổng của 10 số chẵn đầu tiên là: " + sum);
    }
}

