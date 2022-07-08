package userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinToday extends PageObject{
    public static final Target JOINTODAY_BUTTON = Target.the("button that show us the form to register").located(By.linkText("Join Today"));

}

