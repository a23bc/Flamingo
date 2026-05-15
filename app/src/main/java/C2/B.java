package C2;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static void a(InterfaceC0050w interfaceC0050w, Object obj) {
        C0041m c0041m;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        S s7 = (S) interfaceC0050w;
        if (audioDeviceInfo == null) {
            c0041m = null;
        } else {
            s7.getClass();
            c0041m = new C0041m(audioDeviceInfo);
        }
        s7.f1044c0 = c0041m;
        C0040l c0040l = s7.f1073y;
        if (c0040l != null) {
            c0040l.b(audioDeviceInfo);
        }
        AudioTrack audioTrack = s7.f1071w;
        if (audioTrack != null) {
            G.a(audioTrack, s7.f1044c0);
        }
    }
}
