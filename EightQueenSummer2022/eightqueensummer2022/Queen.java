package eightqueensummer2022;

import java.util.Scanner;

public class Queen {

    int n, count=0;
    boolean a[], b[], c[];
    int x[];
    Scanner in;

    public Queen() {//ham tao lop hau
        x = new int[25]; // tao mang x de chua nghiem
        a = new boolean[50]; // tao mang a danh dau su an toan hay ko cua hang
        b = new boolean[50];//tao mang b danh dau su an toan hay ko cua DCDL
        c = new boolean[50];//tao mang c danh dau su an toan hay ko cua DCDX
        in = new Scanner(System.in);//bien chua kick thuoc cua ban co <= 25
    }

    void init() {
        int i;
        System.out.print(" n = "); // nhap vao kich thuoc ban bo
        n = in.nextInt();
        count = 0;
        for (i = 1; i <= n; i++) {
            a[i] = true; // cac hang deu an toan
        }
        for (i = 1; i <= 2 * n; i++) {
            b[i] = true; // cac DCDL deu an toan
        }
        for (i = 1; i <= 2 * n; i++) {
            c[i] = true; // cac DCDX deu an toan
        }
    }

    void result() { // in ra ket qua ( in ra mang x )
        int i;
        System.out.printf("\nSolution%3d : ", ++count);
        for (i = 1; i <= n; i++) {
            System.out.printf("%4d", x[i]);
        }
    }

    void test(int j) {
        int i = 0;
        do {//lan luot thu cac hang (1)
            i++;
            if (a[i] && b[j + 1] && c[i - j + n]) { // neu O(i,j) an toan
                x[j] = i;//đặt quân hậu j vào hàng i tức là O(i,j) ko còn an toàn nữa
                a[i] = false;
                b[i + j] = false;
                c[i - j + n] = false;
                if (j < n) {// Nếu j CHƯA là quân hậu cuối cùng
                    test(j + 1); // Thì thu quân hậu tiếp theo (ĐỆ QUY là ở đây)
                } else {
                    result();
                }
                //Cất quân hậu j đi ( quay lại )
                a[i] = true;
                b[i + j] = true;
                c[i - j + n] = true;
            }
        } while (i < n);
    }
} //end class Queen