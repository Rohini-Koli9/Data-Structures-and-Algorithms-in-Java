package LinkedList;

//import java.util.*;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Methods
    public void addFirst(int data) {
         //step1 => create new node
         Node newNode = new Node(data);
         size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //step2 => newNode next = head
        newNode.next = head; //linking step

        //step3 =>  head = newNode
        head = newNode;

    }


    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1 ){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if( size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }

        //pre : i = size -2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    public int iterativeSearch(int key) {
        Node temp  = head;
        int i=0;

        while(temp != null) {
            if(temp.data == key) { //key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
    }


    public int helper(Node head, int key) {
        if(head == null) { //base case
            return -1;
        }

        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }



    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev; //update head
    }



    public void deleteNthfromEnd(int n) {
        //calculate size 
        int sz =0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        //corner case
        if(n == sz) {
            head = head.next; //removeFirst
            return;
        }

        //sz-n tak pohochna hai ab
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while( i< iToFind) {
            prev =prev.next;
            i++;
        }

        prev.next = prev.next.next; //deletion step
        return;
    }


    //Slow-Fast Approach
    public Node findMid(Node head) {  //helper function
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1  turtle
            fast = fast.next.next; //+2  hare
        }

        return slow; //slow is my mid
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {//base case
            return true;
        }

        //step1 -find midNode
        Node midNode = findMid(head);

        //step2-reverse 2nd half
        Node prev=null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;  //right half ka head
        Node left = head;

        //step3-check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       // ll.print();
       // ll.addFirst(2);
        //ll.print();
       // ll.addFirst(1);
       // ll.print();
       // ll.addLast(4);
       // ll.print();
       // ll.addLast(5);
        //ll.add(2,3);
        //ll.print();
        //System.out.println(ll.size);

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.size);

        //System.out.println(ll.iterativeSearch(4));
        //System.out.println(ll.iterativeSearch(11));
        

        // System.out.println(ll.recursiveSearch(3));
        // System.out.println(ll.recursiveSearch(11));

       // ll.reverse();
        // ll.print();

        //ll.deleteNthfromEnd(3);
        //ll.print();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); 
        System.out.println(ll.checkPalindrome());
    }
}
