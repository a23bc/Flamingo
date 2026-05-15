package E0;

import E4.AbstractC0119q;
import E4.b0;
import java.util.ArrayList;
import k3.C1145a;
import m5.AbstractC1209k;
import r5.C1422c;
import r5.C1423d;
import u5.AbstractC1545g;
import w.C1655D;
import w.InterfaceC1653B;
import w.InterfaceC1685s;

/* JADX INFO: renamed from: E0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0096g implements I2.a, InterfaceC1685s {

    /* JADX INFO: renamed from: o */
    public final ArrayList f1743o;

    public C0096g(int i7) {
        switch (i7) {
            case 1:
                this.f1743o = new ArrayList(20);
                break;
            case 2:
                this.f1743o = new ArrayList();
                break;
            default:
                this.f1743o = new ArrayList(32);
                break;
        }
    }

    @Override // I2.a
    public E4.I a(long j3) {
        int iL = l(j3);
        if (iL == 0) {
            E4.G g6 = E4.I.f1870p;
            return b0.f1913s;
        }
        C1145a c1145a = (C1145a) this.f1743o.get(iL - 1);
        long j7 = c1145a.f14024d;
        if (j7 == -9223372036854775807L || j3 < j7) {
            return c1145a.f14021a;
        }
        E4.G g7 = E4.I.f1870p;
        return b0.f1913s;
    }

    @Override // I2.a
    public long b(long j3) {
        ArrayList arrayList = this.f1743o;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((C1145a) arrayList.get(0)).f14022b) {
            return ((C1145a) arrayList.get(0)).f14022b;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            C1145a c1145a = (C1145a) arrayList.get(i7);
            if (j3 < c1145a.f14022b) {
                long j7 = ((C1145a) arrayList.get(i7 - 1)).f14024d;
                long j8 = c1145a.f14022b;
                return (j7 == -9223372036854775807L || j7 <= j3 || j7 >= j8) ? j8 : j7;
            }
        }
        long j9 = ((C1145a) AbstractC0119q.j(arrayList)).f14024d;
        if (j9 == -9223372036854775807L || j3 >= j9) {
            return Long.MIN_VALUE;
        }
        return j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    @Override // I2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(k3.C1145a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f14022b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            w2.AbstractC1697a.d(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f14024d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f1743o
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            k3.a r7 = (k3.C1145a) r7
            long r7 = r7.f14022b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            k3.a r7 = (k3.C1145a) r7
            long r7 = r7.f14022b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.C0096g.c(k3.a, long):boolean");
    }

    @Override // I2.a
    public void clear() {
        this.f1743o.clear();
    }

    @Override // I2.a
    public long d(long j3) {
        ArrayList arrayList = this.f1743o;
        if (arrayList.isEmpty() || j3 < ((C1145a) arrayList.get(0)).f14022b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            long j7 = ((C1145a) arrayList.get(i7)).f14022b;
            if (j3 == j7) {
                return j7;
            }
            if (j3 < j7) {
                C1145a c1145a = (C1145a) arrayList.get(i7 - 1);
                long j8 = c1145a.f14024d;
                return (j8 == -9223372036854775807L || j8 > j3) ? c1145a.f14022b : j8;
            }
        }
        C1145a c1145a2 = (C1145a) AbstractC0119q.j(arrayList);
        long j9 = c1145a2.f14024d;
        return (j9 == -9223372036854775807L || j3 < j9) ? c1145a2.f14022b : j9;
    }

    @Override // I2.a
    public void e(long j3) {
        int iL = l(j3);
        if (iL > 0) {
            this.f1743o.subList(0, iL).clear();
        }
    }

    public void f(String str, String str2) {
        AbstractC1209k.f(str, "name");
        AbstractC1209k.f(str2, "value");
        ArrayList arrayList = this.f1743o;
        arrayList.add(str);
        arrayList.add(AbstractC1545g.u0(str2).toString());
    }

    public void g(String str, String str2) {
        AbstractC1209k.f(str, "name");
        AbstractC1209k.f(str2, "value");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(G5.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i7), str).toString());
            }
        }
        f(str, str2);
    }

    @Override // w.InterfaceC1685s
    public InterfaceC1653B get(int i7) {
        return (C1655D) this.f1743o.get(i7);
    }

    public F5.m h() {
        return new F5.m((String[]) this.f1743o.toArray(new String[0]));
    }

    public void i() {
        this.f1743o.add(C0100k.f1770c);
    }

    public void j(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f1743o.add(new C0101l(f7, f8, f9, f10, f11, f12));
    }

    public void k(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f1743o.add(new t(f7, f8, f9, f10, f11, f12));
    }

    public int l(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f1743o;
            if (i7 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j3 < ((C1145a) arrayList.get(i7)).f14022b) {
                return i7;
            }
            i7++;
        }
    }

    public void m(float f7) {
        this.f1743o.add(new u(f7));
    }

    public void n(float f7, float f8) {
        this.f1743o.add(new n(f7, f8));
    }

    public void o(float f7, float f8) {
        this.f1743o.add(new v(f7, f8));
    }

    public void p(float f7, float f8) {
        this.f1743o.add(new o(f7, f8));
    }

    public void q(float f7, float f8, float f9, float f10) {
        this.f1743o.add(new y(f7, f8, f9, f10));
    }

    public void r(String str) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f1743o;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i7))) {
                arrayList.remove(i7);
                arrayList.remove(i7);
                i7 -= 2;
            }
            i7 += 2;
        }
    }

    public void s(float f7) {
        this.f1743o.add(new B(f7));
    }

    public void t(float f7) {
        this.f1743o.add(new A(f7));
    }

    public C0096g(float f7, float f8, w.r rVar) {
        C1423d c1423dM = i6.h.M(0, rVar.b());
        ArrayList arrayList = new ArrayList(Z4.p.j0(c1423dM));
        C1422c it = c1423dM.iterator();
        while (it.f15786q) {
            arrayList.add(new C1655D(f7, f8, rVar.a(it.b())));
        }
        this.f1743o = arrayList;
    }
}
