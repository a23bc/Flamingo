package R0;

import d5.EnumC0830a;
import e5.AbstractC0865c;

/* JADX INFO: renamed from: R0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0413w extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f6546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0415x f6547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6548q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0413w(C0415x c0415x, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f6547p = c0415x;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f6546o = obj;
        this.f6548q |= Integer.MIN_VALUE;
        this.f6547p.N(null, this);
        return EnumC0830a.f11264o;
    }
}
