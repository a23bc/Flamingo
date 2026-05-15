package j2;

import android.content.Context;
import e5.AbstractC0865c;

/* JADX INFO: renamed from: j2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1099b extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f13677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC1104g f13678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f13679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E5.d f13680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1103f f13682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13683u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1099b(C1103f c1103f, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13682t = c1103f;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13681s = obj;
        this.f13683u |= Integer.MIN_VALUE;
        return this.f13682t.a(null, null, null, this);
    }
}
