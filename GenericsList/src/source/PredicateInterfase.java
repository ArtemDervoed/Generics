package source;

public interface PredicateInterfase<T> {
    public <S extends T> boolean status(S value);
}