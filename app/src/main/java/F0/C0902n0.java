package f0;

import h0.C0993a;
import java.util.ArrayList;
import java.util.List;
import l5.InterfaceC1180a;
import n5.InterfaceC1237a;
import n5.InterfaceC1239c;
import t.C1444F;

/* JADX INFO: renamed from: f0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0902n0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C0904o0 f11849o;

    public C0902n0(C0904o0 c0904o0) {
        this.f11849o = c0904o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [t.F] */
    /* JADX WARN: Type inference failed for: r11v3, types: [t.F] */
    /* JADX WARN: Type inference failed for: r6v1, types: [f0.T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object[]] */
    @Override // l5.InterfaceC1180a
    public final Object a() {
        C0904o0 c0904o0 = this.f11849o;
        t.J j3 = new t.J(c0904o0.f11851a.size());
        ArrayList arrayList = c0904o0.f11851a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ?? r62 = (T) arrayList.get(i7);
            Object obj = r62.f11746b;
            int i8 = r62.f11745a;
            Object s7 = obj != null ? new S(Integer.valueOf(i8), r62.f11746b) : Integer.valueOf(i8);
            int iF = j3.f(s7);
            boolean z6 = iF < 0;
            Object obj2 = z6 ? null : j3.f16005c[iF];
            if ((obj2 instanceof List) && (obj2 instanceof InterfaceC1237a)) {
                boolean z7 = obj2 instanceof InterfaceC1239c;
            }
            if (obj2 != null) {
                if (obj2 instanceof C1444F) {
                    ?? r10 = (C1444F) obj2;
                    r10.a(r62);
                    r62 = r10;
                } else {
                    Object[] objArr = t.O.f16029a;
                    ?? c1444f = new C1444F(2);
                    c1444f.a(obj2);
                    c1444f.a(r62);
                    r62 = c1444f;
                }
            }
            if (z6) {
                int i9 = ~iF;
                j3.f16004b[i9] = s7;
                j3.f16005c[i9] = r62;
            } else {
                j3.f16005c[iF] = r62;
            }
        }
        return new C0993a(j3);
    }
}
