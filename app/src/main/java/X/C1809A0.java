package x;

import l5.InterfaceC1182c;
import r5.C1420a;
import s5.InterfaceC1438c;

/* JADX INFO: renamed from: x.A0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1809A0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f19600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1420a f19601p;

    public /* synthetic */ C1809A0(float f7, C1420a c1420a) {
        this.f19600o = f7;
        this.f19601p = c1420a;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y0.j jVar = (Y0.j) obj;
        Float fValueOf = Float.valueOf(this.f19600o);
        C1420a c1420a = this.f19601p;
        float f7 = c1420a.f15779a;
        float f8 = c1420a.f15780b;
        if (f7 > f8) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c1420a + '.');
        }
        if (C1420a.a(fValueOf, Float.valueOf(f7)) && !C1420a.a(Float.valueOf(f7), fValueOf)) {
            fValueOf = Float.valueOf(f7);
        } else if (C1420a.a(Float.valueOf(f8), fValueOf) && !C1420a.a(fValueOf, Float.valueOf(f8))) {
            fValueOf = Float.valueOf(f8);
        }
        Y0.f fVar = new Y0.f(fValueOf.floatValue(), c1420a);
        InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
        Y0.w wVar = Y0.t.f8532c;
        InterfaceC1438c interfaceC1438c = Y0.v.f8556a[1];
        wVar.a(jVar, fVar);
        return Y4.o.f8736a;
    }
}
