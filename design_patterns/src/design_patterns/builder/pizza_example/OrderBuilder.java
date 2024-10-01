package design_patterns.builder.pizza_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {

	public OrderedItems preparePizza() throws IOException {

		OrderedItems itemsOrder = new OrderedItems();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the choice of Pizza");
		System.out.println("============================");
		System.out.println("        1. Veg-Pizza       ");
		System.out.println("        2. Non-Veg Pizza   ");
		System.out.println("        3. Exit            ");
		System.out.println("============================");

		int pizzaAndColdDrinkChoice = Integer.parseInt(br.readLine());
		switch (pizzaAndColdDrinkChoice) {
		case 1: {
			System.out.println("You ordered Veg Pizza");
			System.out.println("\n\n");
			System.out.println(" Enter the types of Veg-Pizza ");
			System.out.println("------------------------------");
			System.out.println("        1.Cheeze Pizza        ");
			System.out.println("        2.Onion Pizza        ");
			System.out.println("        3.Masala Pizza        ");
			System.out.println("        4.Exit            ");
			System.out.println("------------------------------");

			int vegPizzaChoice = Integer.parseInt(br.readLine());
			switch (vegPizzaChoice) {
			case 1: {
				System.out.println("You ordered Cheeze Pizza");
				System.out.println("Enter the cheeze pizza size");
				System.out.println("------------------------------------");
				System.out.println("    1. Small Cheeze Pizza ");
				System.out.println("    2. Medium Cheeze Pizza ");
				System.out.println("    3. Large Cheeze Pizza ");
				System.out.println("    4. Extra-Large Cheeze Pizza ");
				System.out.println("------------------------------------");

				int cheezePizzaSize = Integer.parseInt(br.readLine());
				switch (cheezePizzaSize) {
				case 1:
					itemsOrder.addItem(new SmallCheezePizza());
					break;
				case 2:
					itemsOrder.addItem(new MidiumCheezePizza());
					break;
				case 3:
					itemsOrder.addItem(new LargeCheezePizza());
					break;
				case 4:
					itemsOrder.addItem(new ExtraLargeCheezePizza());
					break;
				}
			}
			break;
			case 2: {
				System.out.println("You ordered Onion Pizza");
				System.out.println("Enter the Onion pizza size");
				System.out.println("----------------------------------");
				System.out.println("    1. Small Onion Pizza ");
				System.out.println("    2. Medium Onion Pizza ");
				System.out.println("    3. Large Onion Pizza ");
				System.out.println("    4. Extra-Large Onion Pizza ");
				System.out.println("----------------------------------");

				int onionPizzaSize = Integer.parseInt(br.readLine());
				switch (onionPizzaSize) {
				case 1:
					itemsOrder.addItem(new SmallOnionPizza());
					break;
				case 2:
					itemsOrder.addItem(new MidiumOnionPizza());
					break;
				case 3:
					itemsOrder.addItem(new LargeOnionPizza());
					break;
				case 4:
					itemsOrder.addItem(new ExtraLargeOnionPizza());
					break;
				}
			}
			break;

			case 3: {
				System.out.println("You ordered Masala Pizza");
				System.out.println("Enter the Masala pizza size");
				System.out.println("------------------------------------");
				System.out.println("    1. Small Masala Pizza ");
				System.out.println("    2. Medium Masala Pizza ");
				System.out.println("    3. Large Masala Pizza ");
				System.out.println("    4. Extra-Large Masala Pizza ");
				System.out.println("------------------------------------");

				int masalaPizzaSize = Integer.parseInt(br.readLine());
				switch (masalaPizzaSize) {
				case 1:
					itemsOrder.addItem(new SmallMasalaPizza());
					break;

				case 2:
					itemsOrder.addItem(new MidiumMasalaPizza());
					break;

				case 3:
					itemsOrder.addItem(new LargeMasalaPizza());
					break;

				case 4:
					itemsOrder.addItem(new ExtraLargeMasalaPizza());
					break;
				}
			}
				break;

			}
		}
			break; // veg-pizza completed

		case 2: {
			System.out.println("You ordered Non-Veg Pizza");
			System.out.println("\n\n");

			System.out.println("Enter the Non-Veg pizza size");
			System.out.println("------------------------------------");
			System.out.println("    1. Small Non-Veg Pizza ");
			System.out.println("    2. Medium Non-Veg Pizza ");
			System.out.println("    3. Large Non-Veg Pizza ");
			System.out.println("    4. Extra-Large Non-Veg Pizza ");
			System.out.println("------------------------------------");

			int nonVegPizzaSize = Integer.parseInt(br.readLine());

			switch (nonVegPizzaSize) {
			case 1:
				itemsOrder.addItem(new SmallNonVegPizza());
				break;
			case 2:
				itemsOrder.addItem(new MidiumNonVegPizza());
				break;
			case 3:
				itemsOrder.addItem(new LargeNonVegPizza());
				break;
			case 4:
				itemsOrder.addItem(new ExtraLargeNonVegPizza());
				break;
			}
		}
		break;
		default:{
			break;
		}
		} // end of main switch
		
		System.out.println(" Enter the choice of ColdDrink ");  
        System.out.println("============================"); 
        System.out.println("        1. Pepsi            "); 
        System.out.println("        2. Coke             ");
        System.out.println("        3. Exit             ");
        System.out.println("============================");
        int coldDrink = Integer.parseInt(br.readLine());
        
        switch(coldDrink) {
        case 1: {
        	System.out.println("You ordered Pepsi ");
            System.out.println("Enter the  Pepsi Size ");
            System.out.println("------------------------");
            System.out.println("    1. Small Pepsi ");
            System.out.println("    2. Medium Pepsi ");
            System.out.println("    3. Large Pepsi ");
            System.out.println("------------------------");
            int pepsiSize = Integer.parseInt(br.readLine());
            switch(pepsiSize) {
            case 1:
            	itemsOrder.addItem(new SmallPepsi());
            	break;
            case 2:
            	itemsOrder.addItem(new MidiumPepsi());
            	break;
            case 3:
            	itemsOrder.addItem(new LargePepsi());
            	break;
            }
        }
        break;
        case 2: {
        	System.out.println("You ordered Coke ");
        	System.out.println("Enter the Coke size");
        	System.out.println("------------------------");
        	System.out.println("    1. Small Coke ");
        	System.out.println("    2. Medium Coke  ");
            System.out.println("    3. Large Coke  ");
            int cokeSize = Integer.parseInt(br.readLine());
            switch(cokeSize) {
            case 1:
            	itemsOrder.addItem(new SmallCoke());
            	break;
            case 2:
            	itemsOrder.addItem(new MidiumCoke());
            	break;
            case 3:
            	itemsOrder.addItem(new LargeCoke());
            	break;
            }
        }
        break;
        default:
        	break;
      }
        
      return itemsOrder;
		
	}
}
