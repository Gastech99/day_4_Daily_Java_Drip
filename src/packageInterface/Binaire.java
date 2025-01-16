package packageInterface;

public class Binaire implements TraitementInterface1, TraitementInterface2 {
    private int x, y;
    public Binaire(int x, int y){
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void print() {
        System.out.println("Addition : "+add());
        System.out.println("Multiplication : "+mult());
    }

    @Override
    public int add() {
        return x + y;
    }

    @Override
    public int mult() {
        return x * y;
    }
}
