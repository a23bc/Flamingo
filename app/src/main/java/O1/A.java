package O1;

import e5.AbstractC0865c;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F f5478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FileInputStream f5479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f5480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f5481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5482s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(F f7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f5481r = f7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f5480q = obj;
        this.f5482s |= Integer.MIN_VALUE;
        return this.f5481r.h(this);
    }
}
