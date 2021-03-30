package io.github.wonderbird.captain;

import org.junit.Test;

public class ParserTest {

    @Test
    public void testParseDegree() {
        String input = "48° 12′ 30″ N, 16° 22′ 23″ E";
        Object expected = 48.0;
        Parser sut  = new Parser();
        Object actual = sut.parse(input);
    }
}


class Coordinate {
    private double latitude;
    public double longitude;

    public double getLatitude() { return latitude; }
    public double getLongitude() { return this.longitude; }
}