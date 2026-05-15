package h6;

import d2.C0821i;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: renamed from: h6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1018g implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t6.d f13053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n1.d f13054q;

    public /* synthetic */ C1018g(t6.d dVar, n1.d dVar2, int i7) {
        this.f13052o = i7;
        this.f13053p = dVar;
        this.f13054q = dVar2;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f13052o) {
            case 0:
                v0.d dVar = (v0.d) obj;
                t6.d dVar2 = this.f13053p;
                n1.d dVar3 = this.f13054q;
                AbstractC1209k.f(dVar3, "$density");
                AbstractC1209k.f(dVar, "$this$drawWithCache");
                return dVar.a(new C1018g(dVar2, dVar3, 1));
            case 1:
                Q0.N n7 = (Q0.N) obj;
                t6.d dVar4 = this.f13053p;
                n1.d dVar5 = this.f13054q;
                AbstractC1209k.f(dVar5, "$density");
                AbstractC1209k.f(n7, "$this$onDrawWithContent");
                n7.a();
                A0.c cVar = n7.f5853o;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f54p.W() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.f54p.W() & 4294967295L));
                AbstractC1959I abstractC1959IA = dVar4.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), n1.n.f14521o, dVar5);
                long j3 = C1987t.f20256c;
                AbstractC1959I.k(n7, abstractC1959IA, C1987t.b(j3, 0.6f), new A0.i(5.0f, 0.0f, 0, 0, 30), 20);
                AbstractC1959I.k(n7, abstractC1959IA, C1987t.b(j3, 0.08f), new A0.i(5.0f, 0.0f, 0, 0, 30), 52);
                return Y4.o.f8736a;
            case 2:
                Q0.N n8 = (Q0.N) obj;
                t6.d dVar6 = this.f13053p;
                n1.d dVar7 = this.f13054q;
                AbstractC1209k.f(dVar7, "$density");
                AbstractC1209k.f(n8, "$this$onDrawWithContent");
                n8.a();
                A0.c cVar2 = n8.f5853o;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cVar2.f54p.W() >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (cVar2.f54p.W() & 4294967295L));
                AbstractC1959I abstractC1959IA2 = dVar6.a((((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), n1.n.f14521o, dVar7);
                long j7 = C1987t.f20257d;
                AbstractC1959I.k(n8, abstractC1959IA2, C1987t.b(j7, 0.1f), new A0.i(8.0f, 0.0f, 0, 0, 30), 52);
                AbstractC1959I.k(n8, abstractC1959IA2, C1987t.b(j7, 0.5f), new A0.i(8.0f, 0.0f, 0, 0, 30), 20);
                return Y4.o.f8736a;
            case 3:
                v0.d dVar8 = (v0.d) obj;
                t6.d dVar9 = this.f13053p;
                n1.d dVar10 = this.f13054q;
                AbstractC1209k.f(dVar10, "$density");
                AbstractC1209k.f(dVar8, "$this$drawWithCache");
                return dVar8.a(new C1018g(dVar9, dVar10, 4));
            case 4:
                Q0.N n9 = (Q0.N) obj;
                t6.d dVar11 = this.f13053p;
                n1.d dVar12 = this.f13054q;
                AbstractC1209k.f(dVar12, "$density");
                AbstractC1209k.f(n9, "$this$onDrawWithContent");
                n9.a();
                A0.c cVar3 = n9.f5853o;
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (cVar3.f54p.W() >> 32));
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (cVar3.f54p.W() & 4294967295L));
                AbstractC1959I abstractC1959IA3 = dVar11.a((((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L), n1.n.f14521o, dVar12);
                long j8 = C1987t.f20257d;
                AbstractC1959I.k(n9, abstractC1959IA3, C1987t.b(j8, 0.1f), new A0.i(8.0f, 0.0f, 0, 0, 30), 52);
                AbstractC1959I.k(n9, abstractC1959IA3, C1987t.b(j8, 0.5f), new A0.i(8.0f, 0.0f, 0, 0, 30), 20);
                return Y4.o.f8736a;
            case 5:
                v0.d dVar13 = (v0.d) obj;
                t6.d dVar14 = this.f13053p;
                n1.d dVar15 = this.f13054q;
                AbstractC1209k.f(dVar15, "$density");
                AbstractC1209k.f(dVar13, "$this$drawWithCache");
                return dVar13.a(new C1018g(dVar14, dVar15, 2));
            case 6:
                v0.d dVar16 = (v0.d) obj;
                t6.d dVar17 = this.f13053p;
                n1.d dVar18 = this.f13054q;
                AbstractC1209k.f(dVar18, "$density");
                AbstractC1209k.f(dVar16, "$this$drawWithCache");
                return dVar16.a(new C1018g(dVar17, dVar18, 7));
            case 7:
                Q0.N n10 = (Q0.N) obj;
                t6.d dVar19 = this.f13053p;
                n1.d dVar20 = this.f13054q;
                AbstractC1209k.f(dVar20, "$density");
                AbstractC1209k.f(n10, "$this$onDrawWithContent");
                n10.a();
                A0.c cVar4 = n10.f5853o;
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (cVar4.f54p.W() >> 32));
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (cVar4.f54p.W() & 4294967295L));
                AbstractC1959I abstractC1959IA4 = dVar19.a((((long) Float.floatToRawIntBits(fIntBitsToFloat7)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat8)) & 4294967295L), n1.n.f14521o, dVar20);
                long j9 = C1987t.f20257d;
                AbstractC1959I.k(n10, abstractC1959IA4, C1987t.b(j9, 0.1f), new A0.i(8.0f, 0.0f, 0, 0, 30), 52);
                AbstractC1959I.k(n10, abstractC1959IA4, C1987t.b(j9, 0.5f), new A0.i(8.0f, 0.0f, 0, 0, 30), 20);
                return Y4.o.f8736a;
            case 8:
                v0.d dVar21 = (v0.d) obj;
                t6.d dVar22 = this.f13053p;
                n1.d dVar23 = this.f13054q;
                AbstractC1209k.f(dVar23, "$density");
                AbstractC1209k.f(dVar21, "$this$drawWithCache");
                return dVar21.a(new C1018g(dVar22, dVar23, 9));
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                Q0.N n11 = (Q0.N) obj;
                t6.d dVar24 = this.f13053p;
                n1.d dVar25 = this.f13054q;
                AbstractC1209k.f(dVar25, "$density");
                AbstractC1209k.f(n11, "$this$onDrawWithContent");
                n11.a();
                A0.c cVar5 = n11.f5853o;
                float fIntBitsToFloat9 = Float.intBitsToFloat((int) (cVar5.f54p.W() >> 32));
                float fIntBitsToFloat10 = Float.intBitsToFloat((int) (cVar5.f54p.W() & 4294967295L));
                AbstractC1959I abstractC1959IA5 = dVar24.a((((long) Float.floatToRawIntBits(fIntBitsToFloat9)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat10)) & 4294967295L), n1.n.f14521o, dVar25);
                long j10 = C1987t.f20257d;
                AbstractC1959I.k(n11, abstractC1959IA5, C1987t.b(j10, 0.5f), new A0.i(4.0f, 0.0f, 0, 0, 30), 20);
                AbstractC1959I.k(n11, abstractC1959IA5, C1987t.b(j10, 0.2f), new A0.i(4.0f, 0.0f, 0, 0, 30), 52);
                return Y4.o.f8736a;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                v0.d dVar26 = (v0.d) obj;
                t6.d dVar27 = this.f13053p;
                n1.d dVar28 = this.f13054q;
                AbstractC1209k.f(dVar28, "$density");
                AbstractC1209k.f(dVar26, "$this$drawWithCache");
                return dVar26.a(new C1018g(dVar27, dVar28, 11));
            default:
                Q0.N n12 = (Q0.N) obj;
                t6.d dVar29 = this.f13053p;
                n1.d dVar30 = this.f13054q;
                AbstractC1209k.f(dVar30, "$density");
                AbstractC1209k.f(n12, "$this$onDrawWithContent");
                n12.a();
                A0.c cVar6 = n12.f5853o;
                float fIntBitsToFloat11 = Float.intBitsToFloat((int) (cVar6.f54p.W() >> 32));
                float fIntBitsToFloat12 = Float.intBitsToFloat((int) (cVar6.f54p.W() & 4294967295L));
                AbstractC1959I abstractC1959IA6 = dVar29.a((((long) Float.floatToRawIntBits(fIntBitsToFloat11)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat12)) & 4294967295L), n1.n.f14521o, dVar30);
                long j11 = C1987t.f20257d;
                AbstractC1959I.k(n12, abstractC1959IA6, C1987t.b(j11, 0.5f), new A0.i(8.0f, 0.0f, 0, 0, 30), 20);
                AbstractC1959I.k(n12, abstractC1959IA6, C1987t.b(j11, 0.1f), new A0.i(8.0f, 0.0f, 0, 0, 30), 52);
                return Y4.o.f8736a;
        }
    }
}
