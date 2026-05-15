package h6;

import f0.Z0;
import java.util.ArrayList;
import java.util.Arrays;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import x0.C1893c;
import y0.AbstractC1959I;
import y0.C1952B;
import y0.C1960J;
import y0.C1987t;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f12877o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Z0 f12878p;

    public /* synthetic */ K(Z0 z02, int i7) {
        this.f12877o = i7;
        this.f12878p = z02;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        Z0 z02 = this.f12878p;
        switch (this.f12877o) {
            case 0:
                v0.d dVar = (v0.d) obj;
                AbstractC1209k.f(z02, "$animatedBrush");
                AbstractC1209k.f(dVar, "$this$drawWithCache");
                break;
            case 1:
                Q0.N n7 = (Q0.N) obj;
                AbstractC1209k.f(z02, "$animatedBrush");
                AbstractC1209k.f(n7, "$this$onDrawWithContent");
                w2.l lVarG = AbstractC1959I.g();
                lVarG.g(12);
                A0.c cVar = n7.f5853o;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f54p.W() >> 32));
                A0.b bVar = cVar.f54p;
                C1893c c1893c = new C1893c(0.0f, 0.0f, fIntBitsToFloat, Float.intBitsToFloat((int) (bVar.W() & 4294967295L)));
                InterfaceC1985r interfaceC1985rS = bVar.S();
                interfaceC1985rS.q(c1893c, lVarG);
                long j3 = C1987t.f20261i;
                long jC = AbstractC1959I.c(1493172224);
                AbstractC1959I.c(553648128);
                long j7 = C1987t.f20255b;
                Y4.h[] hVarArr = {new Y4.h(Float.valueOf(0.0f), new C1987t(j3)), new Y4.h(Float.valueOf(0.05f), new C1987t(jC)), new Y4.h(Float.valueOf(0.1f), new C1987t(j7)), new Y4.h(Float.valueOf(((Number) z02.getValue()).floatValue() + 0.4f), new C1987t(j7)), new Y4.h(Float.valueOf(((Number) z02.getValue()).floatValue() + 0.55f), new C1987t(j3)), new Y4.h(Float.valueOf(((Number) z02.getValue()).floatValue() + 1.0f), new C1987t(j3))};
                System.out.getClass();
                n7.a();
                Y4.h[] hVarArr2 = (Y4.h[]) Arrays.copyOf(hVarArr, 6);
                Y4.h[] hVarArr3 = (Y4.h[]) Arrays.copyOf(hVarArr2, hVarArr2.length);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
                ArrayList arrayList = new ArrayList(hVarArr3.length);
                for (Y4.h hVar : hVarArr3) {
                    arrayList.add(new C1987t(((C1987t) hVar.f8727p).f20264a));
                }
                ArrayList arrayList2 = new ArrayList(hVarArr3.length);
                for (Y4.h hVar2 : hVarArr3) {
                    arrayList2.add(Float.valueOf(((Number) hVar2.f8726o).floatValue()));
                }
                A0.e.w(n7, new C1952B(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2), 0L, 0L, 0.0f, null, null, 62);
                interfaceC1985rS.k();
                break;
            case 2:
                C1960J c1960j = (C1960J) obj;
                AbstractC1209k.f(z02, "$heightWeight");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.q(AbstractC1959I.h(0.5f, 1.0f));
                c1960j.j(((Number) z02.getValue()).floatValue());
                break;
            case 3:
                C1960J c1960j2 = (C1960J) obj;
                AbstractC1209k.f(z02, "$alpha");
                AbstractC1209k.f(c1960j2, "$this$graphicsLayer");
                c1960j2.e(1);
                c1960j2.a(((Number) z02.getValue()).floatValue());
                break;
            case 4:
                C1960J c1960j3 = (C1960J) obj;
                AbstractC1209k.f(z02, "$alpha$delegate");
                AbstractC1209k.f(c1960j3, "$this$graphicsLayer");
                c1960j3.a(((Number) z02.getValue()).floatValue());
                break;
            case 5:
                C1960J c1960j4 = (C1960J) obj;
                AbstractC1209k.f(z02, "$alpha$delegate");
                AbstractC1209k.f(c1960j4, "$this$graphicsLayer");
                c1960j4.a(((Number) z02.getValue()).floatValue());
                break;
            case 6:
                C1960J c1960j5 = (C1960J) obj;
                AbstractC1209k.f(z02, "$wideAnimationProgress$delegate");
                AbstractC1209k.f(c1960j5, "$this$graphicsLayer");
                c1960j5.u((1.0f - ((Number) z02.getValue()).floatValue()) * 6.0f);
                break;
            case 7:
                C1960J c1960j6 = (C1960J) obj;
                AbstractC1209k.f(z02, "$translationAlpha$delegate");
                AbstractC1209k.f(c1960j6, "$this$graphicsLayer");
                c1960j6.a(((Number) z02.getValue()).floatValue());
                c1960j6.e(2);
                break;
            default:
                C1960J c1960j7 = (C1960J) obj;
                AbstractC1209k.f(z02, "$alpha");
                AbstractC1209k.f(c1960j7, "$this$graphicsLayer");
                c1960j7.a(((Number) z02.getValue()).floatValue());
                break;
        }
        return oVar;
    }
}
