public class Dog extends Pet {

    private String name;

    public Dog(String name) {
        System.out.println("I'm a dog and my name is: " + name);
    }
    public void play() {
        System.out.println("Dog plays");
    }
}
