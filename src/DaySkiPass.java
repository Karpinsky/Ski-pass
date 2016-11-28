/**
 * Created by Maxym on 11/28/2016.
 */
public class DaySkiPass extends Pass
{
    @Override
    protected void initializePass() {
        passType = PassType.DAY;
        this.accessQuantity = Pass.PassQuantity.FIFTY_RIDES.getValue();
    }

    @Override
    public boolean checkPass() {
        return false;
    }

    @Override
    public void checkout() {

    }
}
