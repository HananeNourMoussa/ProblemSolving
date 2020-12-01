package linkedlisttricks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanane Nour
 */
public class Node {
    Node next;
    int data;
    
    public Node(int d)
    {
       this.data = d; 
    }
    
    public void append (int d)
    {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null)
        {
            n = n.next;
        }
        n.next = end;
    }
    
    public Node delete (Node head, int d)
    {
        Node n = head;
        if (n.data == d)
            return n.next;
        while (n.next != null)
        {
            if (n.next.data == d)
            {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
    
    public void printLL (Node head)
    {
        Node n = head;
        while (n != null)
        {
            System.out.print (n.data + "->");
            n = n.next;
        }
        System.out.println();
    }
}
