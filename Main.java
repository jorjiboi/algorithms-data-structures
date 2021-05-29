import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Kakvo e ArrayList
        //ArrayList class implementira List interface i e baziran na Array struktura na danni
        // ArrayList e po predpochitan ot Array zashtoto e dobra alternativa na Arrays
        // ArrayList e dinamichen spisyk, za razlika ot Arrays

        ArrayList<String> names = new ArrayList<>();

        names.add("Georgi");            //adding elements to the ArrayList
        names.add("Evgeniya");
        names.add("Emiliya");
        names.add("Lyubomir");
        names.add("Zhasmina");
        names.add("Milen");

        System.out.println(names);

        names.add(3,"Ivan"); //dobavq Ivan na 4to mqsto
        System.out.println(names);

        names.set(5,"Djordjano");
        System.out.println(names); //Promqna na element v ArrayList

        System.out.println(names.get(5)); // konkreten index/poziciq

        Collections.sort(names);

        for (String a : names){
            System.out.println(a);
        }
    }
}
