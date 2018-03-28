
package FunctionLayer;

/**
 *
 * @author steven
 */
public class Order {
    private int user_id;
    private int height;
    private int width;
    private int length;
    private int sB;
    private int mB;
    private int lB;

    public Order(int height, int width, int length, int sB, int mB, int lB, int user_id) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.sB = sB;
        this.mB = mB;
        this.lB = lB;
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
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

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
}

