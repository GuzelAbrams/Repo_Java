package Java_HomeWorks;

public class CatClass extends AnimalClass {
    String color;



    public CatClass(int numOfLeg, boolean isTailPresent, boolean isWhiskers, int teeth, boolean isGills, String color) {
        super(numOfLeg, isTailPresent, isWhiskers, teeth, isGills);
        this.color=color;
    }
    @Override
    public void swim(){
        System.out.println("doesn't like swim");
    }
}
