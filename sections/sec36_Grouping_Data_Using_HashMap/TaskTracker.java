package sections.sec36_Grouping_Data_Using_HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker {
    private HashMap<String, ArrayList<Integer>> completedExercises;

    public TaskTracker() {
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        // an empty list has to be added for a new user if one has not already been added
        completedExercises.putIfAbsent(user, new ArrayList<>());

        completedExercises.get(user).add(exercise);
    }

    
    public void print() {
        for (String name : completedExercises.keySet()) {
            System.out.println(name + ": " + completedExercises.get(name));
        }
    }
}
