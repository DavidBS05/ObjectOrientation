import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static Integer MAX_NUM = 50;
    private static List<Figure> figures = new ArrayList<>();

    public static List<Figure> getItems() {
        if (figures.isEmpty()) {
            doInit();
        }
        return figures;
    }

    private static List<Parallelogram> parallelograms = new ArrayList<>();

    public static List<Parallelogram> getParallelograms() {
        for (Parallelogram i : parallelograms) {
            System.out.println("paint");
        }
        return parallelograms;
    }

    private static List<Triangle> triangles = new ArrayList<>();

    public static List<Triangle> getTriangles() {
        for (Triangle i : triangles) {
            System.out.println("paint");
        }
        return triangles;
    }

    private static void doInit() {
        for (int i = 0; i < MAX_NUM; i++) {
            final int resto = i % 3;
            Figure alpha;
            switch (resto) {
                case 0:
                    alpha = new Parallelogram();
                    break;
                case 1:
                    alpha = new Square();
                    break;
                case 2:
                    alpha = new Diamond();
                default:
                    alpha = new Triangle();
                    break;
            }
            alpha.setPaint("Figure " + resto);
            figures.add(alpha);
        }
    }

    static final public void main(String... args) {
        System.out.print("Triangle, Square, Triangle, Square, Diamond");
    }
}
