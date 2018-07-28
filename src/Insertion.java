public class Insertion extends ExamOfSort{
    public static void sort(Comparable[] a){
        int N=a.length;
        for(int i=1;i<N;++i){
            //将a[i]插入到其位置之前的合适位置，一直保持i之前数组有序
            for (int j=i;j>0 && less(a[j],a[j-1]);--j){//把a[i]依次往前换直到换到合适的位置（不是最终的位置，只是让a[j]>=a[j-1]就停止了）
                exch(a,j,j-1);
            }
        }
    }
}
