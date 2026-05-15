package C2;

import android.media.AudioTrack;

/* JADX INFO: renamed from: C2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0052y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0051x f1163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1168f;

    public C0052y(AudioTrack audioTrack) {
        this.f1163a = new C0051x(audioTrack);
        a();
    }

    public final void a() {
        if (this.f1163a != null) {
            b(0);
        }
    }

    public final void b(int i7) {
        this.f1164b = i7;
        if (i7 == 0) {
            this.f1167e = 0L;
            this.f1168f = -1L;
            this.f1165c = System.nanoTime() / 1000;
            this.f1166d = 10000L;
            return;
        }
        if (i7 == 1) {
            this.f1166d = 10000L;
            return;
        }
        if (i7 == 2 || i7 == 3) {
            this.f1166d = 10000000L;
        } else {
            if (i7 != 4) {
                throw new IllegalStateException();
            }
            this.f1166d = 500000L;
        }
    }
}
