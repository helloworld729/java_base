package p38_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {
    public static void main(String[] args) {
        Map<String, Double> map_Data = new HashMap<String, Double>();
        map_Data.put("A", 0.98);
        map_Data.put("B", 0.50);
        map_Data.put("C", 0.76);
        map_Data.put("D", 0.23);
        map_Data.put("E", 0.85);
        System.out.println(map_Data);
        // python items
        List<Map.Entry<String, Double>> list_Data = new ArrayList<Map.Entry<String, Double>>(map_Data.entrySet());

        Collections.sort(list_Data, new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return o1.getValue() > o2.getValue() ? 1: -1;
            }
        }.reversed());

        System.out.println(list_Data);

        System.out.println(list_Data.stream().map(x -> x.getKey()).collect(Collectors.toList()));;

    }
}