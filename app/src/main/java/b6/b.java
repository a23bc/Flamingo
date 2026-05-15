package b6;

import e5.AbstractC0865c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f10407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f10411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f10412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10413u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10412t = iVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10411s = obj;
        this.f10413u |= Integer.MIN_VALUE;
        return this.f10412t.a(null, null, 0L, false, 0, false, this);
    }
}
