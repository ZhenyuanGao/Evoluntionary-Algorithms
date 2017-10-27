package Evolutionary;

import java.util.LinkedList;


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
}
