public class Pet extends Animal {
    private String name;
    private int tail = 1;
    private int legs = 4;

    public Pet() {
        super();
        System.out.println("I'm an pet");
        setEyes(2);
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void jump() {
        System.out.println("Pet run and jumps");
    }
}
