package Evolutionary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mohammad on 10/27/17.
 */
public class IndividualTest {
    // we can test these but it does not make sense since they are all random.
    @Test
    public void getFitness_level() throws Exception {

    }

    @Test
    public void getIndividual_id() throws Exception {
    	
    }

    @Test
    public void getGenetic_makeup_string() throws Exception {
    	Individual indi = new Individual("00101110");
    	assertEquals(indi.getGenMak(), "00101110");
    	
    	
    }

    @Test
    public void getGenetic_makeup_list() throws Exception {

    }

}