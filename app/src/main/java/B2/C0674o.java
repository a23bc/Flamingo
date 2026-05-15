package b2;

import d5.EnumC0830a;
import e5.AbstractC0865c;

/* JADX INFO: renamed from: b2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0674o extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0675p f10244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10245q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0674o(C0675p c0675p, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10244p = c0675p;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10243o = obj;
        this.f10245q |= Integer.MIN_VALUE;
        this.f10244p.a(null, this);
        return EnumC0830a.f11264o;
    }
}
