package kea.dk;

public class Main {
    public static void main(String[] args) {
       Lampe l1=new Lampe("stuelampe", true);
       Lampe l2=new Lampe("skrivebordslampe");

       System.out.println(l1);
       System.out.println(l2);

       l1.toggel();

       System.out.println(l1);

       l1.toggel();

       System.out.println(l1.isOn());

    }
}