
public class Start2 {
    public static void main (String[] data) {
        // 70 ,80, 72, 38, 45, 63,12,80,99
        int[] a = {70 ,80, 72, 38, 45, 63,12,80,99};
        Engine engine = new Engine() ;
        engine.partition(a,0,a.length-1);
        
    }
        
}
class Engine {
    int partition (int[] a, int left, int right) {
        //
        System.out.println(right);
        int pivot = a[left];
        int i = left + 1;
        int j = right;
        while (i<=j) {
            while (i <= j && a[i] <= pivot) i++;
            while (i <= j && a[j] >= pivot) j--;
            if (i<=j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
            
        }
        int t = a[left];
            a[left] = a[j];
            a[j] = t;
            return j;
         
    }
}
