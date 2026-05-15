package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0886f0;
import l5.InterfaceC1182c;
import w.AbstractC1671d;
import w.C1680m;
import w.C1689w;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f17336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f17337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1689w f17338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f17339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f17340t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C0886f0 c0886f0, float f7, C1689w c1689w, float f8, float f9, c5.d dVar) {
        super(2, dVar);
        this.f17336p = c0886f0;
        this.f17337q = f7;
        this.f17338r = c1689w;
        this.f17339s = f8;
        this.f17340t = f9;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new B(this.f17336p, this.f17337q, this.f17338r, this.f17339s, this.f17340t, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f17335o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            final C0886f0 c0886f0 = this.f17336p;
            float fH = c0886f0.h();
            final float f7 = this.f17337q;
            C1680m c1680mB = AbstractC1671d.b(fH, f7, 28);
            final float f8 = this.f17339s;
            final float f9 = this.f17340t;
            InterfaceC1182c interfaceC1182c = new InterfaceC1182c() { // from class: u6.A
                /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
                @Override // l5.InterfaceC1182c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object b(java.lang.Object r6) {
                    /*
                        r5 = this;
                        w.k r6 = (w.C1678k) r6
                        f0.j0 r0 = r6.f18702e
                        java.lang.Object r0 = r0.getValue()
                        java.lang.Number r0 = (java.lang.Number) r0
                        float r0 = r0.floatValue()
                        float r1 = r1
                        float r2 = r2
                        float r0 = i6.h.p(r0, r1, r2)
                        f0.f0 r3 = r3
                        r3.j(r0)
                        float r0 = r4
                        float r3 = java.lang.Math.abs(r0)
                        r4 = 1036831949(0x3dcccccd, float:0.1)
                        int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                        if (r3 < 0) goto L4f
                        f0.j0 r3 = r6.f18702e
                        java.lang.Object r4 = r3.getValue()
                        java.lang.Number r4 = (java.lang.Number) r4
                        float r4 = r4.floatValue()
                        int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                        r4 = 0
                        if (r1 != 0) goto L3d
                        int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                        if (r1 < 0) goto L4f
                    L3d:
                        java.lang.Object r1 = r3.getValue()
                        java.lang.Number r1 = (java.lang.Number) r1
                        float r1 = r1.floatValue()
                        int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                        if (r1 != 0) goto L52
                        int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                        if (r0 <= 0) goto L52
                    L4f:
                        r6.a()
                    L52:
                        Y4.o r6 = Y4.o.f8736a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: u6.A.b(java.lang.Object):java.lang.Object");
                }
            };
            this.f17335o = 1;
            if (AbstractC1671d.e(c1680mB, this.f17338r, false, interfaceC1182c, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
