package com.kyant.taglib;

/* JADX INFO: loaded from: classes.dex */
public final class AudioProperties {
    private final int bitrate;
    private final int channels;
    private final int length;
    private final int sampleRate;

    public AudioProperties(int i7, int i8, int i9, int i10) {
        this.length = i7;
        this.bitrate = i8;
        this.sampleRate = i9;
        this.channels = i10;
    }

    public static /* synthetic */ AudioProperties copy$default(AudioProperties audioProperties, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = audioProperties.length;
        }
        if ((i11 & 2) != 0) {
            i8 = audioProperties.bitrate;
        }
        if ((i11 & 4) != 0) {
            i9 = audioProperties.sampleRate;
        }
        if ((i11 & 8) != 0) {
            i10 = audioProperties.channels;
        }
        return audioProperties.copy(i7, i8, i9, i10);
    }

    public final int component1() {
        return this.length;
    }

    public final int component2() {
        return this.bitrate;
    }

    public final int component3() {
        return this.sampleRate;
    }

    public final int component4() {
        return this.channels;
    }

    public final AudioProperties copy(int i7, int i8, int i9, int i10) {
        return new AudioProperties(i7, i8, i9, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProperties)) {
            return false;
        }
        AudioProperties audioProperties = (AudioProperties) obj;
        return this.length == audioProperties.length && this.bitrate == audioProperties.bitrate && this.sampleRate == audioProperties.sampleRate && this.channels == audioProperties.channels;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public int hashCode() {
        return (((((this.length * 31) + this.bitrate) * 31) + this.sampleRate) * 31) + this.channels;
    }

    public String toString() {
        return "AudioProperties(length=" + this.length + ", bitrate=" + this.bitrate + ", sampleRate=" + this.sampleRate + ", channels=" + this.channels + ")";
    }
}
