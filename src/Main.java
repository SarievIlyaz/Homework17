public class Main {
    public static void main(String[] args) {
        Shape square=new Sguare("Kvadrat",5);
        System.out.println(square);
        System.out.println(square.getPerimeter());

        Shape rectangle = new Rectangle("Prymougolnik",3,4);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());

        Shape triangle = new Triangle("Treugolnik",5,6);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());

    }
}