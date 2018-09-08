public class Insertion extends ExamOfSort{
    public static void sort(Comparable[] a){
        int N=a.length;
        for(int i=1;i<N;++i){//将a[i]插入到其位置之前的合适位置，一直保持i之前数组有序
            for (int j=i;j>0 && less(a[j],a[j-1]);--j){
                /*
                * 把a[i]依次往前换直到换到合适的位置
                * 当j>0（因为循环中要用前一个元素） 且 j位置元素小于其前一个位置元素 时
                * j位置元素小于j前一个位置元素才会把两者位置交换
                * 过程类似冒泡
                * */
                exch(a,j,j-1);
            }
        }
    }
}
