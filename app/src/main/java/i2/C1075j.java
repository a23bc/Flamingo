package i2;

import android.content.Context;
import b2.C0671m;
import e5.AbstractC0865c;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: i2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1075j extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0671m f13384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Context f13385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC1182c f13386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y5.b f13387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0671m f13389t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13390u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1075j(C0671m c0671m, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13389t = c0671m;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13388s = obj;
        this.f13390u |= Integer.MIN_VALUE;
        return this.f13389t.d(null, null, this);
    }
}
