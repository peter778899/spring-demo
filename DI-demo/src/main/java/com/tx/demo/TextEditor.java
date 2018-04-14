package com.tx.demo;

/**
 * Created by peter.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    private SpellChecker2 spellChecker2;

    //构造注入
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.（构造注入）" );
        this.spellChecker = spellChecker;
    }

    //设值注入
    public void setSpellChecker2(SpellChecker2 spellChecker2) {
        System.out.println("Inside setSpellChecker（设值注入）" );
        this.spellChecker2 = spellChecker2;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public void spellCheck2() {
        spellChecker2.checkSpelling();
    }

}
