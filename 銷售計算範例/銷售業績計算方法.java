public class 銷售業績計算方法 {
    public Object 計算方法;
    //關於銷售計算的專用方法
    //印出 需顯示內容
    void 印出(int[]價格,int[][]總數,int 總額[],int 最佳員工,double ach[]){
        System.out.print("價格總數:");
        for (int i = 0; i < 價格.length; i++) {
           System.out.print(" "+價格[i]);
        }
        System.out.println();
        for (int i = 0; i < 總數.length; i++) {
            System.out.print("銷售員"+(i+1));
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+總數[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("銷售員 " + (i + 1) + ": 業績金額 = " + 總額[i] + ", 達成比率 = " + ach[i]);
        }
        System.out.println("業績最好的是銷售員" + 最佳員工);
     }
     //每一位銷售員的銷售總額
     public int[] 總額(int[]to,int[]pr,int[][]sa){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                to[i] = to[i] + pr[j] * sa[i][j];
            }
        }
        return to;
     }
     //業績達標%數
     public double[] 達標比率(double ach[],int[] to){
        for (int i = 0; i < 3; i++) 
            ach[i] = (double) to[i] / 10000 * 100;
     return ach;
     }
     //最好的員工
     public int 好的銷售員(int be,int to[]){
        int maxSales = 0;
        for (int i = 0; i < 3; i++) {
            if (to[i] > maxSales) {
                maxSales = to[i];
                be = i + 1;
            }
        }
        return be;
    }
    /**
     * Inner銷售業績計算方法
     */
    public class Inner銷售業績計算方法 {
    
        
    }
}
