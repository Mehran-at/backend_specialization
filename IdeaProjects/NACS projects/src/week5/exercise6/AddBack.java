package week5.exercise6;

public class AddBack implements Step {
    @Override
    public void perform(Furniture furniture, Integer numberOfTimes) {
        Integer times = 1;
        while (times <= numberOfTimes) {
            times = times + 1;
            furniture.add("back");

        }
    }
}
