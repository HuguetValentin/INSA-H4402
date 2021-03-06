package agile.pathfinding;

import java.util.ArrayList;
import java.util.Iterator;

public class TSP1 extends TemplateTSP {

    @Override
    protected Iterator<Integer> iterator(Integer sommetCrt, ArrayList<Integer> nonVus, float[][] cout, int[] duree) {

	    return new IteratorSeq(nonVus, sommetCrt);
    }

    @Override
    protected float bound(Integer sommetCourant, ArrayList<Integer> nonVus, float[][] cout, int[] duree) {

        return 0;
    }
}
