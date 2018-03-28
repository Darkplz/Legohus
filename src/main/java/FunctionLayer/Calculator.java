package FunctionLayer;

public class Calculator {

    private int height;
    private int width;
    private int length;
    private int sB = 0;
    private int mB = 0;
    private int lB = 0;

    public Calculator() {
    }

    public Order calculate(int height, int width, int length) {
        int origianlH = height;
        int origianlW = width;
        int origianlL = length;
        
        
        if (length < 5 || width < 5) {
//            throw exeptionTooSmall();
            System.out.println("Dimentions must exeed 5");
            return null;
        } else {
            if (width % 2 == 1) {
                width -= 1;
                sB += 2;
            }

            if (length % 2 == 1) {
                length -= 1;
                sB += 2;
            }

            lB = ((2 * length + 2 * width - 8) / 4) * height;
            return new Order(origianlH, origianlW, origianlL, sB, mB, lB);

        }
    }

    private Exception exeptionTooSmall() {
        throw new UnsupportedOperationException("Dimentions must exeed 5");
    }

}
