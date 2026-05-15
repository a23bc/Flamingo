package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1856i0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1858j0 f19750p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856i0(C1858j0 c1858j0, c5.d dVar) {
        super(2, dVar);
        this.f19750p = c1858j0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1856i0(this.f19750p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((C1856i0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (f0.C0879c.q(getContext()).s(new f0.Y(r8, 0), r7) == r0) goto L20;
     */
    /* JADX WARN: Path cross not found for [B:13:0x0025, B:16:0x002e], limit reached: 23 */
    /* JADX WARN: Path cross not found for [B:16:0x002e, B:13:0x0025], limit reached: 23 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0030 -> B:11:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:21:0x0050). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r7.f19749o
            r2 = 2
            r3 = 1
            x.j0 r4 = r7.f19750p
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            android.support.v4.media.session.b.K(r8)
            goto L50
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            android.support.v4.media.session.b.K(r8)
            goto L2e
        L1e:
            android.support.v4.media.session.b.K(r8)
        L21:
            y5.c r8 = r4.f19764M
            if (r8 == 0) goto L2e
            r7.f19749o = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L2e
            goto L4f
        L2e:
            x.v0 r8 = r4.f19759H
            if (r8 == 0) goto L21
            o0.d r8 = new o0.d
            r1 = 17
            r8.<init>(r1)
            r7.f19749o = r2
            c5.i r1 = r7.getContext()
            f0.X r1 = f0.C0879c.q(r1)
            f0.Y r5 = new f0.Y
            r6 = 0
            r5.<init>(r8, r6)
            java.lang.Object r8 = r1.s(r5, r7)
            if (r8 != r0) goto L50
        L4f:
            return r0
        L50:
            x.v0 r8 = r4.f19759H
            if (r8 == 0) goto L21
            x.x0 r8 = (x.C1886x0) r8
            r8.d()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1856i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
