package r1;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f15698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z f15699q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z zVar, c5.d dVar) {
        super(2, dVar);
        this.f15699q = zVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        k kVar = new k(this.f15699q, dVar);
        kVar.f15698p = obj;
        return kVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Path cross not found for [B:18:0x005a, B:20:0x005e], limit reached: 25 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:16:0x0048). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r8.f15697o
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r8.f15698p
            w5.B r1 = (w5.InterfaceC1765B) r1
            android.support.v4.media.session.b.K(r9)
            goto L48
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            android.support.v4.media.session.b.K(r9)
            java.lang.Object r9 = r8.f15698p
            w5.B r9 = (w5.InterfaceC1765B) r9
            r1 = r9
        L21:
            boolean r9 = w5.AbstractC1767D.s(r1)
            if (r9 == 0) goto L68
            r1.e r9 = r1.C1411e.f15674r
            r8.f15698p = r1
            r8.f15697o = r2
            c5.i r3 = r8.getContext()
            R0.B0 r4 = R0.B0.f6248o
            c5.g r3 = r3.n(r4)
            if (r3 != 0) goto L62
            c5.i r3 = r8.getContext()
            f0.X r3 = f0.C0879c.q(r3)
            java.lang.Object r9 = r3.s(r9, r8)
            if (r9 != r0) goto L48
            return r0
        L48:
            r1.z r9 = r8.f15699q
            int[] r3 = r9.f15754O
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.f15758z
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L5e
            r3 = r3[r2]
            if (r6 == r3) goto L21
        L5e:
            r9.l()
            goto L21
        L62:
            java.lang.ClassCastException r9 = new java.lang.ClassCastException
            r9.<init>()
            throw r9
        L68:
            Y4.o r9 = Y4.o.f8736a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
