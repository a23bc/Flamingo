package J;

import K0.C0236d;
import Q0.j0;
import Y4.o;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f3576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0 f3577q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0236d f3578r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, j0 j0Var, C0236d c0236d, c5.d dVar) {
        super(2, dVar);
        this.f3576p = hVar;
        this.f3577q = j0Var;
        this.f3578r = c0236d;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new e(this.f3576p, this.f3577q, this.f3578r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
