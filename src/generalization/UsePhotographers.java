package generalization;

import java.util.Arrays;
import java.util.List;

public class UsePhotographers {
    public static void main(String[] args) {
        SpySatellite ss = new SpySatellite();
        List<Photographer> lp = Arrays.asList(
                new ProfessionalPhotographer(),
                ss
        );

        ss.takeOff();

        for (Photographer p : lp) {
            System.out.println(p.takePicture("My Kids"));
        }
    }
}
