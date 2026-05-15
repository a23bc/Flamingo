package S5;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Comparable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f6810p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f6811o;

    static {
        String str = File.separator;
        AbstractC1209k.e(str, "separator");
        f6810p = str;
    }

    public u(j jVar) {
        AbstractC1209k.f(jVar, "bytes");
        this.f6811o = jVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = T5.c.a(this);
        j jVar = this.f6811o;
        if (iA == -1) {
            iA = 0;
        } else if (iA < jVar.c() && jVar.h(iA) == 92) {
            iA++;
        }
        int iC = jVar.c();
        int i7 = iA;
        while (iA < iC) {
            if (jVar.h(iA) == 47 || jVar.h(iA) == 92) {
                arrayList.add(jVar.m(i7, iA));
                i7 = iA + 1;
            }
            iA++;
        }
        if (i7 < jVar.c()) {
            arrayList.add(jVar.m(i7, jVar.c()));
        }
        return arrayList;
    }

    public final u b() {
        j jVar = T5.c.f6990d;
        j jVar2 = this.f6811o;
        if (AbstractC1209k.a(jVar2, jVar)) {
            return null;
        }
        j jVar3 = T5.c.f6987a;
        if (AbstractC1209k.a(jVar2, jVar3)) {
            return null;
        }
        j jVar4 = T5.c.f6988b;
        if (AbstractC1209k.a(jVar2, jVar4)) {
            return null;
        }
        j jVar5 = T5.c.f6991e;
        jVar2.getClass();
        AbstractC1209k.f(jVar5, "suffix");
        int iC = jVar2.c();
        byte[] bArr = jVar5.f6787o;
        if (jVar2.l(iC - bArr.length, jVar5, bArr.length) && (jVar2.c() == 2 || jVar2.l(jVar2.c() - 3, jVar3, 1) || jVar2.l(jVar2.c() - 3, jVar4, 1))) {
            return null;
        }
        int iJ = j.j(jVar2, jVar3);
        if (iJ == -1) {
            iJ = j.j(jVar2, jVar4);
        }
        if (iJ == 2 && g() != null) {
            if (jVar2.c() == 3) {
                return null;
            }
            return new u(j.n(jVar2, 0, 3, 1));
        }
        if (iJ == 1) {
            AbstractC1209k.f(jVar4, "prefix");
            if (jVar2.l(0, jVar4, jVar4.c())) {
                return null;
            }
        }
        if (iJ != -1 || g() == null) {
            return iJ == -1 ? new u(jVar) : iJ == 0 ? new u(j.n(jVar2, 0, 1, 1)) : new u(j.n(jVar2, 0, iJ, 1));
        }
        if (jVar2.c() == 2) {
            return null;
        }
        return new u(j.n(jVar2, 0, 2, 1));
    }

    public final u c(u uVar) {
        AbstractC1209k.f(uVar, "other");
        int iA = T5.c.a(this);
        j jVar = this.f6811o;
        u uVar2 = iA == -1 ? null : new u(jVar.m(0, iA));
        int iA2 = T5.c.a(uVar);
        j jVar2 = uVar.f6811o;
        if (!AbstractC1209k.a(uVar2, iA2 != -1 ? new u(jVar2.m(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + uVar).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = uVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i7 = 0;
        while (i7 < iMin && AbstractC1209k.a(arrayListA.get(i7), arrayListA2.get(i7))) {
            i7++;
        }
        if (i7 == iMin && jVar.c() == jVar2.c()) {
            return N2.z.n(".");
        }
        if (arrayListA2.subList(i7, arrayListA2.size()).indexOf(T5.c.f6991e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + uVar).toString());
        }
        C0427g c0427g = new C0427g();
        j jVarC = T5.c.c(uVar);
        if (jVarC == null && (jVarC = T5.c.c(this)) == null) {
            jVarC = T5.c.f(f6810p);
        }
        int size = arrayListA2.size();
        for (int i8 = i7; i8 < size; i8++) {
            c0427g.B(T5.c.f6991e);
            c0427g.B(jVarC);
        }
        int size2 = arrayListA.size();
        while (i7 < size2) {
            c0427g.B((j) arrayListA.get(i7));
            c0427g.B(jVarC);
            i7++;
        }
        return T5.c.d(c0427g, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        AbstractC1209k.f(uVar, "other");
        return this.f6811o.compareTo(uVar.f6811o);
    }

    public final u d(String str) {
        AbstractC1209k.f(str, "child");
        C0427g c0427g = new C0427g();
        c0427g.G(str);
        return T5.c.b(this, T5.c.d(c0427g, false), false);
    }

    public final File e() {
        return new File(this.f6811o.p());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && AbstractC1209k.a(((u) obj).f6811o, this.f6811o);
    }

    public final Path f() {
        Path path = Paths.get(this.f6811o.p(), new String[0]);
        AbstractC1209k.e(path, "get(...)");
        return path;
    }

    public final Character g() {
        j jVar = T5.c.f6987a;
        j jVar2 = this.f6811o;
        if (j.f(jVar2, jVar) != -1 || jVar2.c() < 2 || jVar2.h(1) != 58) {
            return null;
        }
        char cH = (char) jVar2.h(0);
        if (('a' > cH || cH >= '{') && ('A' > cH || cH >= '[')) {
            return null;
        }
        return Character.valueOf(cH);
    }

    public final int hashCode() {
        return this.f6811o.hashCode();
    }

    public final String toString() {
        return this.f6811o.p();
    }
}
