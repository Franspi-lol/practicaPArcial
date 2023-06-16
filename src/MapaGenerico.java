import java.util.HashMap;

public class MapaGenerico<T extends Materia> implements Colecciones<T>
{
    private HashMap<String, T> mapas;

    public MapaGenerico()
    {
        mapas=new HashMap<>();
    }

    public void agregar (T elemento)
    {
        if (elemento instanceof Materia)
        {
            if (mapas.containsKey(elemento.getCodigo()))
            {
                throw new IllegalArgumentException("La materia ya habia sido agregada");
            }
            mapas.put(elemento.getCodigo(),elemento);
        }
    }

    public int contar()
    {
        return mapas.size();
    }

    public String listar()
    {
        String a=new String();
        if (mapas.isEmpty()) {
            a = "vacio";
        }
        else {
            for (T elemento : mapas.values()) {
                a = mapas.toString();
            }
        }
        return a;
    }
    public void eliminar (T elemento)
    {
        if (!mapas.containsKey(elemento.getCodigo()))
        {
            throw new IllegalArgumentException("No existe tal materia");
        }
        mapas.remove(elemento.getCodigo());
    }
    public void vaciar(){
        this.mapas.clear();
    }

    public T obtener(String codigo)
    {
        return mapas.get(codigo);
    }

}
