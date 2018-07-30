public class Quick extends ExamOfSort {
    public static void sort(Comparable[] a){

    }
    public static void sort(Comparable[] a,int lo,int hi){
        if (hi<=lo)
            return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        
    }
}
