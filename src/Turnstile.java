/**
 * Created by Maxym on 11/28/2016.
 */
public class Turnstile
{
    public static void main(String... args)
    {
        Card<Pass> newPassCard = SkiPassFactory.getPassCard();
        Turnstile turnstile = new Turnstile();
        System.out.println(turnstile.enterCard(newPassCard));
    }

    public boolean enterCard(Card card)
    {
        return card.use();
    }
}
