package Evolutionary;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by mohammad on 10/27/17.
 */
public class PopulationTest {
    @Test
    public void getIndividuals() throws Exception {
        LinkedList<Population> populations = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            int rm = new Random().nextInt(700);
            populations.add(new Population(rm));
            assertEquals(populations.get(i).getIndividuals().size(), rm);
            System.out.println("getIndividuals method is passing! ");
        }
    }

    @Test
    public void getSurvivesLinkedList() throws Exception {

    }

    @Test
    public void survive() throws Exception {

    }

}