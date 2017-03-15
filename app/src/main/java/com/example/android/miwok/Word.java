package com.example.android.miwok;

/**
 * Created by Pallavi J on 08-03-2017.
 */

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mdefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResrcID = NO_IMAGE_PROVIDED;
    private int mAudioClipID ;

    public Word(String mdefaultTranslation, String mMiwokTranslation, int audioClipId ){
        this.mdefaultTranslation = mdefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioClipID = audioClipId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mdefaultTranslation='" + mdefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResrcID=" + mImageResrcID +
                ", mAudioClipID=" + mAudioClipID +
                '}';
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioClipId  ){
        this.mdefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResrcID = imageResourceId;
        this.mAudioClipID = audioClipId;
    }


    public  String getDefaultTranslation(){
        return mdefaultTranslation;
    }

    public  String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResrcID(){
        return mImageResrcID;
    }

    public int getmAudioClipID(){
        return mAudioClipID;
    }

    public boolean hasImage(){
        return mImageResrcID != NO_IMAGE_PROVIDED;
    }
}
