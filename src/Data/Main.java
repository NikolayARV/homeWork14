package Data;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            Data.checkLogin("524iok_Llkjhbjkhkjhl");
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        }
        Data.checkData("login", "pass_word9", "pass_word9");


        Random random = new Random();
        Set<Exercise> exercises = new HashSet<>();
        while (exercises.size() < 15) {
            Exercise exercise = new Exercise(random.nextInt(10), random.nextInt(10));
            exercises.add(exercise);
            System.out.println(exercise);
        }

    }


}

