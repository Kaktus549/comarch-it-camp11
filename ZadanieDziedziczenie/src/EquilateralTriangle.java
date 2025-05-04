import java.util.ArrayList;

public class EquilateralTriangle extends Triangle{

    public final static EquilateralTriangle instance = new EquilateralTriangle();

    private EquilateralTriangle() {

    }




    /*public EquilateralTriangle(ArrayList<Integer> side){
        this.name = "trójkąt równoboczny";
        this.circuit = 3 * (float) side.get(0);
        this.sides = side;
        double a = (double)side.get(0);
        this.field = (a*a*Math.sqrt(3))/4.0;

    }*/

    public EquilateralTriangle(String name, ArrayList<Integer> side, double field, float circuit){
        super(name, side, field, circuit);
        setName("Trójkąt równoboczny");
        double a = (double)side.get(0);
        setField((a*a*Math.sqrt(3))/4.0);

    }

    @Override
    public Triangle buildTriangle(ArrayList<Integer> side) {

        name = "Trójkąt równoboczny";
        double a = (double)side.get(0);
        field = (a*a*Math.sqrt(3))/4.0;
        circuit = ((float) side.get(0) + (float) side.get(1) + (float) side.get(2));
        return new EquilateralTriangle(name, side, field, circuit);
    }

    public static EquilateralTriangle getInstance(){
        return instance;
    }


}
