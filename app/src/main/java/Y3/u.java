package y3;

import Z4.C0508b;
import java.util.ArrayList;
import java.util.Iterator;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;
import q.S0;
import t.AbstractC1464t;
import t.U;
import t5.C1517a;
import t5.InterfaceC1524h;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class u extends s implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ int f20472A = 0;

    /* JADX INFO: renamed from: w */
    public final U f20473w;

    /* JADX INFO: renamed from: x */
    public int f20474x;

    /* JADX INFO: renamed from: y */
    public String f20475y;

    /* JADX INFO: renamed from: z */
    public String f20476z;

    public u(w wVar) {
        super(wVar);
        this.f20473w = new U(0);
    }

    @Override // y3.s
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        U u7 = this.f20473w;
        InterfaceC1524h interfaceC1524hG = t5.j.G(AbstractC1464t.d(u7));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C1517a) interfaceC1524hG).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        u uVar = (u) obj;
        U u8 = uVar.f20473w;
        C0508b c0508bD = AbstractC1464t.d(u8);
        while (c0508bD.hasNext()) {
            arrayList.remove((s) c0508bD.next());
        }
        return super.equals(obj) && u7.h() == u8.h() && this.f20474x == uVar.f20474x && arrayList.isEmpty();
    }

    @Override // y3.s
    public final r g(S0 s02) {
        r rVarG = super.g(s02);
        ArrayList arrayList = new ArrayList();
        t tVar = new t(this);
        while (tVar.hasNext()) {
            r rVarG2 = ((s) tVar.next()).g(s02);
            if (rVarG2 != null) {
                arrayList.add(rVarG2);
            }
        }
        return (r) Z4.n.z0(Z4.l.g0(new r[]{rVarG, (r) Z4.n.z0(arrayList)}));
    }

    @Override // y3.s
    public final int hashCode() {
        int iF = this.f20474x;
        U u7 = this.f20473w;
        int iH = u7.h();
        for (int i7 = 0; i7 < iH; i7++) {
            iF = (((iF * 31) + u7.f(i7)) * 31) + ((s) u7.i(i7)).hashCode();
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    public final s n(int i7, boolean z6) {
        u uVar;
        s sVar = (s) this.f20473w.e(i7);
        if (sVar != null) {
            return sVar;
        }
        if (!z6 || (uVar = this.f20463p) == null) {
            return null;
        }
        return uVar.n(i7, true);
    }

    public final s o(String str, boolean z6) {
        u uVar;
        Object next;
        AbstractC1209k.f(str, "route");
        int iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        U u7 = this.f20473w;
        s sVar = (s) u7.e(iHashCode);
        if (sVar == null) {
            Iterator it = ((C1517a) t5.j.G(AbstractC1464t.d(u7))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((s) next).e(str) != null) {
                    break;
                }
            }
            sVar = (s) next;
        }
        if (sVar != null) {
            return sVar;
        }
        if (!z6 || (uVar = this.f20463p) == null || AbstractC1545g.Z(str)) {
            return null;
        }
        return uVar.o(str, true);
    }

    public final r p(S0 s02) {
        return super.g(s02);
    }

    @Override // y3.s
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f20476z;
        s sVarO = (str == null || AbstractC1545g.Z(str)) ? null : o(str, true);
        if (sVarO == null) {
            sVarO = n(this.f20474x, true);
        }
        sb.append(" startDestination=");
        if (sVarO == null) {
            String str2 = this.f20476z;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f20475y;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f20474x));
                }
            }
        } else {
            sb.append("{");
            sb.append(sVarO.toString());
            sb.append("}");
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "sb.toString()");
        return string;
    }
}
