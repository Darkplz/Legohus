
package FunctionLayer;

/**
 *
 * @author steven
 */
public class Order {
    private int id;
    private int height;
    private int width;
    private int length;
    private int sB;
    private int mB;
    private int lB;

    public Order(int height, int width, int length, int sB, int mB, int lB) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.sB = sB;
        this.mB = mB;
        this.lB = lB;
    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getsB() {
        return sB;
    }

    public int getmB() {
        return mB;
    }

    public int getlB() {
        return lB;
    }

    @Override
    public String toString() {
        return "height=" + height + ", width=" + width + ", length=" + length + ", sB=" + sB + ", mB=" + mB + ", lB=" + lB + '}';
    }
    
}

