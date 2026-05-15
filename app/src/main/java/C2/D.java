package C2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static C0043o a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z6) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return C0043o.f1141d;
        }
        C0042n c0042n = new C0042n();
        c0042n.f1138a = true;
        c0042n.f1140c = z6;
        return c0042n.a();
    }
}
