import java.util.List;
import java.util.ArrayList;

class Combo extends Orderable{
    private final List<Orderable> foodList = new ArrayList<>();

    public Combo(int id, String type, String name, int price, List<Orderable> foodList){
        super(id, type, name, price);
    }
}