package I;

import e5.AbstractC0865c;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public K f3275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EnumC1862l0 f3276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l5.e f3277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f3279s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3280t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(K k7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f3279s = k7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f3278r = obj;
        this.f3280t |= Integer.MIN_VALUE;
        return K.s(this.f3279s, null, null, this);
    }
}
