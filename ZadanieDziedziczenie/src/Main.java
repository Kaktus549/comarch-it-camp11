import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wpisz od 3 do 6 cyfr, oddzielonych spacją: ");
        String temp = scanner.nextLine();
        ArrayList<Integer> intList = new ArrayList<>();
        for(char character : temp.toCharArray()){
            if(character!=' '){
                intList.add(Character.getNumericValue(character));
            }
        }
        System.out.println(intList);


        System.out.println(Methods.buildFigure(Methods.determineFigure(intList),intList));




    }
}
