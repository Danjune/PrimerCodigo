//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int varA = 35;
        int varB = 20;

        System.out.println("varA: " + varA );
        System.out.println("varB: " + varB );

        int cola = varA;
        varA = varB;
        varB = cola;


        System.out.println("Now:");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);

    }
}