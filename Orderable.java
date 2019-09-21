class Orderable{
    private final int id;
    private final String type;
    private final String name;
    private final int price;

    public Orderable(){
        id = 0;
        type = "";
        name = "";
        price = 0;
    }

    public Orderable(int id, String type, String name, int price){
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public int getId(){
        return this.id;
    }

    public String getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }
}