import java.util.Scanner;

public class menuMang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soHang, soCot;
        do {
            System.out.println("Nhập ma trận vuông (số hàng = số cột)");
            System.out.println("Nhập số hàng N cho mảng ( N >0): ");
            soHang = scanner.nextInt();
            System.out.println("Nhập số cột N cho mảng ( N >0): ");
            soCot = scanner.nextInt();
        } while (soHang <= 0 || soCot <= 0 || soHang!=soCot);

        int[][] mang2Chieu = new int[soHang][soCot];

        do {
            System.out.println("*********************MENU*********************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử của mảng theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng");
            System.out.println("4. Sắp xếp mảng tăng dần theo cột");
            System.out.println("5. Thoát");
            System.out.println("Sự lựa chọn của bạn là: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập các phần tử của mảng: \n");
                    for (int i = 0; i < soHang; i++) {
                        for (int j = 0; j < soCot; j++) {
                            System.out.printf("Giá trị phần tử tại hàng %d và cột %d là: ", i + 1, j + 1);
                            mang2Chieu[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mảng 2 chiều là: ");
                    for (int i = 0; i < soHang; i++) {
                        for (int j = 0; j < soCot; j++) {
                            System.out.printf("%d\t", mang2Chieu[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                        System.out.println("Giá trị các phần tử nằm trên chéo chính là: ");
                        int sumCheoChinh = 0;
                        for (int i = 0; i < soHang; i++) {
                            for (int j = 0; j < soCot; j++) {
                                if (i==j) {
                                    System.out.printf("%d\t",mang2Chieu[i][j]);
                                    sumCheoChinh += mang2Chieu[i][j];
                                }
                            }
                        }
                        System.out.println("\nTổng các số ở đường chéo chính là: ");
                        System.out.printf("%d",sumCheoChinh);
                        System.out.printf("\n");

                        System.out.println("Giá trị các phần tử nằm trên chéo phụ là: ");
                        int sumCheoPhu = 0;
                        for (int i = 0; i < soHang; i++) {
                            for (int j = 0; j < soCot; j++) {
                                if (i+j==soHang-1) {
                                    System.out.printf("%d\t",mang2Chieu[i][soHang-1-i]);
                                    sumCheoPhu += mang2Chieu[i][soHang-1-i];
                                }
                            }
                        }
                        System.out.println("\nTổng các số ở đường chéo phụ là: ");
                        System.out.printf("%d",sumCheoPhu);
                        System.out.printf("\n");
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-5");
            }
        } while (true);
    }
}
