package C2;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f1002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0040l f1003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L f1004c = new AudioRouting.OnRoutingChangedListener() { // from class: C2.L
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            this.f1001a.b(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [C2.L] */
    public M(AudioTrack audioTrack, C0040l c0040l) {
        this.f1002a = audioTrack;
        this.f1003b = c0040l;
        audioTrack.addOnRoutingChangedListener(this.f1004c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AudioRouting audioRouting) {
        if (this.f1004c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.f1003b.b(audioRouting.getRoutedDevice());
    }

    public void c() {
        L l = this.f1004c;
        l.getClass();
        this.f1002a.removeOnRoutingChangedListener(l);
        this.f1004c = null;
    }
}
