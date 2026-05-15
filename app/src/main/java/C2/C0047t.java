package C2;

import t2.C1487p;

/* JADX INFO: renamed from: C2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0047t extends Exception {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1487p f1152q;

    public C0047t(int i7, int i8, int i9, int i10, C1487p c1487p, boolean z6, RuntimeException runtimeException) {
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i7);
        sb.append(" Config(");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(i10);
        sb.append(") ");
        sb.append(c1487p);
        sb.append(z6 ? " (recoverable)" : "");
        super(sb.toString(), runtimeException);
        this.f1150o = i7;
        this.f1151p = z6;
        this.f1152q = c1487p;
    }
}
