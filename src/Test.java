public class Test {
    public static void main(String[] args) {
        Dog myDog = new Dog("Jonny");
        Cat myCat = new Cat("Emily");

        System.out.println("The number of Paws a dog has: " + myDog.getLegs());
        myCat.sleep();
    }
}
