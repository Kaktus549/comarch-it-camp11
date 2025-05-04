import java.util.ArrayList;

public class Figure {
    protected String name;
    protected ArrayList<Integer> sides;
    protected float circuit;
    protected double field;

    public final static Figure instance = new Figure();

    public Figure(){

    };

    public Figure(String name, ArrayList<Integer> side, float circuit){
        this.name = "wielokąt";
        this.sides = side;
        this.circuit = circuit;


    }
    public Figure buildFigure(ArrayList<Integer> side){

        name = "wielokąt";
        circuit = (float) side.get(0) + (float) side.get(1) + (float) side.get(2);

        return new Figure(name, side, circuit);

    }


    @Override
    public String toString() {
        return new StringBuilder().append("Figura: ")
                .append(this.getName())
                .append(" Boki: ")
                .append(getSides())
                .append(" Obwód: ")
                .append(getCircuit())
                .toString();

    }

    public static Figure getInstance(){
        return instance;
    }

    public float getCircuit() {
        return circuit;
    }

    public void setCircuit(float circuit) {
        this.circuit = circuit;
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

    public double getField() {
        return field;
    }

    public void setField(double field) {
        this.field = field;
    }
}
