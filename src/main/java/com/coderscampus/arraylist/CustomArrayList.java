package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10]; // Backing Array w/ Initial capacity of 10
	private int size;

	@Override
	public boolean add(T item) {
		// Check if the array is full
		if (size == items.length) {
			resize(); // Resize the array if necessary
		}
		items[size++] = item; // Add the item to the array & Increment the size
		return true; // Indicate that the item was added successfully
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			return null; // Return null for invalid index
		}
		return (T) items[index]; // Return the item at the specified index
	}

// Method to resize the backing array when it is full
	private void resize() {
		items = Arrays.copyOf(items, items.length * 2); // Double the size of the backing array
	}

}
