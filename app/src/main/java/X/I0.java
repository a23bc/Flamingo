package X;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0 f7925p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(K0 k02, c5.d dVar) {
        super(2, dVar);
        this.f7925p = k02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new I0(this.f7925p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((I0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c2, code lost:
    
        if (r0 == r4) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
