public interface Colecciones<T>
{
    public void agregar(T elemento);

    //void agregar(Object elemento);

    public int contar();
    public void eliminar (T elemento);
    public void vaciar();
    public String listar();

}
