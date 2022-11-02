public class Teksty {

    public static void main(String[] args) {
        String z = " ";
        String powitanie = "Cześć!";
        String s = powitanie.substring(0, 3);
        String w = powitanie.substring(3);
        System.out.println(s);
        System.out.println(w);
        System.out.println(powitanie);
        System.out.println(s.equals(w));
        System.out.println(powitanie.equalsIgnoreCase("cześć!"));
        System.out.println(w.repeat(5));
        System.out.println(w.toUpperCase());
        System.out.println(powitanie.length());
        System.out.println(powitanie.startsWith("Cz"));
    }




}
