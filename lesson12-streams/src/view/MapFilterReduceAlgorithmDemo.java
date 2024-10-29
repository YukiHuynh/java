package view;

import java.time.Month;
import java.util.List;

import bean.Sale;

public class MapFilterReduceAlgorithmDemo {
	
	public static void main(String[] args) {
		
		List<Sale> sales = Sale.generateSales(50);
		for(Sale sale : sales) {
			System.out.println(sale);
		}
		
		int amountSoldInMarch = 0;
		for(Sale sale : sales) {
			if(sale.getDate().getMonth() == Month.MARCH) {
				amountSoldInMarch += sale.getAmount();
			}
		}
		
		System.out.println("Amount sold in March: " + amountSoldInMarch);
		
	}

}
