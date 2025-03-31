package com.coderscampus.arraylist;

public class CustomArrayMainApplication {

	public static void main(String[] args) {
		// Create an instance of CustomArrayList
		CustomArrayList<String> customList = new CustomArrayList<>();

		// Add elements to the CustomArrayList
		customList.add("Apple");
		customList.add("Banana");
		customList.add("Cherry");
		customList.add("Date");
		customList.add("Elderberry");
		customList.add("Fig");
		customList.add("Grape");
		customList.add("Honeydew");
		customList.add("Kiwi");
		customList.add("Lemon");
		customList.add("Mango");
		customList.add("Nectarine");
		customList.add("Orange");
		customList.add("Papaya");
		customList.add("Quince");
		customList.add("Raspberry");
		customList.add("Strawberry");
		customList.add("Tomato");
		customList.add("Ugli fruit");
		customList.add("Vanilla bean");
		customList.add("Watermelon");
		customList.add("Zucchini"); // This will trigger a resize

		// Print the size of the CustomArrayList
		System.out.println("Size of the list: " + customList.getSize());

		// Access and print elements by index
		for (int i = 0; i < customList.getSize(); i++) {
			System.out.println("Element at index " + i + ": " + customList.get(i));
		}

		// Attempt to access an index that exceeds the current size
		int indexToAccess = 10; // Start with index 10
		if (indexToAccess < customList.getSize()) {
			System.out.println("Element at index " + indexToAccess + ": " + customList.get(indexToAccess));
		}

		while (indexToAccess < customList.getSize()) {
			indexToAccess *= 2; // Double the index
			if (indexToAccess < customList.getSize()) {
				System.out.println("Element at index " + indexToAccess + ": " + customList.get(indexToAccess));
			}
		}

		// If the index exceeds the current size, print a message
		if (indexToAccess >= customList.getSize()) {
			System.out.println("Index " + indexToAccess + " exceeds the current size of the list.");
		}
	}
}
