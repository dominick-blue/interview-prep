package week1;

// Singly Linked List Node
class Node
{
    int key;
    int value;
    Node next;

    public Node(int key, int value)
    {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

// Implementation for Hash Table
public class HashTable {

    /*
    Design a Hash Table class.

    Your HashTable class should support the following operations:

    HashTable(int capacity) will initialize an empty hash table with a capacity of capacity, where capacity > 1.
    int get(int key) will return the value associated with the key. If the key is not present in the hash table, return -1.
    void insert(int key, int value) will insert the key-value pair into the hash table. If the key is already present in the hash table, the original value should be replaced with the new value.
    bool remove(int key) will remove the key-value pair with the given key. If the key is not present, return false, otherwise return true
    int getSize() will return the number of keys in the hash table.
    int getCapacity() will return the capacity of the hash table.
    void resize() will double the capacity of the hash table. This method should be called automatically when the load factor reaches or exceeds 0.5. Your insert method should automatically call resize() when necessary.
    Note: You can choose how to handle collisions.
    * */

    private int capacity;
    private int size;
    private Node[] table;

    public HashTable(int capacity)
    {

    }

    public void insert(int key, int value)
    {

    }

    public int get(int key)
    {

    }

    public boolean remove(int key)
    {

    }

    public int getSize()
    {

    }

    public int getCapacity()
    {

    }

    public void resize()
    {

    }
}
