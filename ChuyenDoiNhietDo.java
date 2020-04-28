package TH_ChuyenDoiNhietDoJava;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C;
        double F;
        int choice ;
        do {
            System.out.println("Menu");
            System.out.println("1: F->C");
            System.out.println("2: C->F");
            System.out.println("3: exit");
            System.out.println("enter your Choice");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập Nhiệt Độ C Muốn Đổi");
                    C=input.nextDouble();
                    System.out.println("Nhiệt Độ F : "+CSangF(C));
                    break;
                case 2:
                    System.out.println("Nhập Nhiệt Độ F Muốn Đổi");
                    F=input.nextDouble();
                    System.out.println("Nhiệt Độ C : "+FSangC(F));

                    break;
                case 0:
                   System.exit(0);
            }
        }while (choice != 0);

    }
    // khỏi tạo phương thức chuyển đổi C->F
    public static double CSangF(double C){
        double NhietDoF=(9.0 / 5) * C + 32;
        return NhietDoF;
    }
    public static double FSangC(double F){
        double NhietDoC= (5.0 / 9) * (F - 32);
        return NhietDoC;
    }
}
