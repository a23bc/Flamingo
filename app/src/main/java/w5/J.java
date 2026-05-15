package w5;

import d5.EnumC0830a;
import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f19492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19493p;

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f19492o = obj;
        this.f19493p |= Integer.MIN_VALUE;
        AbstractC1767D.e(this);
        return EnumC0830a.f11264o;
    }
}
