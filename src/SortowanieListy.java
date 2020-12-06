import java.util.Arrays;
import java.util.Comparator;

public class SortowanieListy implements Comparator<SortowanieListy> {

    private String[] dodanieDoListy(String[] list){
        list[0] = "Pierwszy [8];";
        list[1] = "Drugi [5];";
        list[2] = "Trzeci [6];";
        list[3] = "Czwarty [7];";
        list[4] = "Piąty [5];";
        return list;
    }

    @Override
    public int compare(SortowanieListy o1, SortowanieListy o2) { return 0; }

    public void sortowanie(String[] list){
        Arrays.sort(list, (String a, String b) -> Integer.signum(a.length()-b.length()));
    }
    public void program(){
        String[] list = new String[5];
        dodanieDoListy(list);
        System.out.println("Przed sortowaniem: ");
        for(Object o : list){
            System.out.print(o+" ");
        }
        System.out.println("\nPo sortowaniu: ");
        sortowanie(list);
        for (Object o : list){
            System.out.print(o+" ");
        }
    }

}
