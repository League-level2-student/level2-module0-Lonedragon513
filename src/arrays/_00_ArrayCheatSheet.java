package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] words = {"SKSK", "hahah","mahaha", "hec", ">_>"};
		//2. print the third element in the array
		System.out.println(words[2]);
		//3. set the third element to a different value
		words [2] = "Ack";
		//4. print the third element again
		System.out.println(words[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(words [i]);
		}
		
		//6. make an array of 50 integers
		int [] num = new int [50]; 
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random ();
		for (int i = 0; i < 50; i++) {
			int a = r.nextInt(1000); 
			num [i] = a;
		}
		//8. without printing the entire array, print only the smallest number in the array
		int numo= num[0];
		for (int i = 1; i < 50; i++) {
			if (num [i]<=numo) {
				numo=num[i];
			}
		}
		System.out.println(numo);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < 50; i++) {
			System.out.println(num [i]);
		}
		//10. print the largest number in the array.
		int num2= num[0];
		for (int i = 1; i < 50; i++) {
			if (num [i]>=num2) {
				num2=num[i];
			}
		}
		System.out.println(num2);
	}
}
