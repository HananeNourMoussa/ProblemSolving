/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlisttricks;

/**
 *
 * @author Hanane Nour
 */
public class LinkedListTricks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //testing my implementation
        Node head = new Node (5);
        head.append(6);
        head.append(2);
        head.append(7);
        head.append (7);
        head.append(2);
        head.printLL(head);
       
    
}
}
