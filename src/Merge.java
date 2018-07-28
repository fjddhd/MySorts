public class Merge extends ExamOfSort {
    private static Comparable[] aux;//归并所需要的辅助数组
    public static void sort(Comparable[] a){
        aux=new Comparable[a.length];
        sort(a,0,a.length-1);
    }
    //重写版sort
    public static void sort(Comparable[] a,int lo,int hi){
        if (hi<=lo) return;//递归跳出条件
        int mid=lo+(lo+hi)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }
    public static void merge(Comparable[] a,int lo,int mid,int hi){//作用是利用辅助数组，把两个有序数组 原地 合并成一个有序数组
        int i=lo,j=mid+1;
        for (int k=lo;k<=hi;++k){
            aux[k]=a[k];
        }

        for (int k=lo;k<=hi;++k){
            if (i>mid)  a[k]=aux[j++];//左边用尽，取右边
            else if (j>hi)  a[k]=aux[i++];//右边用尽，取左边
            else if (less(aux[j],aux[i]))   a[k]=aux[j++];
            else a[k]=aux[i++];             //左右都没用尽的话，取那个小的
        }
    }
}
