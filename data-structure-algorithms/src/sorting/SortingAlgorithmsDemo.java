package sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import utils.ArrayUtils;

public class SortingAlgorithmsDemo {

	private static final String INPUT_FILE = "SORT.INP";
	private static final String OUTPUT_FILE = "SORT.OUT";
	private static final int MAX = 15000;
	private static final int MAXV = 15000;
	private static final String[] MENU = {
			"0. Display Input",
	        "1. SelectionSort",
	        "2. BubbleSort",
	        "3. InsertionSort",
	        "4. InsertionSort with Binary Searching",
	        "5. ShellSort",
	        "6. QuickSort",
	        "7. HeapSort",
	        "8. Distribution Counting",
	        "9. Radix Exchange Sort",
	        "10. Straight Radix Sort",
	        "11. MergeSort",
	        "12. Exit"
	};
	
	private static int[] k = new int[MAX];
	private static int n;
	private static long startTime;
	
	public static void main(String[] args) {
		
		try {
			generateInputFile(INPUT_FILE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			sortAndWriteOutput(INPUT_FILE, OUTPUT_FILE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner ip = new Scanner(System.in);
		int choice;
		do {
			displayMenu();
			System.out.println("Enter your choice: ");
			choice = ip.nextInt();
			try {
			switch(choice) {
				case 0 -> displayInput();
	            case 1 -> selectionSort();
	            case 2 -> bubbleSort();
	            case 3 -> insertionSort();
	            case 4 -> advancedInsertionSort();
	            case 5 -> shellSort();
	            case 6 -> quickSort();
	            case 7 -> heapSort();
	            case 8 -> distributionCounting();
	            case 9 -> radixExchangeSort();
	            case 10 -> straightRadixSort();
	            case 11 -> mergeSort();
	            case 12 -> System.exit(0);
	            default -> System.out.println("Invalid choice! Please try again.");
	           
			}
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		} while(true);
		
	}
	
	private static void generateInputFile(String fileName) throws IOException {
		Random rd = new Random();
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			for(int i = 0; i < MAX; i++) {
				int randomValue = rd.nextInt(MAX + 1);
				writer.write(randomValue + "\n");
			}
		}
		System.out.println("Tệp " + fileName + " đã được tạo thành công.");
	}
	
	private static void sortAndWriteOutput(String inputFileName, String outputFileName) throws IOException {
        // Đọc các giá trị từ file SORT.INP
        List<Integer> keys = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                keys.add(Integer.parseInt(line));
            }
        }

        // Sắp xếp danh sách
        Collections.sort(keys);

        // Ghi kết quả đã sắp xếp vào SORT.OUT
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (int key : keys) {
                writer.write(key + "\n");
            }
        }
        System.out.println("Kết quả đã được ghi vào tệp " + outputFileName);
    }
	
	private static void displayMenu() {
		System.out.println("\nSorting Algorithms Demo");
		Arrays.stream(MENU).forEach(System.out::println);
	}
	
	private static void loadInput() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));
		n = 0;
		String line;
		while((line = reader.readLine()) != null) {
			k[n++] = Integer.parseInt(line.trim());
		}
		reader.close();
		startTime = System.nanoTime();
	}
	
	private static void saveOutput() throws IOException {
		long elapsedTime = System.nanoTime() - startTime;
		System.out.printf("Running Time = %.10f seconds\n", elapsedTime / 1e9);
		BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE));
		for(int i = 0; i < n; i++) {
			writer.write(k[i] + "\n");
		}
		writer.close();
		System.out.println("Output saved to " + OUTPUT_FILE);
	}
	
	private static void displayInput() throws IOException {
		loadInput();
		System.out.println("Input Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(k[i] + " ");
		}
		System.out.println();
	}
	
	private static void selectionSort() throws IOException {
		loadInput();
		for(int i = 0; i < n-1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < n; j++) {
				if(k[j] < minIndex) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				ArrayUtils.swap(i, minIndex);
			}
		}
		saveOutput();
	}
	
	private static void bubbleSort() throws IOException {
		loadInput();
		for(int i = 0; i < n-1; i++) {
			for(int j = n-1; j > i; j--) {
				if(k[j] < k[j - 1]) {
					ArrayUtils.swap(j, j-1);
				}
			}
		}
		saveOutput();
	}
	
	private static void insertionSort() throws IOException {
		loadInput();
		for(int i = 1; i < n; i++) {
			int key = k[i];
			int j = i - 1;
			while(j >= 0 && k[j] > key) {
				k[j+1] = k[j];
				j--;
			}
			k[j+1] = key;
		}
		saveOutput();
	}
	
	private static void advancedInsertionSort() throws IOException {
		loadInput();
		for(int i = 1; i < n; i++) {
			int key = k[i];
			int low = 0, high = i -1;
			while(low <= high) {
				int mid = (low + high) / 2;
				if(k[mid] > key) { 
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			System.arraycopy(k, low, k, low+1, i-low);
			k[low] = key;
		}
		saveOutput();
	}
	
	private static void shellSort() throws IOException {
		loadInput();
		int gap = n/2;
		while(gap > 0) {
			for(int i = gap; i < n; i++) {
				int temp = k[i];
				int j = i;
				while(j >= gap && k[j - gap] > temp) {
					k[j] = k[j - gap];
					j -= gap;
				}
				k[j] = temp;
			}
			gap /= 2;
		}
		saveOutput();
	}
	
	private static void quickSort() throws IOException {
		loadInput();
		quickSortRecursive(0, n-1);
		saveOutput();
	}
	
	private static void quickSortRecursive(int low, int high) {
		if(low < high) {
			int pivot = partition(low, high);
			quickSortRecursive(low, pivot-1);
			quickSortRecursive(pivot+1, high);
		}
	}
	
	private static int partition(int low, int high) {
		int pivot = k[high];
		int i = low - 1;
		for(int j = low; j < high; j++) {
			if(k[j] < pivot) {
				i++;
				ArrayUtils.swap(i, j);
			}
		}
		ArrayUtils.swap(i+1, high);
		return i+1;
	}
	
	private static void heapSort() throws IOException {
		loadInput();
		for(int i = n / 2 - 1; i >= 0; i--) {
			heapify(n, i);
		}
		
		for(int i = n - 1; i > 0; i--) {
			ArrayUtils.swap(0, i);
			heapify(i, 0);
		}
		saveOutput();
	}
	
	private static void heapify(int size, int root) {
		int largest = root;
		int left = 2 * root + 1;
		int right = 2 * root + 2;
		
		if(left < size && k[left] > k[largest]) {
			largest = left;
		}
		
		if(right < size && k[right] > k[largest]) {
			largest = right;
		}
		
		if(largest != root) {
			ArrayUtils.swap(root, largest);
			heapify(size, largest);
		}
	}
	
	private static void distributionCounting() throws IOException {
		loadInput();
		int[] count = new int[MAXV + 1];
		Arrays.fill(count, 0);
		
		for(int i = 0; i < n; i++) {
			count[k[i]]++;
		}
		int index = 0;
		for(int i = 0; i <= MAXV; i++) {
			while(count[i]-- > 0) {
				k[index++] = i;
			}
		}
		saveOutput();
	}
	
	private static void radixExchangeSort() throws IOException {
		loadInput();
		radixExchangeSortRecursive(0, n -1, 31);
		saveOutput();
	}
	
	private static void radixExchangeSortRecursive(int low, int high, int bit) {
		if(low > high || bit < 0) return;
		
		int i = low, j = high;
		while(i <= j) {
			while(i <= high && ((k[i] >> bit) & 1) == 0) i++;
			while (j >= low && ((k[j] >> bit) & 1) == 1) j--;
			if(i < j) {
				ArrayUtils.swap(i, j);
				i++;
				j--;
			}
		}
		
		radixExchangeSortRecursive(low, j, bit - 1);
	    radixExchangeSortRecursive(i, high, bit - 1);
	}
	
	private static void straightRadixSort() throws IOException {
		loadInput();
		int max = Arrays.stream(k, 0, n).max().orElse(0);
		int exp = 1;
		
		int[] output = new int[n];
		while(max/exp > 0) {
			int[] count = new int[10];
			
			for(int i = 0; i < n; i++) {
				count[(k[i] / exp) % 10]++;
			}
			
			for (int i = 1; i < 10; i++) {
	            count[i] += count[i - 1];
	        }
			
			for (int i = n - 1; i >= 0; i--) {
	            output[--count[(k[i] / exp) % 10]] = k[i];
	        }
			
			System.arraycopy(output, 0, k, 0, n);
			
			exp *= 10;
		}
	}
	
	private static void mergeSort() throws IOException {
        loadInput();
        mergeSortRecursive(0, n - 1);
        saveOutput();
    }
    
    private static void mergeSortRecursive(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSortRecursive(low, mid);
            mergeSortRecursive(mid + 1, high);
            merge(low, mid, high);
        }
    }
    
    private static void merge(int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low; 
        int j = mid + 1; 
        int l = 0;
        while (i <= mid && j <= high) {
            if (k[i] <= k[j]) {
                temp[l++] = k[i++];
            } else {
                temp[l++] = k[j++];
            }
        }
        while (i <= mid) {
            temp[l++] = k[i++];
        }
        while (j <= high) {
            temp[l++] = k[j++];
        }
        System.arraycopy(temp, 0, k, low, temp.length);
    }
	
}
