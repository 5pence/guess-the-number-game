package spencer.barriball;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    // == fields ==
    private final Random random = new Random();

    @Autowired
    @MaxNumber
    private int maxNumber;

    @Autowired
    @MinNumber
    private int minNumber;

    // == public methods ==
    @Override
    public int next() {
        return getRandomNumberInRange(minNumber, maxNumber);
    }

    private static int getRandomNumberInRange(int minNumber, int maxNumber) {
        if (minNumber >= maxNumber) {
            throw new IllegalArgumentException("Max number must be greater than min number");
        }
        return (int)(Math.random() * ((maxNumber - minNumber) + 1)) + minNumber;
    }

    @Override
    public int getMinNumber() {
        return minNumber;
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
