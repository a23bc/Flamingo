package C2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a */
    public final Handler f1010a = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: b */
    public final P f1011b = new P(this);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ S f1012c;

    public Q(S s7) {
        this.f1012c = s7;
    }

    public void a(AudioTrack audioTrack) {
        Handler handler = this.f1010a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new O(handler, 0), this.f1011b);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f1011b);
        this.f1010a.removeCallbacksAndMessages(null);
    }
}
