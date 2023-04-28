import java.util.*;
import java.io.*;
import java.lang.*;


public class SingleLL {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // t -> number of testcases
        System.out.print("Number of testcases you want to run: ");
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {

            // get linkedlist values
            System.out.println("Enter the values for the LinkedList (seperated by '->' as per the question): ");
            String[] input = sc.nextLine().trim().split("->");

            int[] arr = new int[input.length];

            for(int i=0; i<input.length; i++) 
                arr[i] = Integer.parseInt(input[i].trim());
            
            // constructing the linkedlist first
            Node head = constructSingleLL(arr);

    
            deleteAlternate(head);

            System.out.println("The LinkedList after deleting alternate nodes from the 2nd node: ");
            traverseSingleLL(head);
        }
        sc.close();


    }
    
    static class Node {
        int data;
        Node next;
        public Node(int _data) {
            this.data = _data;
            this.next = null;
        }

    }


    static void deleteAlternate(Node head){
        // setting up base cases
        if(head == null || head.next == null)
            return;

        // deleting the alternate node
        head.next = head.next.next;

        //recursive leap of faith
        deleteAlternate(head.next);
    }



    static Node constructSingleLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i<arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    static void traverseSingleLL(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data);
            if(temp.next != null)
                System.out.print("->");
            temp = temp.next;
        }
    }
}
