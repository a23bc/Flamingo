package A5;

import d5.EnumC0830a;
import java.util.ArrayList;
import w5.AbstractC1767D;
import z5.InterfaceC2110e;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements r {

    /* JADX INFO: renamed from: o */
    public final c5.i f546o;

    /* JADX INFO: renamed from: p */
    public final int f547p;

    /* JADX INFO: renamed from: q */
    public final y5.a f548q;

    public g(c5.i iVar, int i7, y5.a aVar) {
        this.f546o = iVar;
        this.f547p = i7;
        this.f548q = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0015  */
    @Override // A5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final z5.InterfaceC2110e a(c5.i r5, int r6, y5.a r7) {
        /*
            r4 = this;
            c5.i r0 = r4.f546o
            c5.i r5 = r5.h(r0)
            y5.a r1 = y5.a.f20528o
            y5.a r2 = r4.f548q
            int r3 = r4.f547p
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = m5.AbstractC1209k.a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            A5.g r5 = r4.d(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A5.g.a(c5.i, int, y5.a):z5.e");
    }

    @Override // z5.InterfaceC2110e
    public Object b(InterfaceC2111f interfaceC2111f, c5.d dVar) {
        Object objH = AbstractC1767D.h(new e(interfaceC2111f, this, null), dVar);
        return objH == EnumC0830a.f11264o ? objH : Y4.o.f8736a;
    }

    public abstract Object c(y5.p pVar, f fVar);

    public abstract g d(c5.i iVar, int i7, y5.a aVar);

    public InterfaceC2110e e() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        c5.j jVar = c5.j.f10685o;
        c5.i iVar = this.f546o;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i7 = this.f547p;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        y5.a aVar = y5.a.f20528o;
        y5.a aVar2 = this.f548q;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return Z1.l.s(sb, Z4.n.w0(arrayList, ", ", null, null, null, 62), ']');
    }
}
