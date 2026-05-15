package f0;

import A5.AbstractC0027c;
import i0.InterfaceC1057e;
import k0.C1126c;
import k0.C1135l;
import l0.C1157a;
import l0.C1158b;
import m0.C1190b;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class W implements c5.h, Q0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ W f11763p = new W(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final W f11764q = new W(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final W f11765r = new W(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final W f11766s = new W(3);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final W f11767t = new W(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11768o;

    public /* synthetic */ W(int i7) {
        this.f11768o = i7;
    }

    public static final void b(W w7) {
        z5.J j3;
        Object obj;
        C1158b c1158b;
        z5.J j7 = B0.f11620z;
        do {
            j3 = B0.f11620z;
            obj = (InterfaceC1057e) j3.getValue();
            c1158b = (C1158b) obj;
            C1126c c1126cC = c1158b.f14151q;
            C1157a c1157a = (C1157a) c1126cC.get(w7);
            if (c1157a != null) {
                int iHashCode = w7 != null ? w7.hashCode() : 0;
                C1135l c1135l = c1126cC.f13972o;
                C1135l c1135lV = c1135l.v(iHashCode, w7, 0);
                if (c1135l != c1135lV) {
                    c1126cC = c1135lV == null ? C1126c.f13971q : new C1126c(c1135lV, c1126cC.f13973p - 1);
                }
                C1190b c1190b = C1190b.f14325a;
                Object obj2 = c1157a.f14146a;
                boolean z6 = obj2 != c1190b;
                Object obj3 = c1157a.f14147b;
                if (z6) {
                    Object obj4 = c1126cC.get(obj2);
                    AbstractC1209k.c(obj4);
                    c1126cC = c1126cC.c(obj2, new C1157a(((C1157a) obj4).f14146a, obj3));
                }
                if (obj3 != c1190b) {
                    Object obj5 = c1126cC.get(obj3);
                    AbstractC1209k.c(obj5);
                    c1126cC = c1126cC.c(obj3, new C1157a(obj2, ((C1157a) obj5).f14147b));
                }
                Object obj6 = obj2 != c1190b ? c1158b.f14149o : obj3;
                if (obj3 != c1190b) {
                    obj2 = c1158b.f14150p;
                }
                c1158b = new C1158b(obj6, obj2, c1126cC);
            }
            if (obj == c1158b) {
                return;
            }
            B5.u uVar = AbstractC0027c.f538b;
            if (obj == null) {
                obj = uVar;
            }
        } while (!j3.j(obj, c1158b));
    }

    @Override // f0.Q0
    public boolean a(Object obj, Object obj2) {
        switch (this.f11768o) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return AbstractC1209k.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f11768o) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
