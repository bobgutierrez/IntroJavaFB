package usealist;

import java.util.ArrayList;
import java.util.List;

public class ListStuff {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        System.out.println("Count of items in list is " + names.size());

        names.add("Jim");
        names.add("Fred");
        names.add("Sheila");
        System.out.println(names);
        System.out.println("Count of items in list is " + names.size());

//        String numberOne = names.get(1);
//        System.out.println(numberOne);

        System.out.println(names.get(1));

        names.add(0, "William");

        String numberOne = names.get(1);
        System.out.println(numberOne);

        System.out.println(names);

        int positionOfFred = names.indexOf("Fred");
        System.out.println("Fred found at position " + positionOfFred);
        names.add(positionOfFred, "Alice");
        System.out.println(names);

        int positionOfJim = names.indexOf("Jim");
        System.out.println("Postiion of Jim is " + positionOfJim);
        names.add(positionOfJim, "Maverick");
        System.out.println(names);


    }
}
