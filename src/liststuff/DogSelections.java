package liststuff;

import java.util.Arrays;
import java.util.List;

interface DogCriterion {
    boolean test(Dog d);
}

class OldDogCriterion implements DogCriterion {
    private int age;
    public OldDogCriterion(int age) {
        this.age = age;
    }
    @Override
    public boolean test(Dog d) {
        return d.getAge() > age;
    }
}

class YoungDogCriterion implements DogCriterion {
    private int age;
    public YoungDogCriterion(int age) {
        this.age = age;
    }
    @Override
    public boolean test(Dog d) {
        return d.getAge() < age;
    }
}


public class DogSelections {
    public static void showAllDogs(List<Dog> ld) {
        for (int idx = 0; idx < ld.size(); idx++) {
            System.out.println(ld.get(idx));
        }
        System.out.println("----------------------------");
    }

//    public static void showOldDogs(List<Dog> ld, int threshold) {
//        for (Dog d : ld) {
//            if (d.getAge() > threshold) {
//                System.out.println(d);
//            }
//        }
//        System.out.println("----------------------------");
//    }
//
//    public static void showYoungDogs(List<Dog> ld, int threshold) {
//        for (Dog d : ld) {
//            if (d.getAge() < threshold) {
//                System.out.println(d);
//            }
//        }
//        System.out.println("----------------------------");
//    }
//
    public static void showDogsByCriterion(List<Dog> ld, DogCriterion criterion) {
        for (Dog d : ld) {
            if (criterion.test(d)) {
                System.out.println(d);
            }
        }
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        List<Dog> ld = Arrays.asList(
                new Dog("Pluto", 50),
                new Dog("Snoopy", 40),
                new Dog("ScoobyDoo", 30),
                new Dog("Lassie", 45),
                new Dog("Mutley", 35),
                new Dog("Huckleberry", 50),
                new Dog("Toto", 35)
        );
        showAllDogs(ld);
//        showOldDogs(ld, 40);
//        showOldDogs(ld, 45);
//        showYoungDogs(ld, 45);

        showDogsByCriterion(ld, new OldDogCriterion(35));
        showDogsByCriterion(ld, new OldDogCriterion(45));
        showDogsByCriterion(ld, new YoungDogCriterion(45));

    }
}
