public class Ifelse {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = a;
        String c = b+"!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(d);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
