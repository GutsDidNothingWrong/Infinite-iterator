import java.util.Random;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected final int min, max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random
                        .ints(1, min, max + 1)
                        .findFirst()
                        .getAsInt();
            }
        };
    }
}
