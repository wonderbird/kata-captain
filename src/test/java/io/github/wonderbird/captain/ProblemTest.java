package io.github.wonderbird.captain;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemTest {
    
    @Test
    public void testSamePointResultsInZeroDistance() {
        Problem myProblem = new Problem();
        double result = myProblem.distance("48° 12′ 30″ N, 16° 22′ 23″ E", "48° 12′ 30″ N, 16° 22′ 23″ E");
        assertEquals( 0.0, result, 10.0 );
    }

    @Test
    public void test1DegreeNorthLeadsTo60nm() {
        Problem myProblem = new Problem();
        double result = myProblem.distance("48° 12′ 30″ N, 16° 22′ 23″ E", "47° 12′ 30″ N, 16° 22′ 23″ E");
        assertEquals( 60.0 * 1.852, result, 10.0 );
    }

}
