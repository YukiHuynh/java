package data_structure_and_algorithms.list;

public class Array {

	public static void main(String[] args) {
		
		char[] array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
		System.out.println("Original Array: ");
		printArrayElements(array);
		
		System.out.println("\nInserted Array: ");
		printArrayElements(insertIntoArray(array, 7, 'V'));
		
		System.out.println("\nDeleted Array: ");
		printArrayElements(remvoveFromArray(array, 6));
		
		System.out.println("\n===========================================\n");
		char[] addElement = modifyArray(array, 1, 'M');
		printArrayElements(addElement);
		
		char[] removeElement = modifyArray(array, 2, null);
		printArrayElements(removeElement);
	}
	
	private static char[] modifyArray(char[] array, int position, Character elementToInsert) {
		if (position < 1 || position > array.length + 1) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
		
		char[] newArray = new char[array.length + (elementToInsert != null ? 1 : -1)];
	    
	    for (int i = 0; i < newArray.length; i++) {
	        if (i < position - 1) {
	            newArray[i] = array[i];  // Sao chép các phần tử trước vị trí cần thao tác
	        } else if (i == position - 1 && elementToInsert != null) {
	            newArray[i] = elementToInsert;  // Chèn phần tử tại vị trí
	        } else if(i > position - 1){
	            newArray[i] = array[i - (elementToInsert != null ? 0 : 1)];  // Bỏ qua hoặc sao chép phần tử sau khi chèn
	        }
	    }
	    
	    return newArray;
	}
	
	private static char[] remvoveFromArray(char[] array, int position) {
		char[] newArray = new char[array.length - 1];
		for(int i = 0; i < newArray.length; i++) {
			if(i < position -1) {
				newArray[i] = array[i];
			} else {
				newArray[i] = array[i + 1];
			}
		}
		return newArray;
	}
	
	private static char[] insertIntoArray(char[] array, int position, char element) {
		char[] newArray = new char[array.length + 1];
		for(int i = 0; i < newArray.length; i++) {
			if(i < position -1) {
				newArray[i] = array[i];
			} else if (i == position -1) {
				newArray[i] = element;
			} else {
				newArray[i] = array[i - 1];
			}
		}
		return newArray;
	}
	
	private static void printArrayElements(char[] array) {
		for(int i = 0; i < array.length; i++) {
			if(i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + " ");
			}
		}
	}
	
}
