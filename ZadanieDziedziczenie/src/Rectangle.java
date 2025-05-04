import java.util.ArrayList;

public class Rectangle extends Quadrangle{
    private double field;

    public final static Rectangle instance = new Rectangle();

    public Rectangle(){};

    public Rectangle(String name, ArrayList<Integer> side, float circuit, double field){
        super(name,side,circuit);
        this.name = "prostokąt";
        this.field = field;

    }

    @Override
    public Figure buildFigure(ArrayList<Integer> side) {
        Rectangle rectangle = new Rectangle();
        circuit = (float) side.get(0) + (float) side.get(1) + (float) side.get(2) +
                (float) side.get(3);
        double p = circuit/2.0;
        double a = (double)side.get(0);
        double b = (double)side.get(1);
        double c = (double)side.get(2);
        double d = (double) side.get(3);
        double x = (p-a)*(p-b)*(p-c)*(p-d);

        rectangle.setName("prostokąt");
        rectangle.setSides(side);
        rectangle.setCircuit(circuit);
        return rectangle;
    }

    public double getField() {
        return field;
    }

    public void setField(double field) {
        this.field = field;
    }

    public static Rectangle getInstance(){
        return instance;
    }
}
