package A2;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: A2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0004e implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0005f f254b;

    public C0004e(C0005f c0005f, Handler handler) {
        this.f254b = c0005f;
        this.f253a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        this.f253a.post(new RunnableC0003d(i7, 0, this));
    }
}
