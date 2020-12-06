import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortowanieTablicy implements Comparator<SortowanieTablicy> {
    Random rand = new Random();
    private Integer[] losowanie(Integer[] array){
        for(int i=0; i<array.length; i++){
            array[i] = rand.nextInt(30)-5;
        }
        return array;
    }

    @Override
    public int compare(SortowanieTablicy o1, SortowanieTablicy o2) {
        return 0;
    }

    public void sortowanie(Integer[] array){
        Arrays.sort(array, (a, b) -> Integer.signum(a - b));
    }

    public void program(){
        Integer[] array = new Integer[10];
        losowanie(array);
        System.out.println("Przed posortowaniem: ");
        for(Object o : array){
            System.out.print(o+" ");
        }
        sortowanie(array);
        System.out.println("\nPo posortowaniu: ");
        for(Object o : array){
            System.out.print(o+" ");
        }
    }
}
