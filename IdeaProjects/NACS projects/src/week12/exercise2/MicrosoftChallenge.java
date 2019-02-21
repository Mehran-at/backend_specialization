/*package exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MicrosoftChallenge {

    protected static Integer getNumberOfPermutations(List<Integer> integers) {
        Integer numberOfPermutations = 0;
        Integer times = 0;
        for (Integer number : integers) {
            //for (int nextNumber = 1; nextNumber <= 11; nextNumber++) {
                numberOfPermutations = number * (number);
                times++;
                //numberOfPermutations = nextNumber;
                //nextNumber = number * nextNumber;
            }
        return numberOfPermutations;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> temporaryList = new ArrayList<>();
            for (int times = 0; times < 6; times++) {
                //for (int times = 0; times < 3; times++) {
                IntStream.range(1,4)
                        .boxed()
                        .map(e -> temporaryList.add(e))
                        .distinct()
                        //.limit(3)
                        .filter(e -> !temporaryList.contains(e))
                        .collect(Collectors.toList());
                Stream.of(temporaryList)
                        .filter(e -> !finalList.contains(e))
                        .(permutation -> finalList.add(permutation));
                //.filter(e->tempraryList.contains(e)
                // for (int time = 0; time < getNumberOfPermutations(numbers); time++) {
            }

            System.out.println(finalList);
            System.out.println(temporaryList);

        }
    }*/



