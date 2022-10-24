class Start {
    public static void main (String[] data) {
        System.out.println("Hello Java-17");
        int[] z = {2,9,9,3,5,6,7,4,7,9,3,7};
        int[] xx = printReverseEven (z);
        for (int j = 0; j < xx.length; j++) {
            System.out.println(xx[j]);
        };
        
    }
    public static int[] printReverseEven (int[] x) {
        int left = 0;
        int right = x.length -1;
        while (left <= right) {
            System.out.println("xxx");
            System.out.println(left);
            System.out.println(right);
            
            
            if (x[left] % 2 == 0 && x[right] % 2 == 0 ) {
                int a = x[left];
                int b = x[right];
                x[left] = b;
                x[right] = a;
                continue;
            }
            if (x[left] % 2 != 0 && x[right] % 2 == 0 ) {left++; continue;}
            if (x[left] % 2 == 0 && x[right] % 2 != 0 ) {right--; continue;}
            if (x[left] % 2 != 0 && x[right] % 2 != 0 ) {left++; right--; continue;}
        }
        
        return x;
    }
}