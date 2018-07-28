public class Bubble extends ExamOfSort{
    public static void sort(Comparable[] a){
        int N=a.length;
        for (int i=0;i<N-1;++i){//注意：最多N-1次
            boolean flag=false;
            for (int j=N-1;j>i;--j){
                if (less(a[j],a[j-1])){//出现逆序就交换，只要内循环交换过flag就为true
                    exch(a,j,j-1);
                    flag=true;
                }
            }
            if (flag==false){
                return;//如果一次外循环中内循环没执行过交换（没有逆序），表示已经有序，可以提前跳出外循环
            }
        }
    }
}
