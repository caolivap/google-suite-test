package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Open implements Task {

    private Target option;

    public Open (Target option){
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static Performable theOption(Target option) {
        return instrumented(Open.class, option);
    }
}
