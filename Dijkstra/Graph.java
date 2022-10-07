
package Dijkstra;

/**
 *
 * @author bbbvv
 */
public class Graph {

    int[][] a;
    int n;
    char[] v; // chua ten dang chu cua dinh

    public Graph() {
        v = "ABCDEFGHIJKLMN".toCharArray();
    }

    //dung ma tran ke tu matran dau bai cho
    void setData(int[][] b) {
        n = b.length;
        int i, j;
        a = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = b[i][j];
            }
        }
    }//end set data

    void dispAdj() {
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.println();
            for (j = 0; j < n; j++) {
                System.out.printf("%5d", a[i][j]);
            }
        }
    }//end dispAdj

    void visit(int i) { //in ra ten dinh co chi so i
        System.out.print(v[i] + "  ");
    }

    void dijikstra(int fro, int to) {
        int INF = 99;
        boolean[] s = new boolean[n];
        int[] d = new int[n]; // d[i] la khoang cach tu dinh i den dinh  TRUOC
        int[] p = new int[n]; // p[i] dinh truoc dinh i
        int i, t, k;
        //khoi tao ban dau
        for (i = 0; i < n; i++) { // duyet tung dinh
            s[i] = false; // ban đầu là tất cả các đỉnh đều chưa được xét
            d[i] = a[fro][i]; //ban đầu đỉnh TRƯỚC của mọi đỉnh đều là fro 
            p[i] = fro; // tất cả các đỉnh đều nhận fro là đỉnh TRƯỚC
        }// khởi tạo xong
        s[fro] = true; // xét đỉnh đầu tiên (đỉnh xuất phát)
        while (true) {
            t = INF;// t chứa khoảng cách nhỏ nhất, ban đầu cho t = giá trị lớn nhất
            k = -1;
            for (i = 0; i < n; i++) {
                if (!s[i] && d[i] < t) {
                    t = d[i]; // tìm thấy giá trị nào nhỏ hơn t thì gán t vào
                    k = i; // cập nhật đỉnh mới
                }
            }// end for i , sau loop này k giữ chỉ số đỉnh có khoảng cách đến đỉnh xuất phát
            if (k == -1) {
                System.out.println("No solution");
                return;
            }
            s[k] = true; // xét đỉnh có khoảng cách đến đỉnh trước ( và cũng lầ đỉnh XUẤT PHÁT)
            if (k == to) { // nếu đỉnh này là đỉnh đích rồi thì kết thúc
                break;
            }
            for (i = 0; i < n; i++) {
                if (s[i] == true) { //nếu đã gặp đỉnh đc xét rồi thì bỏ qua
                    continue;
                }
                if (d[k] + a[k][i] < d[i]) {
                    d[i] = d[k] + a[k][i]; //cập nhật lại khoảng cách ở đỉnh đang xét nếu khoảng cách mới < khoảng cách hiện tại
                    p[i] = k;//giữ chỉ số đỉnh vửa đc cập nhật
                }
            }
        }//end while
//dưới đây là đoạn chương trình in ra khoảng cách là bao nhiêu và lộ trình như nào
        System.out.println("Shortest distance from the vertex " + v[fro] + " to the vertex " + v[to]);
        MyStack h = new MyStack();
        i = to;
        h.push(i);
        while (true) {
            i = p[i];
            h.push(i);
            if (i == fro) {
                break;
            }
        } // while day vao
        i = h.pop();
        System.out.print(v[i]);
        while (!h.isEmpty()) {
            i = h.pop();
            System.out.print(" -> " + v[i]);
        } //het while in ra
    } // end dijikstra
}

//end class graph
