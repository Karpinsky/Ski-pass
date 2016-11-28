/**
 * Created by Maxym on 11/28/2016.
 */
public class NightSkiPass extends Pass
{

    @Override
    protected void initializePass() {
        passType = PassType.NIGHT;
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
