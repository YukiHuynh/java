package chapter06;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

import bean.Dish;

public class Summarizing {

	public static void main(String[] args) {
		
		List<Dish> menu = Dish.menu;
		
		System.out.println("Number of dishes: " + (menu.stream().count()) + "\n");
		
		Comparator<Dish> dishCaloriesComparator = Comparator.comparing(Dish::getCalories);
		Optional<Dish> mostCalories = menu.stream().collect(maxBy(dishCaloriesComparator));
		System.out.println("Highest calory dish: " + mostCalories + "\n");
		
		System.out.println("Total calories: " + (menu.stream().collect(summingInt(Dish::getCalories))) + "\n");
		
		System.out.println("Average calories: " + (menu.stream().collect(averagingInt(Dish::getCalories))) + "\n");
		
		IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));
		System.out.println("Menu statistics: " + menuStatistics + "\n");
		
		// String shortMenu = menu.stream().collect(joining());
		System.out.println("Short Menu: " + (menu.stream().map(Dish::getName).collect(joining())) + "\n");
		
		System.out.println("Short Menu improved: " 
						+ (menu.stream().map(Dish::getName).collect(joining(", "))) 
						+ "\n");
		
		// reduce method
		Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
		List<Integer> numbers = stream.reduce(
									new ArrayList<Integer>(),
									(List<Integer> l, Integer e) -> {
										l.add(e);
										return l;
									}, (List<Integer> l1, List<Integer> l2) -> {
										l1.addAll(l2);
										return l1;
									}
								);
		
		System.out.println("reduce method " + numbers + "\n");
		
		System.out.println("Total calories (shorten): " 
							+ (menu.stream().collect(reducing(0, Dish::getCalories, Integer::sum)))
				);
		
	}
	
}
