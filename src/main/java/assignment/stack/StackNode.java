package assignment.stack;

public class StackNode {

    private int[] elements;
    private int head = 0;
    private int size = 16;
    private int modifyCount = 0;

    public StackNode() {
        elements = new int[size];
    }

    public StackNode(int size) {
        elements = new int[this.size = size];
        System.out.println(this.size);
    }

    public boolean push(int data){
        if (modifyCount >= size){ return false; }
        elements[modifyCount] = data;
        head = modifyCount;
        ++modifyCount;
        return true;
    }

    public int pop(){
        if (head < 0) { return -1; }
        int res = elements[head];
        elements[head] = -1;
        head--;
        return res;
    }

    public void print(){
        for (int index : elements){
            if (index == 0 || index == -1){
                System.out.println("is Empty");
                break;
            }
            System.out.println(index);
        }
    }
}
