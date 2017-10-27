package Evolutionary;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Random;


class Population {
    private  LinkedList<Individual> individualLinkedList = new LinkedList<>();
    Population(Integer population_number){
        while (population_number!=0){
            individualLinkedList.add(new Individual());
            population_number--;
        }
    }
    LinkedList<Individual> getIndividuals(){
        return individualLinkedList;
    }

     Individual survive(int number_of_individuals){
         LinkedList<Individual> survive = new LinkedList<>();
         LinkedList<Double> best_fitness_level = new LinkedList<>();
         Individual winner;
         for (int i = 0; i < number_of_individuals; i++) {
             int rn = new Random().nextInt(getIndividuals().size());
             survive.add(getIndividuals().get(rn));
             best_fitness_level.add((getIndividuals().get(rn).getFitness_level()));
         }
         // Todo: what if there are tIndividuals with the same fitness level.
         winner = survive.get(best_fitness_level.indexOf(Collections.max(best_fitness_level)));
         getIndividuals().remove(winner);
        return winner;
    }
}
