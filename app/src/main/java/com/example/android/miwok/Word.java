package com.example.android.miwok;

/**
 * Created by Fatih YILMAZ on 22.12.2017.
 * <p>
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    private final static int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word.
     */
    private String defaultTranslation;
    /**
     * Miwok translation for the word.
     */
    private String miwokTranslation;
    /**
     * Image resource id of the image.
     */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation   is the word in Miwok language.
     * @param imageResourceId    is the id of the image.
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
    }

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
     * @return Returns the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return this.miwokTranslation;
    }

    /**
     * @return Returns the default translation of the word.
     */
    public String getDefaultTranslation() {
        return this.defaultTranslation;
    }

    /**
     * @return Returns the image resource id of the image.
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
