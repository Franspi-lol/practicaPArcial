import java.util.ArrayList;
import java.util.Collection;

public class ListaGenerica<T> implements Colecciones<T>
{
    private Collection<T> coleccion;

    public ListaGenerica()
    {
        this.coleccion=new ArrayList<>();
    }
@Override
    public void agregar(T elemento)
    {
        this.coleccion.add(elemento);
    }

    public int contar()
    {
        int a=this.coleccion.size();
        return a;
    }
    public void eliminar (T elemnto)
    {

    }
    public void vaciar()
    {
        this.coleccion.clear();
    }

    public String listar()
    {
        String b = new String();
        if(coleccion.isEmpty())
        {
            b="Vacio";
        }else
        {
            for (T a:coleccion)
            {
                b=coleccion.toString();
            }
        }
        return b;
    }
}
