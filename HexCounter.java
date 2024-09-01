public class HexCounter extends Counter {
    private int value;

    public HexCounter() {
        value = 0;
    }

    @Override
    public void increment() {
        value++;
    }

    @Override
    public void decrement() {
        value--;
    }

    @Override
    public void reset() {
        value = 0;
    }

    @Override
    public String valueAsString() {
        return Integer.toHexString(value).toUpperCase();
    }
}
