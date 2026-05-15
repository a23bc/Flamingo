package C2;

import E4.AbstractC0119q;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* JADX INFO: renamed from: C2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0030b {
    private static E4.M a() {
        E4.L l = new E4.L(4);
        Integer[] numArr = {8, 7};
        AbstractC0119q.c(2, numArr);
        l.e(l.f1859b + 2);
        System.arraycopy(numArr, 0, l.f1858a, l.f1859b, 2);
        l.f1859b += 2;
        int i7 = w2.t.f18881a;
        if (i7 >= 31) {
            Integer[] numArr2 = {26, 27};
            AbstractC0119q.c(2, numArr2);
            l.e(l.f1859b + 2);
            System.arraycopy(numArr2, 0, l.f1858a, l.f1859b, 2);
            l.f1859b += 2;
        }
        if (i7 >= 33) {
            l.a(30);
        }
        return l.f();
    }

    public static boolean b(AudioManager audioManager, C0041m c0041m) {
        AudioDeviceInfo[] devices;
        if (c0041m == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{c0041m.f1137a};
        }
        E4.M mA = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (mA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
