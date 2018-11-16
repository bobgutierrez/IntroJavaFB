package generalization;

public class ProfessionalPhotographer implements Photographer {
    @Override
    public String takePicture(String subject) {
        return "Here's a lovely picture of " + subject;
    }
}
