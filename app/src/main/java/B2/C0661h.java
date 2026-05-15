package b2;

import android.content.Context;
import e5.AbstractC0865c;

/* JADX INFO: renamed from: b2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661h extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f10186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Context f10187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Z1.k f10188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f10189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0671m f10190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10191t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0661h(C0671m c0671m, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10190s = c0671m;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10189r = obj;
        this.f10191t |= Integer.MIN_VALUE;
        return this.f10190s.b(null, null, this);
    }
}
