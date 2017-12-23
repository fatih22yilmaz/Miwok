package com.example.android.miwok;

/**
 * Created by Fatih YILMAZ on 22.12.2017.
 * <p>
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    /**
     * Default translation for the word.
     */
    private String defaultTranslation;
    /**
     * Miwok translation for the word.
     */
    private String miwokTranslation;

    /**
     * Create a new word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation   is the word in Miwok language.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    /**
     * Returns the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return this.miwokTranslation;
    }

    /**
     * Returns the default translation of the word.
     */
    public String getDefaultTranslation() {
        return this.defaultTranslation;
    }
}
