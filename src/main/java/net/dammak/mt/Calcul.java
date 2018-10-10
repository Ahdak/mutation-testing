package net.dammak.mt;

/**
 *
 * @author ahmeddammak
 */
public class Calcul {

    protected int sommeClassique(int a, int b) {
        return  a+b ;
    }

    protected int sommePondere(int a, int b) {
        if (a < 10) {
            return a+b ;
        } else {
            return a + 2*b ;
        }
    }
}
