package v0;

import Y4.o;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import y0.AbstractC1959I;
import y0.C1960J;
import y0.C1982o;

/* JADX INFO: renamed from: v0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1630a extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f18201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f18202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f18204s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1630a(float f7, float f8, int i7, boolean z6) {
        super(1);
        this.f18201p = f7;
        this.f18202q = f8;
        this.f18203r = i7;
        this.f18204s = z6;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C1960J c1960j = (C1960J) obj;
        float fB = c1960j.f20188E.b() * this.f18201p;
        float fB2 = c1960j.f20188E.b() * this.f18202q;
        c1960j.g((fB <= 0.0f || fB2 <= 0.0f) ? null : new C1982o(fB, fB2, this.f18203r));
        c1960j.m(AbstractC1959I.f20180a);
        c1960j.d(this.f18204s);
        return o.f8736a;
    }
}
