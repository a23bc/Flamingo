package v6;

import e5.AbstractC0871i;
import f0.C0886f0;
import f0.C0888g0;
import f0.InterfaceC0878b0;
import w.a0;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: v6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1651e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a0 f18353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f18354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18356r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f18357s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f18358t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18359u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f18360v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f18361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1651e(h hVar, InterfaceC0878b0 interfaceC0878b0, int i7, C0886f0 c0886f0, C0888g0 c0888g0, c5.d dVar) {
        super(2, dVar);
        this.f18357s = hVar;
        this.f18358t = interfaceC0878b0;
        this.f18359u = i7;
        this.f18360v = c0886f0;
        this.f18361w = c0888g0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1651e c1651e = new C1651e(this.f18357s, this.f18358t, this.f18359u, this.f18360v, this.f18361w, dVar);
        c1651e.f18356r = obj;
        return c1651e;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1651e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        if (r5 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0101, code lost:
    
        if (w5.AbstractC1767D.s(r6) == false) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e6 -> B:34:0x00e9). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.C1651e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
