import java.util.LinkedList;

/**
 * Created by Maxym on 11/28/2016.
 */
public class PassCard<T extends Pass> implements Card<T>
{
    private LinkedList<T> _registeredItems;
    private boolean banned;
    private boolean VIP;

    public PassCard()
    {
        this._registeredItems = new LinkedList<>();
        this.banned = false;
    }

    @Override
    public void register(T item) {
        this._registeredItems.add(item);
    }

    @Override
    public boolean banCard() {
        if (!VIP)
        {
            banned = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean use() {
        if (banned)
        {
            System.out.println("Your card was blocked, try contacting administrator");
            return false;
        }

        for (Pass pass : _registeredItems)
        {
            if (pass.checkPass())
            {
                pass.checkout();
                return true;
            }
        }


        return false;
    }
}
