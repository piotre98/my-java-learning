import java.util.ArrayList;

public class array_list {

    public static void main(String[] args){

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "papież");
        food.remove(1);
        food.clear();

        for(int i=0; i<food.size(); i++) {

            System.out.println(food.get(i));

        }

    }

}
