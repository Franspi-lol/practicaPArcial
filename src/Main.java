import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        /*Estudiante franco = new Estudiante("Franco", "Bernardele", "francobernar", 1);
        //System.out.println(franco.toString());
        Materia programacion = new Materia("PRO","Programacion", "Benoffi","ae",50);
        Notas nota = new Notas(10,"primer",5);

        franco.agregarMaterias(programacion);
        franco.agregarNotaAMateria(nota,"PRO");
        System.out.println(franco.toString());
        //System.out.println(franco.mostrarMaterias());
        franco.toJSON("franco.JSON");*/
        Estudiante a = Estudiante.fromJSON("franco.JSON");
        System.out.println(a.toString());


    }
}