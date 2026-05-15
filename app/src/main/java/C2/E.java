package C2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    public static C0043o a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z6) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C0043o.f1141d;
        }
        C0042n c0042n = new C0042n();
        boolean z7 = w2.t.f18881a > 32 && playbackOffloadSupport == 2;
        c0042n.f1138a = true;
        c0042n.f1139b = z7;
        c0042n.f1140c = z6;
        return c0042n.a();
    }
}
