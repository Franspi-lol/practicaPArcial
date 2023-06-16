import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Materia
{
    private String codigo;///3 letras.
    private String nombreMateria;
    private String docente;
    private String ayudante;
    private int diasCursada;
    private ListaGenerica<Notas> notas;

    public Materia(String codigo, String nombreMateria, String docente, String ayudante, int diasCursada) {
        if (codigo.length()!=3)
        {
            throw new IllegalArgumentException("El codigo de mat debe ser de 3 letras");
        }
        this.codigo = codigo;
        this.nombreMateria = nombreMateria;
        this.docente = docente;
        this.ayudante = ayudante;
        this.diasCursada = diasCursada;
        this.notas = new ListaGenerica<>();
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getAyudante() {
        return ayudante;
    }

    public void setAyudante(String ayudante) {
        this.ayudante = ayudante;
    }

    public int getDiasCursada() {
        return diasCursada;
    }

    public void setDiasCursada(int diasCursada) {
        this.diasCursada = diasCursada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return diasCursada == materia.diasCursada && Objects.equals(codigo, materia.codigo) && Objects.equals(nombreMateria, materia.nombreMateria) && Objects.equals(docente, materia.docente) && Objects.equals(ayudante, materia.ayudante) && Objects.equals(notas, materia.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombreMateria, docente, ayudante, diasCursada, notas);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "codigo='" + codigo + '\'' +
                ", nombreMateria='" + nombreMateria + '\'' +
                ", docente='" + docente + '\'' +
                ", ayudante='" + ayudante + '\'' +
                ", diasCursada=" + diasCursada +
                ", notas=" + notas.listar() +
                '}';
    }


    public String mostrarNotas(){
        return this.notas.listar();
    }
    public void agregarNotas(Notas nota)
    {
        /*for (Notas aux : notas)
        {
            if (aux.equals(nota))
            {
                throw new IllegalArgumentException("La nota yata");
            }
        }*/
        notas.agregar(nota);
    }



}
