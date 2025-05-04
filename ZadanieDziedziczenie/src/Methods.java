import java.util.ArrayList;

public class Methods {

    private final static EquilateralTriangle equilateralTriangle = EquilateralTriangle.getInstance();
    private final static IsoscelesTriangle isoscelesTriangle = IsoscelesTriangle.getInstance();
    private final static Triangle triangle = Triangle.getInstance();
    private final static Quadrangle quadrangle = Quadrangle.getInstance();
    private final static Rectangle rectangle = Rectangle.getInstance();


    public static Integer determineFigure(ArrayList<Integer> sides){
        return sides.size();


    }

    public static Object buildFigure(int determineFigure, ArrayList<Integer> sides){


        switch(determineFigure){

            case 3:
                defineTriangleType(sides);
            case 4:
                defineQuadrangleType(sides);
            case 5:
            case 6:


        }
        return null;


    }
    public static Triangle defineTriangleType(ArrayList<Integer> sides){
        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);
        if(a > 0 && b > 0 && c > 0 && (a+b) > c && (a+c) > b
                && (b+c) > a) {
            if(a == b && b == c){
                return equilateralTriangle.buildTriangle(sides);
            } else if (a == b || b == c || a == c) {
                return isoscelesTriangle.buildTriangle(sides);
            } else{
                return triangle.buildTriangle(sides);
            }
        }else{
            System.out.println("Nie da się stworzyć trójkąta z podanych boków!");
            return null;
        }
    }

    public static Figure defineQuadrangleType(ArrayList<Integer> sides){
        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);
        int d = sides.get(3);
        if(a < (b + c + d) && b < (a + c + d) && c < (a + b + d) &&
                d < (a + b + c)){
            if((a == b && c == d) || ((a == c) && (b == d)) || ((a == d) && (b == c))){
                Rectangle rect = rectangle.buildFigure(sides);
                rect.setField

            } else if (a == b && a == c && a == d) {
                return null;
            }else{
                return quadrangle.buildFigure(sides);
            }
        }else{
            return null;
        }


    }

}
