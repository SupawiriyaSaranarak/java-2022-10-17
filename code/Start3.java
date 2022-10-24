
public class Start3 {
   public static void main (String[] data){
       int[] xxx = new int[1000000];
       for (int i = 0; i< xxx.length; i++) {
           xxx[i] = (int)(Math.random()*1000);
       }
       Engine engine = new Engine();
       engine.sort(xxx);
       boolean flag = true;
       for (int i =0; i<xxx.length-2; i++) {
           if (xxx[i]>xxx[i+1]) flag=false;
       }
       System.out.println(flag);
   } 
}
class Engine {
    void sort (int[] a) {
        sort(a,0,a.length-1);
    }
    void sort(int[] a, int left, int right){
        if (left >= right) return;
        // pivot located on the right hand side
        int pivot = a[right]; // random is better
        int lower = left, upper = right-1;
        int i = left;
        while (i <= upper){
            int compare =  a[i] - pivot; // three way comparison
            //this element is less than pivot
            if (compare < 0) { //if (a[i] < pivot) {}
            int t = a[lower];
            a[lower] = a[i];
            a[i] = t;
            i++;
            lower++;
            } 
            //this element is equal to pivot
            if (compare == 0) {i++;} //if (a[i] == pivot) {}
            // this element is grater than pivot
            if (compare > 0) { //if (a[i] > pivot) {}
            int t = a[upper];
            a[upper] = a[i];
            a[i] = t;
            upper--; // not complete, don't do i++
            } 
        }
        // exchange a[lower+1] and a[right]
        int t = a[lower];
        a[lower] = a[right];
        a[right] =t;
        // ------pppppp=====
        sort(a, left,lower-1);
        sort(a,upper+1,right);
    }
}
