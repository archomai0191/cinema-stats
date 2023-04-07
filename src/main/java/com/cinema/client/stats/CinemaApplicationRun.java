package com.cinema.client.stats;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class CinemaApplicationRun {

	public static void main(String[] args) {
		List<Viewer> viewersList= new ArrayList<>();
		viewersList.add(new Viewer("a", 10));
		viewersList.add(new Viewer("b", 29));
		viewersList.add(new Viewer("c", 32));
		viewersList.add(new Viewer("d", 41));
		viewersList.add(new Viewer("e", 24));
		System.out.println(ViewerStatistics.averageAge(viewersList));
	}

}
