public class Selection extends ExamOfSort {
    public static void sort(Comparable[] a){
        int N=a.length;
        for (int i=0;i<N;++i){//将a[i]和a[i+1,...,N]中的最小元素交换，每次确定一个元素（即下标为i的）的位置
            int min=i;//用于标记位置 i以及i之后 的数组后面部分的最少小元素索引
            for (int j=i+1;j<N;++j)
                if (less(a[j],a[min]))
                    min=j;
            exch(a,i,min);
        }
    }
}
