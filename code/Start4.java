
public class Start4 {
    public static void main (String[] data){
        int[] a = {8,3,5,2,1,7,4,1,3};
        Platform p = new Platform();
        Element first = p.create(a);
//        p.sort(a);
        p.print(first);
    }
    
}
class Platform {
    void cut (Element e) {
       
    }
    void print (Element e) {
        for (Element current =e; current != null; current = current.next) {
            System.out.println(current.value);
        }
    }
    Element create (int[] a){
        if (a.length == 0) return null;
        Element head = new Element();
        head.value = a[0];
        Element tail = head;
        for (int i=1; i<a.length; i++) {
            Element e = new Element();
            e.value = a[i];
            tail.next = e;
            tail = tail.next;
        }
        return head;
    }
}
class Element {
    int value;
    Element next;
}
