package C2;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static void a(AudioTrack audioTrack, C0041m c0041m) {
        audioTrack.setPreferredDevice(c0041m == null ? null : c0041m.f1137a);
    }
}
