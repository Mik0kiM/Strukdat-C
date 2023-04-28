package Modul3;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    public Stack(int a){
        maxSize = a;
        stackArray = new long [maxSize];
        top= -1;
    }
    public void push (long j){
        stackArray [++top] = j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == maxSize-1);
    }
    
    public static void main(String[] args) {
        java.util.Stack st = new java.util.Stack();
        
        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");//nambah
        
        System.out.println("Next : "+st.peek());//akses
        st.push("Raya");
        System.out.println(st.pop());//menghapus
        st.push("!");
        
        int count = st.search ("Aku");
        while (count != -1 && count > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
    
}