/**
 * Created by Maxym on 11/28/2016.
 */
public interface Card<T>
{
    void register(T item);
    boolean banCard();
    boolean use();
}
