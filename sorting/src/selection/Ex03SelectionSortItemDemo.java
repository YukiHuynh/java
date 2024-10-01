package selection;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

public class Ex03SelectionSortItemDemo {

	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		printf("Initial items", items);
		
		// 1. Sắp xếp tăng dần theo id
		selectionSort(items, (i1, i2) -> i1.getId().compareTo(i2.getId()));
		printf("1. Sorting by id(asc)", items);
		
		// 2. Sắp xếp tăng dần theo name
		selectionSort(items, (i1, i2) -> i1.getName().compareTo(i2.getName()));
		printf("2. Sorting by name(asc)", items);
		
		// 3. Sắp xếp giảm dần theo salesPrice
		selectionSort(items, (i1, i2) -> i2.getSalesPrice().compareTo(i1.getSalesPrice()));
		printf("3. Sorting by salesPrice(desc)", items);
		
		// 4. Sắp xếp giảm dần theo storeId
		selectionSort(items, (i1, i2) -> i2.getStoreId().compareTo(i1.getStoreId()));
		printf("4. Sorting by storeId(desc)", items);
		
		// 5. Sắp xếp giảm dần theo storeId, tăng dần theo expireDate
		selectionSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			if(storeId1 != storeId2) return storeId2.compareTo(storeId1);
			
			return i1.getExpireDate().compareTo(i2.getExpireDate());
		});
		printf("5. Sorting by storeId(desc), expireDate(asc)", items);
		
		// 5. Sắp xếp tăng dần theo storeId, giảm dần theo salesPrice, giảm dần theo expireDate
		selectionSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();

			if (storeId1 != storeId2) return storeId1.compareTo(storeId2);
			
			Double s1 = i1.getSalesPrice();
			Double s2 = i2.getSalesPrice();
			
			int salesPriceCp = s1.compareTo(s2);
			
			if(salesPriceCp != 0) return s1.compareTo(s1);

			return i2.getExpireDate().compareTo(i1.getExpireDate());
		});
		printf("6. Sorting by storeId(asc), salesPrice(desc), expireDate(desc)", items);
		
	}
	
	private static void selectionSort(Item[] items, ItemComparator itemComp) {
		int length = items.length;
		for(int i = length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(itemComp.strategy(items[j], items[i]) > 0) {
					Item temp = items[j];
					items[j] = items[i];
					items[i] = temp;
				}
			}
		}
	}
	
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + " --> {");
		for(Item item : items) {
			System.out.println("    + " + item);
		}
		System.out.println("}\n");
	}
	
}
