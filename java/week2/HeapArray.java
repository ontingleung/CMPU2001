class Heap{

    int[] array = { 19, 13, 16, 12, 8, 6, 9 , 0 , 0 };
    int heapsize = array.length;

    public void insert(int x) {
        array[heapsize++] = x;
    }

    public void siftUP(int k) {
        int v = array[k];

        while(v > array[k/2]) {
            array[k] = array[k/2];
            k = k/2;
        }
        array[k] = v;
    }

    public void display() {
        System.out.println("\nThe heap values are:\n");

        for(int i = 0; i < heapsize; i++) {
            System.out.println(array[i] + " ");
        }       
        System.out.println("\n");
    } 
}

class HeapArray {
    
    public static void main(String[] arg) {
        
        
        Heap test = new Heap();

        test.display();
        test.insert(10);
        test.display();
    }
}
