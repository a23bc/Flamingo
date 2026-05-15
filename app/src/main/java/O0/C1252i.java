package o0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import t.J;
import t.Q;

/* JADX INFO: renamed from: o0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1252i implements InterfaceC1251h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1182c f14646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J f14647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public J f14648q;

    public C1252i(Map map, InterfaceC1182c interfaceC1182c) {
        J j3;
        this.f14646o = interfaceC1182c;
        if (map == null || map.isEmpty()) {
            j3 = null;
        } else {
            j3 = new J(map.size());
            for (Map.Entry entry : map.entrySet()) {
                j3.m(entry.getKey(), entry.getValue());
            }
        }
        this.f14647p = j3;
    }

    @Override // o0.InterfaceC1251h
    public final boolean c(Object obj) {
        return ((Boolean) this.f14646o.b(obj)).booleanValue();
    }

    @Override // o0.InterfaceC1251h
    public final InterfaceC1250g d(String str, InterfaceC1180a interfaceC1180a) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!j0.k.y(str.charAt(i7))) {
                J j3 = this.f14648q;
                if (j3 == null) {
                    long[] jArr = Q.f16032a;
                    j3 = new J();
                    this.f14648q = j3;
                }
                Object objG = j3.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    j3.m(str, objG);
                }
                ((List) objG).add(interfaceC1180a);
                return new A0.b(j3, str, interfaceC1180a, 28);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    @Override // o0.InterfaceC1251h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map e() {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C1252i.e():java.util.Map");
    }

    @Override // o0.InterfaceC1251h
    public final Object f(String str) {
        J j3 = this.f14647p;
        List list = j3 != null ? (List) j3.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && j3 != null) {
            List listSubList = list.subList(1, list.size());
            int iF = j3.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = j3.f16005c;
            Object obj = objArr[iF];
            j3.f16004b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
