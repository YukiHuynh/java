package thread;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;

public class Ex06WebCrawler {

	private static final int maxDepth = 2;
	private static final int maxThreads = 4;
	
	private final Set< String > visitedUrls = new HashSet< >();
	
	public void craw(String url, int depth) {
		if(depth > maxDepth || visitedUrls.contains(url)) {
			return;
		}
		
		visitedUrls.add(url);
		System.out.println("Crawlng: " + url);
		/*
		try {
			Document document = Jsoup.connect(url)
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
	
}
