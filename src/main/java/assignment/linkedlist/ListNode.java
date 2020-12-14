package assignment.linkedlist;

public class ListNode {

    private int elements;

    private ListNode next = null; // class hashcode()  // heap 영역에서 내가 있는 위치

    // 0 0 0 0 0 0 0 0 -> null (끝이다)

    public ListNode(int data) {
        elements = data;
    }

    public ListNode add(ListNode newElement){
        if (this.next == null){
            this.next = newElement;
            return this;
        }

        ListNode nextNode = this.next;
        while (nextNode.next != null){
            nextNode = nextNode.next;
        }

        nextNode.next = newElement;

        return this;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position){
        ListNode nextNode = head;

        for (int loop = 0; loop < position-1; loop++) {
            if (nextNode.next == null){ break; } // runtime Exception
            nextNode = nextNode.next;
        }

        ListNode tmp = nextNode.next;
        nextNode.next = nodeToAdd;
        nodeToAdd.next = tmp;

        // 30 -> 40
        // 40 -> 50
        // 30 -> 100
        // 30 -> 100 -> 40 -> 50

        return this;
    }

    public ListNode remove(ListNode head, int positionToRemove){
        ListNode nextNode = head;

        for (int loop = 0; loop < positionToRemove-1; loop++) {
            nextNode = nextNode.next;
        }
        // 현재 시점의 nextNode 에서 next 가 지워져야할 node
        ListNode tmp = nextNode.next;
        nextNode.next = tmp.next;
        tmp = null;

        // 30 40 50
        // tmp 40
        // 30 . next <= (40.next) -> 50

        // tmp == null;
        // 40 heap -> gc 발생 시 참조하는 변수가 없다 = heap 삭제

        return this;
    }

    public boolean contains(ListNode head, ListNode nodeToCheck){
        ListNode nextNode = head;

        // 동등성 비교? : 참조 값을 제외하고(hashcode) 가지고 있는 변수가 같으면 동등하다 equals
        // 동일성 비교 : 참조 값이 같아야한다. ==

        // 재정의하지 않은 equals() 는 동일성 비교다. == 같다.
        // == 비교가 되지않으면 그제서야 재정의한 비교를 실행한다 (변수를 비교한다.)

        // 40 list node
        // new list node
        //
        // 기존의 존재하는 녀석의 참조값을 받아온다.

        // 0 0 0 0 0 -> null
        // 0 0 0 0 X = false
        // 0 0 0 0 0
        //   0 0 0 0 = false

        if (head.elements == nodeToCheck.elements){
            return true;
        }
        while (nextNode.next != null){
            nextNode = nextNode.next;
            if (nextNode.elements == nodeToCheck.elements){
                return true;
            }
        }

        return false;
    }

    public void print(){
        ListNode nextNode = this;

        while (nextNode != null){
            System.out.println(nextNode.elements);
            nextNode = nextNode.next;
        }
    }

    public int size(){
        ListNode nextNode = this;

        int size = 0;
        while (nextNode != null){
            ++size;
            nextNode = nextNode.next;
        }
        return size;
    }
}
