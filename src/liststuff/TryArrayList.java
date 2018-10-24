package liststuff;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TryArrayList {

    public static double averageOfList(List<Integer> al) {
        double sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        return sum/al.size();
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        int qty = ThreadLocalRandom.current().nextInt(20, 51);
        for (int i = 0; i < qty; i++) {
            al.add(ThreadLocalRandom.current().nextInt(0, 100));
        }
        System.out.println("Average is " + averageOfList(al));

        CharSequence cs = new String("Hello");
        String st = new String("Hello");
//        st.
    }
}
