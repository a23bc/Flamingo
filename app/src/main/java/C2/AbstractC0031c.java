package C2;

import E4.p0;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import t2.C1476e;

/* JADX INFO: renamed from: C2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0031c {
    public static E4.I a(C1476e c1476e) {
        E4.F fO = E4.I.o();
        E4.K k7 = C0035g.f1119e;
        E4.M mD = k7.f1875p;
        if (mD == null) {
            mD = k7.d();
            k7.f1875p = mD;
        }
        p0 it = mD.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (w2.t.f18881a >= w2.t.l(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), (AudioAttributes) c1476e.b().f16352a)) {
                fO.a(num);
            }
        }
        fO.a(2);
        return fO.f();
    }

    public static int b(int i7, int i8, C1476e c1476e) {
        for (int i9 = 10; i9 > 0; i9--) {
            int iN = w2.t.n(i9);
            if (iN != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i8).setChannelMask(iN).build(), (AudioAttributes) c1476e.b().f16352a)) {
                return i9;
            }
        }
        return 0;
    }
}
