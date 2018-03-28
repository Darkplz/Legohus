package FunctionLayer;

public class Brick {
    private int id;
    private int height;
    private int widht;
    private int lenght;

    public Brick(int id ,int height, int widht, int lenght) {
        this .id = id;
        this.height = height;
        this.widht = widht;
        this.lenght = lenght;
    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    public int getWidht() {
        return widht;
    }

    public int getLenght() {
        return lenght;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

}
