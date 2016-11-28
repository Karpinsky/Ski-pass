/**
 * Created by Maxym on 11/28/2016.
 */
public abstract class Pass
{
    public enum PassQuantity {
        TEN_RIDES(10),
        TWENTY_RIDES(20),
        FIFTY_RIDES(50),
        ONE_HUNDRED_RIDES(100);

        private final Integer value;

        PassQuantity(final Integer newValue)
        {
            value = newValue;
        }

        public Integer getValue() { return value; }
    }

    public enum PassSubscription {
        DAILY, QUANTITY, SEASON
    }

    protected enum PassType {
        DAY, NIGHT
    }

    public Pass()
    {
        initializePass();
    }

    protected PassSubscription passSubscription;
    protected PassQuantity passQuantity;
    protected PassType passType;

    protected Integer accessQuantity;

    public Integer getAccessQuantity()
    {
        return this.accessQuantity;
    }

    protected abstract void initializePass();
    public abstract boolean checkPass();
    public abstract void checkout();
}
