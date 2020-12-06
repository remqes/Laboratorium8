import java.util.ArrayList;
import java.util.List;

public class WypisanieListy{
    ArrayList<String> list = new ArrayList<>();

    private ArrayList dodanieDoListy(ArrayList list){
        list.add("Programowanie obiektowe w Java");
        list.add("Architektura procesorów i programowanie niskopoziomowe");
        list.add("Matematyka dla Informatyków");
        list.add("Podstawy Elektrotechniki i informatyki");
        list.add("Metrologia");
        return list;
    }
    private void wykonanieProgramu(Zadanie1 z1, List<String> list){
        list.forEach(z1::lancuchznakow);
    }
    public void program(){
        dodanieDoListy(list);
        wykonanieProgramu(z1 -> System.out.println(z1), list);
    }

}

