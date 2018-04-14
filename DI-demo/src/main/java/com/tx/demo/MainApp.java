package com.tx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by peter.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");

        //通过构造注入的SpellChecker进行拼写检查
        te.spellCheck();

        //通过设值注入的SpellChecker进行拼写检查
        te.spellCheck2();

        JavaCollection collection = (JavaCollection) context.getBean("javaCollection");
        collection.getAddressList();
        collection.getAddressMap();
        collection.getAddressProp();
        collection.getAddressSet();
    }
}
