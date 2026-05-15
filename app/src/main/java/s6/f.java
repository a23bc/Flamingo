package s6;

import Q0.N;
import Y4.h;
import Y4.o;
import d.C0746L;
import f0.C0886f0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w2.l;
import x0.C1893c;
import y0.AbstractC1959I;
import y0.C1987t;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f15955p;

    public /* synthetic */ f(C0886f0 c0886f0, int i7) {
        this.f15954o = i7;
        this.f15955p = c0886f0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        o oVar = o.f8736a;
        int i7 = 2;
        C0886f0 c0886f0 = this.f15955p;
        switch (this.f15954o) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                AbstractC1209k.f(c0886f0, "$cornerValue");
                c0886f0.j(fFloatValue);
                return oVar;
            case 1:
                v0.d dVar = (v0.d) obj;
                AbstractC1209k.f(c0886f0, "$average");
                AbstractC1209k.f(dVar, "$this$drawWithCache");
                return dVar.a(new f(c0886f0, i7));
            default:
                N n7 = (N) obj;
                AbstractC1209k.f(c0886f0, "$average");
                AbstractC1209k.f(n7, "$this$onDrawWithContent");
                System.out.getClass();
                l lVarG = AbstractC1959I.g();
                lVarG.g(12);
                A0.c cVar = n7.f5853o;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f54p.W() >> 32));
                A0.b bVar = cVar.f54p;
                C1893c c1893c = new C1893c(0.0f, 0.0f, fIntBitsToFloat, Float.intBitsToFloat((int) (bVar.W() & 4294967295L)));
                InterfaceC1985r interfaceC1985rS = bVar.S();
                interfaceC1985rS.q(c1893c, lVarG);
                n7.a();
                float fH = c0886f0.h() / 4;
                float fH2 = 1.0f - c0886f0.h();
                Float fValueOf = Float.valueOf(0.0f);
                long j3 = C1987t.f20261i;
                h hVar = new h(fValueOf, new C1987t(j3));
                h hVar2 = new h(Float.valueOf(fH), new C1987t(AbstractC1959I.c(738197504)));
                float f7 = 2 * fH;
                h hVar3 = new h(Float.valueOf(f7), new C1987t(AbstractC1959I.c(1493172224)));
                float f8 = 3 * fH;
                h hVar4 = new h(Float.valueOf(f8), new C1987t(AbstractC1959I.d(3003121664L)));
                Float fValueOf2 = Float.valueOf(c0886f0.h());
                long j7 = C1987t.f20255b;
                A0.e.w(n7, C0746L.r(new h[]{hVar, hVar2, hVar3, hVar4, new h(fValueOf2, new C1987t(j7)), new h(Float.valueOf(fH2), new C1987t(j7)), new h(Float.valueOf(fH2 + fH), new C1987t(AbstractC1959I.d(3003121664L))), new h(Float.valueOf(f7 + fH2), new C1987t(AbstractC1959I.c(1493172224))), new h(Float.valueOf(fH2 + f8), new C1987t(AbstractC1959I.c(738197504))), new h(Float.valueOf(1.0f), new C1987t(j3))}), 0L, 0L, 0.0f, null, null, 62);
                interfaceC1985rS.k();
                return oVar;
        }
    }
}
