package com.cinema.client.stats;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class CinemaApplicationRun {

	public static void main(String[] args) {
		List<Viewer> viewersList= new ArrayList<>();
		viewersList.add(new Viewer("a", 10, 30));
		viewersList.add(new Viewer("b", 29, 42));
		viewersList.add(new Viewer("c", 32, 195));
		viewersList.add(new Viewer("d", 41, 4));
		viewersList.add(new Viewer("e", 24, 14));
		System.out.println(ViewerStatistics.averageAge(viewersList));
	}

}
