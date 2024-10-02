import java.util.Random;

public class ThingList {
    private Node head;  // Head of the linked list

    // Inner class representing a node in the linked list
    private class Node {
        Thing data;     // Holds the Thing object
        Node next;      // Points to the next node in the list

        public Node(Thing data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a new Thing to the end of the list
    public void addThing(Thing thing) {
        Node newNode = new Node(thing);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {  // Traverse to the end of the list
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print all Things in the list
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);  // Print each Thing object
            current = current.next;
        }
    }

    // Move all Things in the list by calling their `maybeTurn` and `step` methods
    public void moveAll(Random rand) {
        Node current = head;
        while (current != null) {
            current.data.maybeTurn(rand);  // Call maybeTurn with Random parameter
            current.data.step();           // Call step to move the Thing
            current = current.next;
        }
    }
}