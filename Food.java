class Food extends Orderable{

    public Food(int id, String type, String name, int price){
        super(id, type, name, price);
    }

    @Override
    public String toString(){
        return String.format("#%d %s: %s (%d)", this.getId(), this.getType(), this.getName(), this.getPrice());
    }
}