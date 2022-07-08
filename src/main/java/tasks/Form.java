package tasks;


import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;
import userinterface.UtestForm;



public class Form implements Task {

    public static Form thePage() { return Tasks.instrumented(Form.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestForm.INPUT_FIRSTNAME),
                Enter.theValue("Miguel").into(UtestForm.INPUT_FIRSTNAME),
                Enter.theValue("Cruz").into(UtestForm.INPUT_LASTNAME),
                Enter.theValue("miguelfernandocruz@gmail.com").into(UtestForm.INPUT_EMAIL),
                Click.on(UtestForm.INPUT_MONTH),
                Enter.theValue("June").into(By.id("birthMonth")),
                Click.on(UtestForm.INPUT_DAY),
                Enter.theValue("19").into(By.id("birthDay")),
                Click.on(UtestForm.INPUT_YEAR),
                Enter.theValue("1993").into(By.id("birthYear")),
                Click.on(UtestForm.NEXT_BUTTON),
                Enter.theValue("Villavicencio").into(UtestForm.INPUT_CITY),
                Click.on(UtestForm.INPUT_CITYPSELECT),
                Enter.theValue("500004").into(UtestForm.INPUT_ZIP),
                Click.on(UtestForm.NEXT_BUTTON2),
                Click.on(UtestForm.NEXT_BUTTON2),
                Click.on(UtestForm.INPUT_PASSWORD),
                Enter.theValue("8uF7hUdVK6ngYbR").into(UtestForm.INPUT_PASSWORD),
                Enter.theValue("8uF7hUdVK6ngYbR").into(UtestForm.INPUT_CONF_PASSWORD),
                Click.on(UtestForm.INPUT_CHECK),
                Click.on(UtestForm.INPUT_CHECK2),
                Click.on(UtestForm.OK_BUTTON)

                );
    }

}
