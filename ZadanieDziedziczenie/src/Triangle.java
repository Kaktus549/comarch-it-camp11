import java.util.ArrayList;

public class Triangle {
    protected String name;
    protected ArrayList<Integer> sides;
    protected double field;
    protected float circuit;

    public final static Triangle instance = new Triangle();
    private final static Triangle triangle = Triangle.getInstance();
    private final static EquilateralTriangle equilateralTriangle = EquilateralTriangle.getInstance();
    private final static IsoscelesTriangle isoscelesTriangle = IsoscelesTriangle.getInstance();

    public Triangle(){

    };

    public Triangle(String name, ArrayList<Integer> side, double field, float circuit){
        this.name = "trójkąt";
        this.sides = side;
        this.field = field;
        this.circuit = circuit;

    }


    public Triangle buildTriangle(ArrayList<Integer> side ){

        name = "trójkąt";
        circuit = (float) side.get(0) + (float) side.get(1) + (float) side.get(2);
        double p = circuit/2.0;
        double a = (double)side.get(0);
        double b = (double)side.get(1);
        double c = (double)side.get(2);
        double x = p*(p-a)*(p-b)*(p-c);
        field = (Math.sqrt(x));
        return new Triangle(name, side, field, circuit);

    }



    @Override
    public String toString() {
        return new StringBuilder().append("Figura: ")
                .append(this.getName())
                .append(" Boki: ")
                .append(getSides())
                .append(" Obwód: ")
                .append(getCircuit())
                .append(" Pole: ")
                .append(getField()).toString();
    }

    public static Triangle getInstance(){
        return instance;
    }


    public float getCircuit() {
        return circuit;
    }

    public void setCircuit(float circuit) {
        this.circuit = circuit;
    }

    public double getField() {
        return field;
    }

    public void setField(double field) {
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public void setSides(ArrayList<Integer> sides) {
        this.sides = sides;
    }
}
