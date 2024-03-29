package com.falabella.task;

import com.falabella.interactions.ClickRandomProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CatalogTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                ClickRandomProduct.click()

        );


    }

    public static Performable catalogTasK() {
        return instrumented(CatalogTask.class);

    }
}
