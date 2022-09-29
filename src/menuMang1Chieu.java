import java.util.Scanner;

public class menuMang1Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int phanTuMang;
        do {
            System.out.println("Nhập số lượng phần tử (n) của mảng (n>0): ");
            phanTuMang = scanner.nextInt();
        } while (phanTuMang <= 0);

        int[] arrInt = new int[phanTuMang];
        do {
            System.out.println("*******************MENU*******************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử là số nguyên tố trong mảng ");
            System.out.println("4. In giá trị max, min các phần tử trong mảng");
            System.out.println("5. Sắp xếp mảng giảm dần");
            System.out.println("6. Thoát");
            System.out.println("Sự lựa chọn của bạn là: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập giá trị các phần tử mảng");
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.printf("Giá trị phần tử thứ %d là: ", i + 1);
                        arrInt[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử mảng là: ");
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.printf("%d\t", arrInt[i]);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("Các phần tử là số nguyên tố là: ");
                    for (int i = 0; i < arrInt.length; i++) {
                        if (arrInt[i]>=2){
                            for (int j = 2; j <arrInt[arrInt.length-1] ; j++) {
                                boolean check = false;
                                for (int k = 2; k <= Math.sqrt(j); k++) {
                                    if (j%k==0) {
                                        check = true;
                                        break;
                                    }
                                }
                                if (!check) {
                                    System.out.printf("%d\t",i);
                                }
                            }
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 4:
                    System.out.println("Giá trị max Là: ");
                    int max = arrInt[0];
                    for (int i = 0; i < arrInt.length; i++) {
                        if (max<arrInt[i]) {
                            max = arrInt[i];
                        }
                    }
                    System.out.printf("%d\n",max);
                    System.out.println("Giá trị min là: ");
                    int min = arrInt[0];
                    for (int i = 0; i < arrInt.length; i++) {
                        if (min>arrInt[i]) {
                            min =arrInt[i];
                        }
                    }
                    System.out.printf("%d\n",min);
                    break;
                case 5:
                    for (int i = 0; i < arrInt.length-1; i++) {
                        for (int j = i+1; j < arrInt.length; j++) {
                            if (arrInt[i]<arrInt[j]) {
                                int x = arrInt[i];
                                arrInt[i] = arrInt[j];
                                arrInt[j] = x;
                            }
                        }
                    }
                    System.out.println("Mảng giảm dần Là: ");
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.printf("%d\t",arrInt[i]);
                    }
                    System.out.printf("\n");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-6");
            }
        } while (true);
    }
}
