package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f9767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9768b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f9767a.equals(((AudioAttributesImplApi21) obj).f9767a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9767a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f9767a;
    }
}
