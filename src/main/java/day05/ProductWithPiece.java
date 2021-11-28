package day05;

public class ProductWithPiece {

    private Type type;

    private int count=1;

    public void incrementCount(){
        count++;
    }

    public ProductWithPiece(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "ProductWithPiece{" +
                "type=" + type +
                ", count=" + count +
                '}';
    }
}
