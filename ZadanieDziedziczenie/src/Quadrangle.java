import java.util.ArrayList;

public class Quadrangle extends Figure{

    public final static Quadrangle instance = new Quadrangle();

    public Quadrangle(){};

    public Quadrangle(String name, ArrayList<Integer> side, float circuit){
        super(name,side,circuit);
        this.name = "czworokąt";

    }

    @Override
    public Figure buildFigure(ArrayList<Integer> side) {
        Quadrangle quadrangle = new Quadrangle();
        circuit = (float) side.get(0) + (float) side.get(1) + (float) side.get(2) +
                (float) side.get(3);

        quadrangle.setName("czworokąt");
        quadrangle.setSides(side);
        quadrangle.setCircuit(circuit);
        return quadrangle;
    }

    public static Quadrangle getInstance(){
        return instance;
    }
}
