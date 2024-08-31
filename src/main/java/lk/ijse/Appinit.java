package lk.ijse;

import lk.ijse.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Appinit {
    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();


        ctx.registerShutdownHook();
    }
}