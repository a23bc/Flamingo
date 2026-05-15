package i2;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: i2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1077l extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f13391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l5.e f13392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public E5.d f13393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f13395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13396t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077l(p pVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13395s = pVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13394r = obj;
        this.f13396t |= Integer.MIN_VALUE;
        return this.f13395s.a(null, this);
    }
}
