import java.time.LocalDate;
import java.util.Objects;

public class Notas
{
    int numero;
    String instancia;
    int fecha;

    public Notas(int numero, String instancia, int fecha) {
        this.numero = numero;
        this.instancia = instancia;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getInstancia() {
        return instancia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notas notas = (Notas) o;
        return numero == notas.numero && Objects.equals(instancia, notas.instancia) && Objects.equals(fecha, notas.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, instancia, fecha);
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }



    @Override
    public String toString() {
        return "Notas{" +
                "numero=" + numero +
                ", instancia='" + instancia + '\'' +
                ", fecha=" + fecha +
                '}';
    }



}
