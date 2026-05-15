package C2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes.dex */
public final class P extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f1009a;

    public P(Q q7) {
        this.f1009a = q7;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        S s7;
        A.b bVar;
        if (audioTrack.equals(this.f1009a.f1012c.f1071w) && (bVar = (s7 = this.f1009a.f1012c).f1067s) != null && s7.f1040Y) {
            bVar.y();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f1009a.f1012c.f1071w)) {
            this.f1009a.f1012c.f1039X = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        S s7;
        A.b bVar;
        if (audioTrack.equals(this.f1009a.f1012c.f1071w) && (bVar = (s7 = this.f1009a.f1012c).f1067s) != null && s7.f1040Y) {
            bVar.y();
        }
    }
}
