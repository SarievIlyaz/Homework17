public class Sguare extends Shape {
    private int weigth;

    public Sguare(String name, int weigth) {
        super(name);
        this.weigth = weigth;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    @Override
    public int getPerimeter() {
        return weigth*4;
    }

    @Override
    public String toString() {
        return "Sguare{" +
                "weigth=" + weigth +
                '}'+super.toString();
    }
}
