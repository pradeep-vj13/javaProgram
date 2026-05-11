package samplePackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {

		// 1. Create ArrayList
		ArrayList<String> fruits = new ArrayList<>();

		// 2. add() - Adding elements
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Kiwi");

		System.out.println("Initial List: " + fruits);

		// 3. add(index, element)
		fruits.add(1, "Mango");
		System.out.println("After adding Mango at index 1: " + fruits);

		// 4. get(index)
		System.out.println("Element at index 2: " + fruits.get(2));

		// 5. set(index, element) - Replace element
		fruits.set(0, "Pineapple");
		System.out.println("After replacing Apple with Pineapple: " + fruits);

		// 6. remove(index)
		fruits.remove(3);
		System.out.println("After removing element at index 3: " + fruits);

		// 7. remove(object)
		fruits.remove("Kiwi");
		System.out.println("After removing Kiwi: " + fruits);

		// 8. contains()
		System.out.println("Contains Banana? " + fruits.contains("Banana"));

		// 9. size()
		System.out.println("Size of list: " + fruits.size());

		// 10. isEmpty()
		System.out.println("Is list empty? " + fruits.isEmpty());

		// 11. indexOf()
		System.out.println("Index of Banana: " + fruits.indexOf("Banana"));

		// 12. lastIndexOf()
		fruits.add("Banana");
		System.out.println("Last index of Banana: " + fruits.lastIndexOf("Banana"));

		// 13. sort()
		Collections.sort(fruits);
		System.out.println("Sorted list: " + fruits);

		// 14. clear()
		ArrayList<String> tempList = new ArrayList<>(fruits);
		tempList.clear();
		System.out.println("After clearing tempList: " + tempList);

		// 15. for loop
		System.out.println("Using for loop:");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

		// 16. enhanced for loop
		System.out.println("Using enhanced for loop:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}