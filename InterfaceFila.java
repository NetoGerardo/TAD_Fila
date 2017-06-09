package pacote;

/**
 *
 * @author Gerardo
 */
public interface InterfaceFila {
    public int tamanho();
    public boolean estaVazia();
    public Object inicio() throws EFilaVazia;
    public void enfileirar(Object o)throws EFilaCheia;
    public Object desinfileirar() throws EFilaVazia;
}
