import java.util.Scanner;

class StackApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        StackOp st = new StackOp(n);
        while(true){
            System.out.println("push 1-----> push");
            System.out.println("pop 2-----> pop");
            System.out.println("display 3------>display");
            System.out.println("peek 4---->peek");
            System.out.println("Any other number------->stop");
            System.out.println("Enter your choices");

            int choices = sc.nextInt();
            switch(choices){
                case 1:st.push();
                break;
                case 2:st.pop();
                break;
                case 3:st.display();
                break;
                case 4:st.peek();
                break;
                default:System.out.println("exit");
            }
        }
    }
}

class StackOp {
    private int top = -1;
    private int[] s;
    private int size;
    Scanner scan = new Scanner(System.in);

    public StackOp(int n){
        s = new int[n];
        size = s.length;
    }

    public void push(){
        int element;
        if(top == (size-1)){
            System.out.println("stack overflow");
        } else {
            System.out.println("Enter an element");
            element = scan.nextInt();
            ++top;
            s[top] = element;
        }
    }

   public void pop(){
    if(top == -1){
        System.out.println("stack underflow");
    } else {
    System.out.println("element deleted is "+ s[top]);
    --top;
 }
}

    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        } else {
           for(int i=top;i>=0;i--){
            System.out.print(s[i]+" ");
           }
        }
        System.out.println();
    }

    public void peek() {
        System.out.println("element is "+s[top]);
    }
}