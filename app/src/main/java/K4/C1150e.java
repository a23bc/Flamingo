package k4;

import e4.C0853b;
import e4.C0854c;
import e5.AbstractC0865c;
import p4.l;

/* JADX INFO: renamed from: k4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1150e extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1153h f14091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0853b f14092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p4.h f14093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f14094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f14095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0854c f14096t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14097u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f14098v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1153h f14099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14100x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1150e(C1153h c1153h, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f14099w = c1153h;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f14098v = obj;
        this.f14100x |= Integer.MIN_VALUE;
        return this.f14099w.c(null, null, null, null, null, this);
    }
}
