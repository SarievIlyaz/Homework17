public class Triangle extends Shape{
    private int weigth;
    private int length;

    public Triangle(String name, int weigth, int length) {
        super(name);
        this.weigth = weigth;
        this.length = length;
    }

    @Override
    public int getPerimeter() {
        return length+weigth+length;
    }
}
