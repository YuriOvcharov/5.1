/**
 * Created by student on 18.02.2015.
 */
public class dsdfas {
    public static void main(String[] args) {
        String[] names = {"Вася", "Петя", "Коля"};
        String[] greetings = greet(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(greetings[i]);
        }
    }
    public static String[] greet(String[] names){
        String[] g= new String[names.length];
        for (int i = 0; i < names.length; i++) {
            g[i] = "Привет, " + names[i] + "!";
        }
        return g;
    }
}
