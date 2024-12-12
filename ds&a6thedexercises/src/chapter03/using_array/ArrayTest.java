package chapter03.using_array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		
		int data[] = new int[10];
		Random rd = new Random();
		rd.setSeed(System.currentTimeMillis());
		
		for(int i = 0; i < data.length; i++) {
			data[i] = rd.nextInt(100);
		}
		
		int[] origin = Arrays.copyOf(data, data.length);
		System.out.println("arrays equal before sort: " + Arrays.equals(data, origin));
		
		Arrays.sort(data);
		System.out.println("arrays equal after sort: " + Arrays.equals(data, origin));
		System.out.println("orig = " + Arrays.toString(origin));
		System.out.println("data = " + Arrays.toString(data));
		
		
	}
	
}
