package net.dammak.mt;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculShouldTest {


    private Calcul calcul;

    @Before
    public void setUp() {
        calcul = new Calcul();
    }

    @Test
    public void get_10_when_sum_classique_3_and_10() {
        assertEquals(10,calcul.sommeClassique(3,7));
    }

    @Test
    public void get_20_when_sum_pondere_12_and_4() {
        assertEquals(20,calcul.sommePondere(12,4));
    }

    @Test
    public void get_9_when_sum_pondere_5_and_4() {
        assertEquals(9,calcul.sommePondere(5,4));
    }
}