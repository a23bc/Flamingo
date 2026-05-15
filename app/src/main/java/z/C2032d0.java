package z;

import e5.AbstractC0865c;
import m5.C1217s;

/* JADX INFO: renamed from: z.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2032d0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P0 f20793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1217s f20794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f20795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f20796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A3.b f20797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20798t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2032d0(A3.b bVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f20797s = bVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20796r = obj;
        this.f20798t |= Integer.MIN_VALUE;
        return A3.b.a(this.f20797s, null, null, 0.0f, 0.0f, this);
    }
}
