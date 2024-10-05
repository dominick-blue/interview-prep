package week1;

public class DynamicArray
{
    /*
    Design a Dynamic Array (aka a resizable array) class, such as an ArrayList in Java or a vector in C++.

    Your DynamicArray class should support the following operations:

    DynamicArray(int capacity) will initialize an empty array with a capacity of capacity, where capacity > 0.
    int get(int i) will return the element at index i. Assume that index i is valid.
    void set(int i, int n) will set the element at index i to n. Assume that index i is valid.
    void pushback(int n) will push the element n to the end of the array.
    int popback() will pop and return the element at the end of the array. Assume that the array is non-empty.
    void resize() will double the capacity of the array.
    int getSize() will return the number of elements in the array.
    int getCapacity() will return the capacity of the array.

    If we call void pushback(int n) but the array is full, we should resize the array first.
    * */

    private int[] arr;
    private int length;
    private int capacity;

    // Constructor to initialize the dynamic array
    public DynamicArray(int capacity)
    {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[this.capacity];
    }

    // Get value at the i-th index
    public int get(int i)
    {
        return arr[i];
    }

    // Insert value n at the i-th index
    public void set(int i, int n)
    {
        arr[i] = n;
    }

    // Insert n in the last position of the array
    public void pushback(int n)
    {
        if (length == capacity)
        {
            resize();
        }
        arr[length] = n;
        length++;
    }

    // Remove the last element in the array
    public int popback()
    {
        if (length > 0)
        {
            // Soft delete the last element
            length--;
        }
        return arr[length];

    }

    // Resize the array
    private void resize()
    {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < length; i++)
        {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // Get the size of the array
    public int getSize()
    {
        return length;
    }

    public int getCapacity()
    {

    }
}
