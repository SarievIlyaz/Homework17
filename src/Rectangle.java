public class Rectangle extends Shape{
    private int length;
    private int weigth;

    public Rectangle(String name, int length, int weigth) {
        super(name);
        this.length = length;
        this.weigth = weigth;
    }


    @Override
    public int getPerimeter() {
        return length*2+weigth*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", weigth=" + weigth +
                '}'+super.toString();
    }
}
