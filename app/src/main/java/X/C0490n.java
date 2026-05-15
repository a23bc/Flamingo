package X;

import M.C0265j;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t.AbstractC1462q;
import t.C1439A;
import t.C1441C;

/* JADX INFO: renamed from: X.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0490n implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1439A f8105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E f8110f;

    public C0490n(C1439A c1439a, ArrayList arrayList, int i7, int i8, boolean z6, E e7) {
        this.f8105a = c1439a;
        this.f8106b = arrayList;
        this.f8107c = i7;
        this.f8108d = i8;
        this.f8109e = z6;
        this.f8110f = e7;
        if (arrayList.size() > 1) {
            return;
        }
        C.b.c("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList.size() + '.');
    }

    public static void n(C1441C c1441c, E e7, B b7, int i7, int i8) {
        E e8;
        if (e7.f7893c) {
            e8 = new E(b7.a(i8), b7.a(i7), i8 > i7);
        } else {
            e8 = new E(b7.a(i7), b7.a(i8), i7 > i8);
        }
        if (i7 > i8) {
            C.b.c("minOffset should be less than or equal to maxOffset: " + e8);
        }
        long j3 = b7.f7873a;
        int iC = c1441c.c(j3);
        Object[] objArr = c1441c.f15968c;
        Object obj = objArr[iC];
        c1441c.f15967b[iC] = j3;
        objArr[iC] = e8;
    }

    @Override // X.Z
    public final boolean a() {
        return this.f8109e;
    }

    @Override // X.Z
    public final B b() {
        return this.f8109e ? g() : j();
    }

    @Override // X.Z
    public final E c() {
        return this.f8110f;
    }

    @Override // X.Z
    public final C1441C d(E e7) {
        D d4 = e7.f7891a;
        long j3 = d4.f7889c;
        D d7 = e7.f7892b;
        long j7 = d7.f7889c;
        boolean z6 = e7.f7893c;
        if (j3 != j7) {
            C1441C c1441c = AbstractC1462q.f16101a;
            C1441C c1441c2 = new C1441C();
            n(c1441c2, e7, f(), (z6 ? d7 : d4).f7888b, f().f7878f.f9929a.f9920a.f9970p.length());
            e(new C0265j(this, c1441c2, e7, 5));
            if (!z6) {
                d4 = d7;
            }
            n(c1441c2, e7, k() == EnumC0482j.f8086o ? g() : j(), 0, d4.f7888b);
            return c1441c2;
        }
        int i7 = d4.f7888b;
        int i8 = d7.f7888b;
        if ((!z6 || i7 < i8) && (z6 || i7 > i8)) {
            C.b.c("unexpectedly miss-crossed selection: " + e7);
        }
        long j8 = d4.f7889c;
        C1441C c1441c3 = AbstractC1462q.f16101a;
        C1441C c1441c4 = new C1441C();
        c1441c4.h(j8, e7);
        return c1441c4;
    }

    @Override // X.Z
    public final void e(InterfaceC1182c interfaceC1182c) {
        int iO = o(f().f7873a);
        int iO2 = o((k() == EnumC0482j.f8086o ? g() : j()).f7873a);
        int i7 = iO + 1;
        if (i7 >= iO2) {
            return;
        }
        while (i7 < iO2) {
            interfaceC1182c.b(this.f8106b.get(i7));
            i7++;
        }
    }

    @Override // X.Z
    public final B f() {
        return k() == EnumC0482j.f8086o ? j() : g();
    }

    @Override // X.Z
    public final B g() {
        return (B) this.f8106b.get(p(this.f8107c, true));
    }

    @Override // X.Z
    public final int h() {
        return this.f8107c;
    }

    @Override // X.Z
    public final int i() {
        return this.f8108d;
    }

    @Override // X.Z
    public final B j() {
        return (B) this.f8106b.get(p(this.f8108d, false));
    }

    @Override // X.Z
    public final EnumC0482j k() {
        int i7 = this.f8107c;
        int i8 = this.f8108d;
        if (i7 < i8) {
            return EnumC0482j.f8087p;
        }
        if (i7 > i8) {
            return EnumC0482j.f8086o;
        }
        return ((B) this.f8106b.get(i7 / 2)).b();
    }

    @Override // X.Z
    public final int l() {
        return this.f8106b.size();
    }

    @Override // X.Z
    public final boolean m(Z z6) {
        if (this.f8110f == null || z6 == null || !(z6 instanceof C0490n)) {
            return true;
        }
        C0490n c0490n = (C0490n) z6;
        if (this.f8109e != c0490n.f8109e || this.f8107c != c0490n.f8107c || this.f8108d != c0490n.f8108d) {
            return true;
        }
        ArrayList arrayList = this.f8106b;
        int size = arrayList.size();
        ArrayList arrayList2 = c0490n.f8106b;
        if (size != arrayList2.size()) {
            return true;
        }
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            B b7 = (B) arrayList.get(i7);
            B b8 = (B) arrayList2.get(i7);
            b7.getClass();
            if (b7.f7873a != b8.f7873a || b7.f7875c != b8.f7875c || b7.f7876d != b8.f7876d) {
                return true;
            }
        }
        return false;
    }

    public final int o(long j3) {
        try {
            return this.f8105a.c(j3);
        } catch (NoSuchElementException e7) {
            throw new IllegalStateException(A0.e.D("Invalid selectableId: ", j3), e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i7, boolean z6) {
        int iOrdinal = k().ordinal();
        boolean z7 = z6;
        if (iOrdinal == 0) {
            z7 = !z6 ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new A2.W();
            }
        }
        return (i7 - (!z7)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.f8109e);
        sb.append(", startPosition=");
        boolean z6 = true;
        float f7 = 2;
        sb.append((this.f8107c + 1) / f7);
        sb.append(", endPosition=");
        sb.append((this.f8108d + 1) / f7);
        sb.append(", crossed=");
        sb.append(k());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        ArrayList arrayList = this.f8106b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            B b7 = (B) arrayList.get(i7);
            if (z6) {
                z6 = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i7++;
            sb3.append(i7);
            sb3.append(" -> ");
            sb3.append(b7);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String string = sb2.toString();
        AbstractC1209k.e(string, "toString(...)");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }
}
