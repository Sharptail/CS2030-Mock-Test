import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Menu{
    private List<Orderable> menuList = new ArrayList<>();

    public Menu(){}

    public Food add(String type, String name, int price){
        Food newFood = new Food(this.getMenuSize(), type, name, price);
        menuList.add(newFood);
        return newFood;
    }

    public int getMenuSize(){
        return this.menuList.size();
    }

    public Orderable getOderableFood(int i){
        return this.menuList.get(i);
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        String str = "";
        Map<String, List<Orderable>> map = this.menuList.stream().collect(Collectors.groupingBy(Orderable::getType)); 
        for(List<Orderable> orderableList: map.values()){
            for(Orderable orderable: orderableList){
                str += orderable.toString() + "\n";
            }
        }
        //test
        return str;
    }
}