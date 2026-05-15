package U5;

import D.AbstractC0060d;
import androidx.compose.foundation.layout.FillElement;
import f0.C0912t;
import m5.AbstractC1209k;
import v.InterfaceC1626w;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class K implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T4.l f7127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f7128p;

    public K(T4.l lVar, long j3) {
        this.f7127o = lVar;
        this.f7128p = j3;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        AbstractC1209k.f((InterfaceC1626w) obj, "$this$AnimatedVisibility");
        FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
        float f7 = 24;
        long j3 = this.f7128p;
        AbstractC0060d.d(c0912t, dev.chrisbanes.haze.a.a(fillElement, this.f7127o, T4.m.a(new T4.m(j3, C1987t.b(j3, ((double) AbstractC1959I.o(j3)) >= 0.5d ? 0.83f : 0.9f), f7, 8), 0L, 0L, 48, 11)));
        return Y4.o.f8736a;
    }
}
