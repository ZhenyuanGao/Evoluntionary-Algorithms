package Evolutionary;

import java.util.Collections;
import java.util.LinkedList;

class Individual {
    private LinkedList<String> genetic_makeup_list = new LinkedList<>();
    private static int id_genarator=0;
    private String genetic_makeup;
    private int fitness_level;
    private int individual_id;

    // order matters.
    Individual(){
        set_getIndividual_id_per_individual();
        set_genetic_makeup_per_individual();
        setGenetic_makeup_list();
        set_fitness_level_per_individual();
    }
    private void  set_getIndividual_id_per_individual(){
        individual_id = id_genarator++;
    }
    // This method is going to create a random string that is 8 digits long of 0's and 1's.
    private String set_genetic_makeup_per_individual(){
        genetic_makeup =  Integer.toBinaryString(128 + (int) (127 * Math.random()));
        return genetic_makeup;
    }

    // Todo: you might wanna fix the math.
    private double set_fitness_level_per_individual(){
        fitness_level =  Collections.frequency(getGenetic_makeup_list(), "1");
        return fitness_level / 8.0;
    }

    private void setGenetic_makeup_list(){
        Collections.addAll(genetic_makeup_list, getGenetic_makeup_string().split(""));
    }

    float getFitness_level(){
        return fitness_level;
    }
    int getIndividual_id(){
        return individual_id;
    }
    String getGenetic_makeup_string(){
        return genetic_makeup;
    }
    LinkedList<String> getGenetic_makeup_list(){
        return genetic_makeup_list;
    }

}
