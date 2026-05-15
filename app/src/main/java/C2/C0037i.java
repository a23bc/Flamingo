package C2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: renamed from: C2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0037i extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0040l f1122a;

    public C0037i(C0040l c0040l) {
        this.f1122a = c0040l;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0040l c0040l = this.f1122a;
        c0040l.a(C0035g.c(c0040l.f1128a, c0040l.f1135i, c0040l.h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0040l c0040l = this.f1122a;
        C0041m c0041m = c0040l.h;
        int i7 = w2.t.f18881a;
        int length = audioDeviceInfoArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            if (w2.t.a(audioDeviceInfoArr[i8], c0041m)) {
                c0040l.h = null;
                break;
            }
            i8++;
        }
        c0040l.a(C0035g.c(c0040l.f1128a, c0040l.f1135i, c0040l.h));
    }
}
