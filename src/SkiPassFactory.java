import java.sql.Time;
import java.util.Timer;

/**
 * Created by Maxym on 11/28/2016.
 */
public class SkiPassFactory
{
    private static double currentTime = 16.5;

    public enum SkiPassType {
        NIGHT {
            @Override
            public Pass createPass() {
                return new NightSkiPass();
            }
        },

        DAY {
            @Override
            public Pass createPass() {
                return new DaySkiPass();
            }
        };

        public static SkiPassType suggestSkiPass(){
            if (dayTime())
            {
                return DAY;
            }
            else
            {
                return NIGHT;
            }
        }

        public abstract Pass createPass();
    }

    public static boolean dayTime()
    {
        return 9 < SkiPassFactory.currentTime && SkiPassFactory.currentTime < 22;
    }

    public static PassCard<Pass> getPassCard()
    {
        PassCard<Pass> newPassCard = new PassCard<>();
        newPassCard.register(SkiPassType.suggestSkiPass().createPass());

        return newPassCard;
    }

    public static PassCard<Pass> getPassCard(SkiPassType skiPassType)
    {
        PassCard<Pass> newPassCard = new PassCard<>();
        newPassCard.register(skiPassType.createPass());

        return newPassCard;
    }
}
