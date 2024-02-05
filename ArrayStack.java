public class ArrayStack {
    private Object[] top ;
    private int size ;
    private int index ;

    public ArrayStack(int size) {
        this.size = size ;
        this.top = new Object[size];
        index = -1 ;
    }

    public boolean isEmpty(){
        return index == -1;
    }

    public int getSize(){
        int i = 0 ;
        for (int p = top.length - 1 ; p >= 0 ; p--){
            i++ ;
        }

        return  i ;
    }

    public int search(Object element){
        if (size == 0) System.out.println("Stack is empty!!");

        int i = -1 ;
        for (int p = top.length-1 ; p >= 0 ; p--){
            if (top[p] == element){
                System.out.print(element + " is at index : ");
                return ++i ;
            }
        }

        return i;
    }

    public boolean isFull(){
        return index == size - 1 ;
    }

    public void push(Object newTop){
        if (isFull()) System.out.println("Stack is full-");
        else {
            index++ ;
            top[index] = newTop ;
            System.out.println(newTop + " pushed successfully-");
        }
    }

    public Object peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1 ;
        }
        else return top[index] ;
    }

    public Object pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1 ;
        }else {
            Object oldTop = top[index] ;
                top[index] = top[index+1] ;
                index-- ;
//            size-- ;
            return oldTop ;
        }
    }

    public void display(){
        for (int p = top.length - 1 ; p >= 0 ; p--){
            System.out.println(top[p]);
        }
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5) ;
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);
        System.out.println("Is Empty : " + arrayStack.isEmpty());
        System.out.println("Size : " + arrayStack.getSize());
        arrayStack.display();
        System.out.println("Popped successfully : " + arrayStack.pop());

        arrayStack.display();

    }
}
