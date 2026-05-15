package x3;

import android.media.AudioAttributes;
import java.util.Objects;

/* JADX INFO: renamed from: x3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1916a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioAttributes f20028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20029b = -1;

    public C1916a(AudioAttributes audioAttributes) {
        this.f20028a = audioAttributes;
    }

    public final int a() {
        AudioAttributes audioAttributes = this.f20028a;
        audioAttributes.getClass();
        return audioAttributes.getFlags();
    }

    public final int b() {
        AudioAttributes audioAttributes = this.f20028a;
        audioAttributes.getClass();
        return audioAttributes.getUsage();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1916a) {
            return Objects.equals(this.f20028a, ((C1916a) obj).f20028a);
        }
        return false;
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f20028a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f20028a;
    }
}
