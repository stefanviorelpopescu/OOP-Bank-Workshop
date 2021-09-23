package util;

import org.apache.commons.math3.random.RandomDataGenerator;

public class Generators
{
    public static long getGeneratedLong()
    {
        long leftLimit = 20_000_000L;
        long rightLimit = 99_000_000L;
        return new RandomDataGenerator().nextLong(leftLimit, rightLimit);
    }
}
