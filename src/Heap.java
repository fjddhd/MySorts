public class Heap extends  ExamOfSort {
    //此处用了与优先队列不同的sink
    private static void sink(Comparable[] a,int k,int N){//下沉（自上而下调整），每N次下沉只需少于2N次比较和少于N次交换
        while(2*k<=N){
            int j=2*k;
            if (j<N && less(a[j],a[j+1]))//为了把更大的那个子节点换上去
                j++;
            if (!less(a[k],a[j]))
                break;
            exch(a,j,k);
            k=j;
        }
    }

    public static void sort(Comparable[] a){
        int N=a.length;
        for (int k=N/2;k>=1;k--){//构造堆
            sink(a,k,N);
        }
        //此时堆有序（每个节点大于等于其子节点，子节点间未必有序）
        while (N>1){//修复堆，把堆底元素换到堆底一次下沉
            exch(a,1,N--);
            sink(a,1,N);
        }
    }
}
