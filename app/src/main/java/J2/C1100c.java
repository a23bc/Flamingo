package j2;

import e5.AbstractC0865c;
import java.io.Serializable;

/* JADX INFO: renamed from: j2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1100c extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f13684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f13685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Serializable f13686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E5.d f13687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1103f f13689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13690u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100c(C1103f c1103f, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13689t = c1103f;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13688s = obj;
        this.f13690u |= Integer.MIN_VALUE;
        return this.f13689t.b(null, null, null, this);
    }
}
