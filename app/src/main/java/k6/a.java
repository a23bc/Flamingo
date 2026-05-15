package k6;

import A0.i;
import Q0.N;
import Y4.o;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n1.n;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L.e f14130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n1.d f14131q;

    public /* synthetic */ a(L.e eVar, n1.d dVar, int i7) {
        this.f14129o = i7;
        this.f14130p = eVar;
        this.f14131q = dVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f14129o) {
            case 0:
                v0.d dVar = (v0.d) obj;
                L.e eVar = this.f14130p;
                AbstractC1209k.f(eVar, "$shape");
                n1.d dVar2 = this.f14131q;
                AbstractC1209k.f(dVar2, "$density");
                AbstractC1209k.f(dVar, "$this$drawWithCache");
                return dVar.a(new a(eVar, dVar2, 1));
            default:
                N n7 = (N) obj;
                L.e eVar2 = this.f14130p;
                AbstractC1209k.f(eVar2, "$shape");
                n1.d dVar3 = this.f14131q;
                AbstractC1209k.f(dVar3, "$density");
                AbstractC1209k.f(n7, "$this$onDrawWithContent");
                n7.a();
                A0.c cVar = n7.f5853o;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f54p.W() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.f54p.W() & 4294967295L));
                AbstractC1959I abstractC1959IA = eVar2.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), n.f14521o, dVar3);
                long j3 = C1987t.f20256c;
                AbstractC1959I.k(n7, abstractC1959IA, C1987t.b(j3, 0.08f), new i(6.0f, 0.0f, 0, 0, 30), 52);
                AbstractC1959I.k(n7, abstractC1959IA, C1987t.b(j3, 0.4f), new i(6.0f, 0.0f, 0, 0, 30), 20);
                return o.f8736a;
        }
    }
}
