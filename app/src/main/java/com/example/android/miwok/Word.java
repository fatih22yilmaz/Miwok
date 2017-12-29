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
     * Audio resource id of the image.
     */
    private int audioResourceId;

    /**
     * Create a new word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation   is the word in Miwok language.
     * @param imageResourceId    is the id of the image.
     */
    Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;
    }

    /**
     * Create a new word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation   is the word in Miwok language.
     */
    Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceId = audioResourceId;
    }

    /**
     * @return Returns the Miwok translation of the word.
     */
    String getMiwokTranslation() {
        return this.miwokTranslation;
    }

    /**
     * @return Returns the default translation of the word.
     */
    String getDefaultTranslation() {
        return this.defaultTranslation;
    }

    /**
     * @return Returns the image resource id of the image.
     */
    int getImageResourceId() {
        return this.imageResourceId;
    }

    int getAudioResourceId() {
        return this.audioResourceId;
    }

    boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "defaultTranslation='" + defaultTranslation + '\'' +
                ", miwokTranslation='" + miwokTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", audioResourceId=" + audioResourceId +
                '}';
    }
}
