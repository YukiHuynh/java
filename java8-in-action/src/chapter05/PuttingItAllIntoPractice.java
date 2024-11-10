package chapter05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import bean.Trader;
import bean.Transaction;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingItAllIntoPractice {

	public static void main(String[] args) {
		
		Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );
		
		List<Transaction> transactionsIn2011SmallToHigh = 
				transactions.stream()
				.filter(y -> y.getYear() == 2011)
				.sorted(comparing(Transaction::getValue))
				.collect(toList());
		generate("1. All transactions in the year 2011 from low to high", transactionsIn2011SmallToHigh);
		
		List<String> uniqueCity = 
				transactions.stream()
				.map(t -> t.getTrader().getCity())
				.distinct()
				.collect(toList());
		generate("2. All the unique cities where the traders work", uniqueCity);
		
		List<Trader> tradersFromCambrideByName = 
				transactions.stream()
				.map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge"))
				.distinct()
				.sorted(comparing(Trader::getName))
				.collect(toList());
		generate("3. All traders from Cambridge and sort them by name", tradersFromCambrideByName);
		
		String traderNameStr = 
				transactions.stream()
				.map(transaction -> transaction.getTrader().getName())
				.distinct()
				.sorted()
				.reduce("", (n1, n2) -> n1 + n2);
		System.out.print(generate("4. All traders’ names to string sorted alphabetically", traderNameStr));
		
		boolean areThereTraderInMilan = 
				transactions.stream()
				.anyMatch(t -> t.getTrader().getCity().equals("Milan"));
		List<Transaction> traderInMilan = 
				transactions.stream()
				.filter(t -> t.getTrader().getCity().equals("Milan"))
				.collect(toList());
		
		System.out.println("5. All traders’ names to string sorted alphabetically");
		if(!areThereTraderInMilan) {
			System.out.println("No!");
		} else {
			System.out.println("Yes");
			generate("Trader(s) infomation", traderInMilan);
		}
		
		System.out.println("6. All transactions’ values from the traders living in Cambridge: ");
		transactions.stream()
					.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
					.map(Transaction::getValue)
					.forEach(System.out::println);
		System.out.println();
		
		Optional<Integer> highestValueTransactions = 
				transactions.stream()
				.map(Transaction::getValue)
				.reduce(Integer::max);
		
		System.out.println("7. The highest value of all the transactions: " + highestValueTransactions + "\n");
		
		Optional<Transaction> smallestValueTransaction = 
				transactions.stream()
				.min(comparing(Transaction::getValue));
		System.out.println("8. The smallest value of all the transactions: " + smallestValueTransaction + "\n");
		
		
	}
	
	private static <T> void generate(String prefix, List<T> list) {
		System.out.println(prefix + " --> ");
		list.forEach(e -> System.out.println(" +   " + e));
		System.out.println("\n");
	}
	
	private static String generate(String prefix, String string) {
		StringBuilder result = new StringBuilder(prefix + " -->\n");
		char[] charArr = string.toCharArray();
		for (char s : charArr) {
	        result.append(" +   ").append(s).append("\n");
	    }
		result.append("\n");
	    return result.toString();
	}
	
}
