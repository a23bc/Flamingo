package w;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import m5.C1217s;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: w.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1660I extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public C1217s f18525o;

    /* JADX INFO: renamed from: p */
    public int f18526p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f18527q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC0878b0 f18528r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C1661J f18529s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660I(InterfaceC0878b0 interfaceC0878b0, C1661J c1661j, c5.d dVar) {
        super(2, dVar);
        this.f18528r = interfaceC0878b0;
        this.f18529s = c1661j;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1660I c1660i = new C1660I(this.f18528r, this.f18529s, dVar);
        c1660i.f18527q = obj;
        return c1660i;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((C1660I) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    /* JADX WARN: Path cross not found for [B:34:0x003e, B:41:0x0070], limit reached: 22 */
    /* JADX WARN: Path cross not found for [B:41:0x0070, B:34:0x003e], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x006e -> B:34:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x008a -> B:34:0x003e). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r11.f18526p
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            m5.s r1 = r11.f18525o
            java.lang.Object r4 = r11.f18527q
            w5.B r4 = (w5.InterfaceC1765B) r4
            android.support.v4.media.session.b.K(r12)
            r8 = r1
            r9 = r4
            goto L3e
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            m5.s r1 = r11.f18525o
            java.lang.Object r4 = r11.f18527q
            w5.B r4 = (w5.InterfaceC1765B) r4
            android.support.v4.media.session.b.K(r12)
            r8 = r1
            r9 = r4
            goto L69
        L2c:
            android.support.v4.media.session.b.K(r12)
            java.lang.Object r12 = r11.f18527q
            w5.B r12 = (w5.InterfaceC1765B) r12
            m5.s r1 = new m5.s
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f14436o = r4
            r9 = r12
            r8 = r1
        L3e:
            w.a r5 = new w.a
            f0.b0 r6 = r11.f18528r
            w.J r7 = r11.f18529s
            r10 = 1
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f18527q = r9
            r11.f18525o = r8
            r11.f18526p = r2
            c5.i r12 = r11.getContext()
            R0.B0 r1 = R0.B0.f6248o
            c5.g r12 = r12.n(r1)
            if (r12 != 0) goto L8d
            c5.i r12 = r11.getContext()
            f0.X r12 = f0.C0879c.q(r12)
            java.lang.Object r12 = r12.s(r5, r11)
            if (r12 != r0) goto L69
            goto L8c
        L69:
            float r12 = r8.f14436o
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L3e
            r1.x r12 = new r1.x
            r1 = 4
            r12.<init>(r1, r9)
            z3.t r12 = f0.C0879c.z(r12)
            w.H r1 = new w.H
            r4 = 0
            r1.<init>(r3, r4)
            r11.f18527q = r9
            r11.f18525o = r8
            r11.f18526p = r3
            java.lang.Object r12 = z5.z.h(r12, r1, r11)
            if (r12 != r0) goto L3e
        L8c:
            return r0
        L8d:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1660I.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
