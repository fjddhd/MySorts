public class Shell extends ExamOfSort {
    public static void sort(Comparable[] a){
        int len=a.length,h=1,k=3;
        while (h<len/k)
            h=h*3+1;
        while (h>=1){
            for (int i=h;i<len;++i){
                for (int j=i;j>=h && less(a[j],a[j-h]);j-=h)
                    exch(a,j,j-h);
            }
            h/=3;
        }
    }
}
