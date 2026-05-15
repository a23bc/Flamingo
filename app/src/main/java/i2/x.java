package i2;

import android.content.Context;
import b2.C0671m;
import w5.AbstractC1767D;
import w5.C1806y;
import w5.InterfaceC1807z;

/* JADX INFO: loaded from: classes.dex */
public final class x extends c5.a implements InterfaceC1807z {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K f13429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0671m f13430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f13431r;

    /* JADX WARN: Illegal instructions before constructor call */
    public x(K k7, C0671m c0671m, Context context) {
        C1806y c1806y = C1806y.f19580o;
        this.f13429p = k7;
        this.f13430q = c0671m;
        this.f13431r = context;
        super(c1806y);
    }

    @Override // w5.InterfaceC1807z
    public final void z(c5.i iVar, Throwable th) {
        C0671m c0671m = this.f13430q;
        Context context = this.f13431r;
        K k7 = this.f13429p;
        AbstractC1767D.t(k7, null, new E(c0671m, context, th, k7, null), 3);
    }
}
