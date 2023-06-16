import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.HashMap;

public class Estudiante implements GestorJson
{
    private String nombre;
    private String apellido;
    private String mail;
    private int legajo;
    //private LocalDate fechaNacimiento;
    private MapaGenerico<Materia> materias;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String mail, int legajo)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.legajo = legajo;
        //this.fechaNacimiento = fechaNacimiento;
        this.materias = new MapaGenerico<>();
    }

    public void agregarMaterias(Materia materiaRecibida)
    {
        materias.agregar(materiaRecibida);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }



    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", legajo=" + legajo +

                ", materias=" + materias.listar() +
                '}';
    }
    public String mostrarMaterias()
    {
        return this.materias.listar();
    }

    public void agregarNotaAMateria(Notas nota, String llave)
    {
        Materia materia=materias.obtener(llave);
        if(materia==null)
        {
            throw new IllegalArgumentException("no hay mat");
        }
        materia.agregarNotas(nota);
    }
    public void toJSON(String nombreArchivo) {
        Gson gson = new Gson();
        String json = gson.toJson(this);

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write(json);
            System.out.println("El objeto Estudiante se ha guardado en el archivo JSON correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el objeto Estudiante en el archivo JSON.");
            e.printStackTrace();
        }
    }
    public static Estudiante fromJSON(String nombreArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            Gson gson = new Gson();
            Estudiante estudiante = gson.fromJson(reader, Estudiante.class);
            System.out.println("El objeto Estudiante se ha leído desde el archivo JSON correctamente.");
            return estudiante;
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON.");
            e.printStackTrace();
            return null;
        }
    }
}



