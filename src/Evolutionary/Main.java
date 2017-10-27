package Evolutionary;


public class Main {
    public static void main(String[] args) {
        Population population1 = new Population(1);
        System.out.println(population1.getIndividuals());
        for (Individual x : population1.getIndividuals()){
            System.out.println(x.getIndividual_id());
            System.out.println(x.getGenetic_makeup_list());
            System.out.println(x.getFitness_level());
        }

    }
}
