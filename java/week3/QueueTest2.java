// Exercise to separate ADT Queue from its implementation
// and to provide 2 implementations. Also exception handling.

class QueueException extends Exception {
    // do as in stack example
}    

// In Java an interface can often be the best way to 
// describe an Abstract Data Type (ADT) such as Queue or Stack
interface Queue {
    public void enQueue(int x) throws QueueException;
    public int deQueue() throws QueueException;
    public boolean isEmpty();   
}


class QueueLL implements Queue {
    
 
    // assume the queue is non-empty when this method is called, otherwise thro exception
    public int deQueue() throws QueueException {
        
    }

 

} // end of QueueLL class



class QueueCB implements Queue {
    private int q[], back, front;
    private int qmax, size;

 
    public QueueCB() {
        qmax = 4;
        size = front = back = 0;
        q = new int[qmax];
    }

    public void enQueue( int x) throws QueueException  {
        // do it
    }
  
    public int deQueue()  throws QueueException 
    {
        // do it
  }

    public boolean isEmpty() {
        return size == 0;
    }
}


// here we test both implementations
class QueueTest2 {
    public static void main(String[] arg) {
        Queue q1, q2;
        q1 = new QueueLL();
        q2 = new QueueCB();
        
        for(int i = 1; i<6; ++i)
        try { 
            q1.enQueue(i);            
        } catch (QueueException e) {
            System.out.println("Exception thrown: " + e); 
        }
        
        // more test code
    }   
}

