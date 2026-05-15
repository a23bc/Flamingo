package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.CancellationException;
import m5.C1217s;
import w.AbstractC1671d;
import w.C1680m;
import w.C1689w;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: z.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2045k extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1217s f20873o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1680m f20874p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20875q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f20876r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2047l f20877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K0 f20878t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2045k(float f7, C2047l c2047l, K0 k02, c5.d dVar) {
        super(2, dVar);
        this.f20876r = f7;
        this.f20877s = c2047l;
        this.f20878t = k02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C2045k(this.f20876r, this.f20877s, this.f20878t, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2045k) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        float f7;
        C1680m c1680m;
        C1217s c1217s;
        C1689w c1689w;
        G.u uVar;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20875q;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            f7 = this.f20876r;
            if (Math.abs(f7) > 1.0f) {
                C1217s c1217s2 = new C1217s();
                c1217s2.f14436o = f7;
                C1217s c1217s3 = new C1217s();
                C1680m c1680mB = AbstractC1671d.b(0.0f, f7, 28);
                try {
                    C2047l c2047l = this.f20877s;
                    c1689w = c2047l.f20893a;
                    uVar = new G.u(c1217s3, this.f20878t, c1217s2, c2047l, 10);
                    this.f20873o = c1217s2;
                    this.f20874p = c1680mB;
                    this.f20875q = 1;
                } catch (CancellationException unused) {
                    c1680m = c1680mB;
                    c1217s = c1217s2;
                    c1217s.f14436o = ((Number) c1680m.b()).floatValue();
                }
                if (AbstractC1671d.e(c1680mB, c1689w, false, uVar, this) == enumC0830a) {
                    return enumC0830a;
                }
                c1217s = c1217s2;
                f7 = c1217s.f14436o;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1680m = this.f20874p;
            c1217s = this.f20873o;
            try {
                android.support.v4.media.session.b.K(obj);
            } catch (CancellationException unused2) {
                c1217s.f14436o = ((Number) c1680m.b()).floatValue();
            }
            f7 = c1217s.f14436o;
        }
        return new Float(f7);
    }
}
