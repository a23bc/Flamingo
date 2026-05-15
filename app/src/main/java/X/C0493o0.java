package X;

import e5.AbstractC0871i;
import m5.C1219u;
import m5.C1220v;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: X.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0493o0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0495p0 f8122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1220v f8123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1220v f8124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1219u f8125s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0493o0(C0495p0 c0495p0, C1220v c1220v, C1220v c1220v2, C1219u c1219u, c5.d dVar) {
        super(2, dVar);
        this.f8122p = c0495p0;
        this.f8123q = c1220v;
        this.f8124r = c1220v2;
        this.f8125s = c1219u;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0493o0(this.f8122p, this.f8123q, this.f8124r, this.f8125s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0493o0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0493o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
