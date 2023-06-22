package Summer_Training_2023;

public class stack01 {
    int stack[]=new int[10];
    int MAX=10;
    int top;
    void stack(){
        top=-1;
    }
    void push (int val) {
        if(top>=MAX-1) {
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top]=val;
        System.out.println("push into stack: "+val);
    }
    boolean isEmpty(){
        return top<=0;
    }
    public static void main(String[] args) {
        stack01 st=new stack01();
        st.push(21);
        st.push(9);
    }
}