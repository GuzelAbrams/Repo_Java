package Java_HomeWorks;

public class AnimalClass {
    int numOfLeg;
    boolean isTailPresent;
    boolean isWhiskers;
    boolean isGills;
    int teeth;


    public AnimalClass(int numOfLeg,boolean isTailPresent,boolean isWhiskers, int teeth, boolean isGills) {
        this.numOfLeg = numOfLeg;
        this.isGills=isGills;
        this.isTailPresent=isTailPresent;
        this.teeth=teeth;
        this.isWhiskers=isWhiskers;
    }


    public void swim(){
        System.out.println("can swim");
    }
    public  void run(){
        System.out.println("can run");
    }
    public void eat(){
        System.out.println("can eat");
    }
}
