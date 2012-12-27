package ru.maslov.ch5;

import org.springframework.context.support.GenericXmlApplicationContext;
import ru.maslov.ch5.logic.A1;

public class App1 {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/app-context.xml");
        ctx.refresh();
        System.out.println("----------");
        A1 a = (A1) ctx.getBean("a1");
        System.out.println(a.getB1().getMessage());

    }
}
