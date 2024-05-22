//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Variables a intercambiar
        int varA = 35;
        int varB = 20;

        //Mostrar valores primero
        System.out.println("varA: " + varA );
        System.out.println("varB: " + varB );

        //Usar una variable auxiliar y cambiar los valores
        int cola = varA;
        varA = varB;
        varB = cola;

        //Mostrar los valores nuevos.
        //comentario git:
        System.out.println("Now:");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);

    }
}