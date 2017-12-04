public class Dog extends Animal {

   private int eyes;
   private int legs;
   private int tail;
   private int teeth;
   private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail,int teeth,String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew () {
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void walk () {
        System.out.println("dog.walk() called");
        super.move(5);
    }

    public void run () {
        System.out.println("dog.run() called");
        move(10);
    }

    private void movelegs(int speed){
        System.out.println("dog.moveLegs() called");
    }
    @Override
   public void move(int speed) {
        System.out.println("dog.move() called");
        movelegs(speed);
        super.move(speed);
    }
}
