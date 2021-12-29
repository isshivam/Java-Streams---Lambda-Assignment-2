import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterPrimeNumber {

    public static List<Integer> primeNumbers(List<Integer> numbersList){
        return numbersList.stream().filter(num -> IntStream.rangeClosed(2, num /2).noneMatch(i -> num %i == 0))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        Random random = new Random();
        random.ints(100,1,100).forEach(value -> numbersList.add(value));
        List<Integer> prime = FilterPrimeNumber.primeNumbers(numbersList);
        System.out.println("Prime numbers: "+prime);
    }

}