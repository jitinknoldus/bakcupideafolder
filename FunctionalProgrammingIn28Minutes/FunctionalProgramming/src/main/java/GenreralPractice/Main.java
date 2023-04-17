package GenreralPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<Integer> printingDistictElements(List<Integer> list) {
         return list.stream().distinct().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(12);
        list.add(15);

        List<Integer> list1 = printingDistictElements(list);
        System.out.println(list1);



    }
}
