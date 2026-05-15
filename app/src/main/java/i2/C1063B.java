package i2;

import android.content.Context;
import b2.C0671m;
import b2.y0;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.B0;
import m5.C1219u;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: i2.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1063B extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f13305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B0 f13306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0671m f13307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z5.J f13308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f13309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y0 f13310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ K f13311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ I f13312w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063B(B0 b0, C0671m c0671m, z5.J j3, Context context, y0 y0Var, K k7, I i7, c5.d dVar) {
        super(2, dVar);
        this.f13306q = b0;
        this.f13307r = c0671m;
        this.f13308s = j3;
        this.f13309t = context;
        this.f13310u = y0Var;
        this.f13311v = k7;
        this.f13312w = i7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1063B c1063b = new C1063B(this.f13306q, this.f13307r, this.f13308s, this.f13309t, this.f13310u, this.f13311v, this.f13312w, dVar);
        c1063b.f13305p = obj;
        return c1063b;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1063B) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13304o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f13305p;
            C1219u c1219u = new C1219u();
            B0 b0 = this.f13306q;
            c1219u.f14438o = b0.f11621a;
            C1062A c1062a = new C1062A(this.f13307r, b0, c1219u, this.f13308s, this.f13309t, this.f13310u, this.f13311v, this.f13312w, interfaceC1765B, null);
            this.f13304o = 1;
            if (z5.z.d(b0.f11639u, c1062a, this) == enumC0830a) {
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
