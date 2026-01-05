package com.hashmap;

public class MyHashMap {

    class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10;
    private Node[] table = new Node[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    // Insert or update
    void put(int key, int value) {
        int index = hash(key);
        Node head = table[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    // Get value
    Integer get(int key) {
        int index = hash(key);
        Node head = table[index];

        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return null;
    }

    // Remove key
    void remove(int key) {
        int index = hash(key);
        Node head = table[index], prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev == null)
                    table[index] = head.next;
                else
                    prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 100);
        map.put(11, 200); // collision
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}
