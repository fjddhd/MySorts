public class OptimizedInsertion extends ExamOfSort{
    public static void sort(Comparable[] a){
        int N=a.length;
        int exchanges = 0;
        for (int i = N-1; i > 0; i--) {//遍历一遍，先把相邻较大数换到右边//相当于加了一轮冒泡
            if (less(a[i], a[i-1])) {
                exch(a, i, i-1);
                exchanges++;
            }
        }
        if (exchanges == 0) return;

        for (int i = 2; i < N; i++) {
            Comparable v = a[i];
            int j = i;
            while (less(v, a[j-1])) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = v;
        }
    }
}
