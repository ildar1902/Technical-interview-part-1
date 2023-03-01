public class Main {
    public static void main(String[] args) {

        String s1 = "шалаш";
        StringBuilder sb1 = new StringBuilder (s1);
        System.out.println("слово в изначальном виде: " + s1);
        String s2 = sb1.reverse().toString();
        System.out.println("слово в обратном порядке: " + s2);
        if (s1.equals(s2)) {
            System.out.println(s1 + " это палиндром");
        } else {
            System.out.println(s1 + " это НЕ палиндром!");
        }
    }
}
