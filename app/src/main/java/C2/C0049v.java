package C2;

import t2.C1487p;

/* JADX INFO: renamed from: C2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0049v extends Exception {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1487p f1155q;

    public C0049v(int i7, C1487p c1487p, boolean z6) {
        super(n1.c.s(i7, "AudioTrack write failed: "));
        this.f1154p = z6;
        this.f1153o = i7;
        this.f1155q = c1487p;
    }
}
