public class MyFilter implements Filter {
    private int threshold;

    public MyFilter(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean accept(Object x) {
        if (x instanceof Integer) {
            int number = (int) x;
            return number > threshold;
        }
        return false;
    }
}

