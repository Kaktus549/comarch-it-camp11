import java.util.ArrayList;

public class IsoscelesTriangle extends Triangle{

    public final static IsoscelesTriangle instance = new IsoscelesTriangle();

    public IsoscelesTriangle(){
    };

    public IsoscelesTriangle(String name, ArrayList<Integer> side, double circuit, float field){
    super(name, side, circuit, field);
    setName("Trójkąt równoramienny");
    }

    public static IsoscelesTriangle getInstance(){
        return instance;
    }

    @Override
    public Triangle buildTriangle(ArrayList<Integer> side) {
        IsoscelesTriangle triangle = new IsoscelesTriangle();
        triangle.setName("trójkąt równoramienny");
        triangle.setSides(side);
        circuit = (float) side.get(0) + (float) side.get(1) + (float) side.get(2);
        triangle.setCircuit(circuit);
        double p = circuit/2.0;
        double a = (double)side.get(0);
        double b = (double)side.get(1);
        double c = (double)side.get(2);
        double x = p*(p-a)*(p-b)*(p-c);
        triangle.setField((Math.sqrt(x)));
        return triangle;
    }
}
