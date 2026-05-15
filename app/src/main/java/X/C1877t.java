package x;

import android.content.Context;
import m5.AbstractC1209k;
import y0.C1987t;

/* JADX INFO: renamed from: x.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1877t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1.d f19840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D.k0 f19842d;

    public C1877t(Context context, n1.d dVar, long j3, D.k0 k0Var) {
        this.f19839a = context;
        this.f19840b = dVar;
        this.f19841c = j3;
        this.f19842d = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1877t.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1209k.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        C1877t c1877t = (C1877t) obj;
        return AbstractC1209k.a(this.f19839a, c1877t.f19839a) && AbstractC1209k.a(this.f19840b, c1877t.f19840b) && C1987t.c(this.f19841c, c1877t.f19841c) && AbstractC1209k.a(this.f19842d, c1877t.f19842d);
    }

    public final int hashCode() {
        return this.f19842d.hashCode() + n1.c.o((this.f19840b.hashCode() + (this.f19839a.hashCode() * 31)) * 31, 31, this.f19841c);
    }
}
