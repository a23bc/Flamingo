package C2;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.List;
import t2.C1476e;

/* JADX INFO: renamed from: C2.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0033e {
    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static C2.C0035g a(android.media.AudioManager r6, t2.C1476e r7) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.AbstractC0033e.a(android.media.AudioManager, t2.e):C2.g");
    }

    public static C0041m b(AudioManager audioManager, C1476e c1476e) {
        try {
            audioManager.getClass();
            List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c1476e.b().f16352a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C0041m((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
