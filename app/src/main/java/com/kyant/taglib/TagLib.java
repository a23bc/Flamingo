package com.kyant.taglib;

import Z4.l;
import java.util.HashMap;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class TagLib {
    public static final TagLib INSTANCE = new TagLib();

    static {
        System.loadLibrary("taglib");
    }

    private TagLib() {
    }

    private final native AudioProperties getAudioProperties(int i7, int i8);

    public static /* synthetic */ AudioProperties getAudioProperties$default(TagLib tagLib, int i7, AudioPropertiesReadStyle audioPropertiesReadStyle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            audioPropertiesReadStyle = AudioPropertiesReadStyle.Average;
        }
        return tagLib.getAudioProperties(i7, audioPropertiesReadStyle);
    }

    public static /* synthetic */ Metadata getMetadata$default(TagLib tagLib, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = true;
        }
        return tagLib.getMetadata(i7, z6);
    }

    public final AudioProperties getAudioProperties(int i7, AudioPropertiesReadStyle audioPropertiesReadStyle) {
        AbstractC1209k.f(audioPropertiesReadStyle, "readStyle");
        return getAudioProperties(i7, audioPropertiesReadStyle.ordinal());
    }

    public final Picture getFrontCover(int i7) {
        Picture picture;
        Picture[] pictures = getPictures(i7);
        int length = pictures.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                picture = null;
                break;
            }
            picture = pictures[i8];
            if (AbstractC1209k.a(picture.getPictureType(), "Front Cover")) {
                break;
            }
            i8++;
        }
        return picture == null ? (Picture) l.i0(pictures) : picture;
    }

    public final native Metadata getMetadata(int i7, boolean z6);

    public final native Picture[] getPictures(int i7);

    public final native boolean savePictures(int i7, Picture[] pictureArr);

    public final native boolean savePropertyMap(int i7, HashMap<String, String[]> map);
}
