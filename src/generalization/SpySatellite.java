package generalization;

public class SpySatellite implements Photographer, Flyer {
    @Override
    public String takePicture(String subject) {
        return "Here's a grainy picture of " + subject + " taken from 50 miles above the earth's surface";
    }

    @Override
    public void takeOff() {
        System.out.println("Whoosh roar, smell of burning hydarzine, rocket leaves ground");
    }
}
