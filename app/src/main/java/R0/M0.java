package R0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements Q0.t0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f6326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Float f6327q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Float f6328r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Y0.h f6329s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Y0.h f6330t = null;

    public M0(int i7, ArrayList arrayList) {
        this.f6325o = i7;
        this.f6326p = arrayList;
    }

    @Override // Q0.t0
    public final boolean w() {
        return this.f6326p.contains(this);
    }
}
