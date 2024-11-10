package chapter05;

import java.util.List;
import static java.util.stream.Collectors.*;

import java.util.Arrays;

import bean.Dish;
import bean.Dish.Type;

public class Filtering {

	public static void main(String[] args) {
		
		List<Dish> menu = Dish.menu;
		
		// filtering with predicate
		List<Dish> vegetarianMenu = menu.stream().filter(Dish::isVegetarian).collect(toList());
		System.out.println(vegetarianMenu);
		System.out.println();
		
		// filtering unique elements
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
		
		System.out.println();
		
		// filtering with a given size/truncated stream
		List<Dish> dishes = menu.stream().filter(d -> d.getCalories() > 300).limit(3).collect(toList());
		System.out.println(dishes);
		
		// skipping elements
		System.out.println();
		dishes = menu.stream().filter(d -> d.getCalories() >300).skip(2).collect(toList());
		System.out.println(dishes);
		
		// quiz 5.1
		System.out.println();
		List<Dish> meatDishes = menu.stream().filter(d -> d.getType() == Dish.Type.MEAT).collect(toList());
		System.out.println(meatDishes);
		
	}
	
}
