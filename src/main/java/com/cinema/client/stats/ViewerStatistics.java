package com.cinema.client.stats;
import java.util.*;

public class ViewerStatistics {
    public static int averageAge(List<Viewer> viewerList) {
        OptionalDouble res = viewerList.stream().mapToInt(Viewer::getAge).average();
        return res.isPresent()? (int)res.getAsDouble() : 0;
    }
}
