public class Quick extends ExamOfSort {
    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }
    public static void sort(Comparable[] a,int lo,int hi){
        if (hi<=lo)
            return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    /*
    * 先取a[lo]作为切分元素
    * 从数组左端开始向右扫描直到找到一个大于等于轴的元素
    * 再从数组右端开始向左扫描直到找到一个小于等于轴的元素，此时交换这两个元素的位置
    * 当两个指针相遇，把轴元素和左数组最右侧元素（a[j]）交换并返回j即可
    * */
    private static int partition(Comparable[] a, int lo, int hi) {
        int i=lo,j=hi+1;
        Comparable v=a[lo];//切分元素，轴
        while(true){
            while (less(a[++i],v))
                if (i==hi)
                    break;
            while (less(v,a[--j]))
                if (j==lo)
                    break;
            if (i>=j)
                break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }
}
