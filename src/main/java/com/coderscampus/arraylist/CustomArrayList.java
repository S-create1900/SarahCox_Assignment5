package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size;
	
    // Constructor to initialize the array with a default size
    public CustomArrayList() {
        items = new Object[10]; // Initial capacity of 10
        size = 0; // Start with size 0
    }

//	This method should add a new item into the <code>CustomList</code> and should
//	 * return <code>true</code> if it was successfully able to insert an item.
//	 * @param item the item to be added to the <code>CustomList</code>
//	 * @return <code>true</code> if item was successfully added, <code>false</code> if the item was not successfully added (note: it should always be able to add an item to the list) 
//	 *
	
	@Override
	public boolean add(T item) {
	    // Check if the array is full
	    if (size == items.length) {
	        resize(); // Resize the array if necessary
	    }
	    items[size] = item; // Add the item to the array
	    size++; // Increment the size
	    return true; // Indicate that the item was added successfully
	}

	
//	/**
//	 * This method should return the size of the <code>CustomList</code>
//	 * based on the number of actual elements stored inside of the <code>CustomList</code>
//	 * @return an <code>int</code> representing the number of elements stored in the <code>CustomList</code>
//	 */	
	
	private void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSize() {
		return size;
	}

//	/**
//	 * This method will return the actual element from the <code>CustomList</code> based on the
//	 * index that is passed in.
//	 * @param index represents the position in the backing <code>Object</code> array that we want to access
//	 * @return The element that is stored inside of the <code>CustomList</code> at the given index
//	 */
	
	@Override
	public T get(int index) {
	    if (index < 0 || index >= size) {
	        return null; // Return null for invalid index
	    }
	    return (T) items[index]; // Return the item at the specified index
	}
	
}
