package T5;

import N2.z;
import S5.C0427g;
import S5.j;
import S5.u;
import Z4.n;
import Z4.o;
import java.io.EOFException;
import java.util.ArrayList;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a */
    public static final j f6987a;

    /* JADX INFO: renamed from: b */
    public static final j f6988b;

    /* JADX INFO: renamed from: c */
    public static final j f6989c;

    /* JADX INFO: renamed from: d */
    public static final j f6990d;

    /* JADX INFO: renamed from: e */
    public static final j f6991e;

    static {
        j jVar = j.f6786r;
        f6987a = z.l("/");
        f6988b = z.l("\\");
        f6989c = z.l("/\\");
        f6990d = z.l(".");
        f6991e = z.l("..");
    }

    public static final int a(u uVar) {
        if (uVar.f6811o.c() != 0) {
            j jVar = uVar.f6811o;
            if (jVar.h(0) != 47) {
                if (jVar.h(0) == 92) {
                    if (jVar.c() > 2 && jVar.h(1) == 92) {
                        j jVar2 = f6988b;
                        AbstractC1209k.f(jVar2, "other");
                        int iE = jVar.e(2, jVar2.f6787o);
                        return iE == -1 ? jVar.c() : iE;
                    }
                } else if (jVar.c() > 2 && jVar.h(1) == 58 && jVar.h(2) == 92) {
                    char cH = (char) jVar.h(0);
                    if ('a' <= cH && cH < '{') {
                        return 3;
                    }
                    if ('A' <= cH && cH < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final u b(u uVar, u uVar2, boolean z6) {
        AbstractC1209k.f(uVar, "<this>");
        AbstractC1209k.f(uVar2, "child");
        if (a(uVar2) != -1 || uVar2.g() != null) {
            return uVar2;
        }
        j jVarC = c(uVar);
        if (jVarC == null && (jVarC = c(uVar2)) == null) {
            jVarC = f(u.f6810p);
        }
        C0427g c0427g = new C0427g();
        c0427g.B(uVar.f6811o);
        if (c0427g.f6785p > 0) {
            c0427g.B(jVarC);
        }
        c0427g.B(uVar2.f6811o);
        return d(c0427g, z6);
    }

    public static final j c(u uVar) {
        j jVar = uVar.f6811o;
        j jVar2 = f6987a;
        if (j.f(jVar, jVar2) != -1) {
            return jVar2;
        }
        j jVar3 = f6988b;
        if (j.f(uVar.f6811o, jVar3) != -1) {
            return jVar3;
        }
        return null;
    }

    public static final u d(C0427g c0427g, boolean z6) throws EOFException {
        j jVar;
        j jVar2;
        char cG;
        j jVar3;
        j jVarQ;
        C0427g c0427g2 = new C0427g();
        j jVarE = null;
        int i7 = 0;
        while (true) {
            if (!c0427g.i(f6987a)) {
                jVar = f6988b;
                if (!c0427g.i(jVar)) {
                    break;
                }
            }
            byte bN = c0427g.n();
            if (jVarE == null) {
                jVarE = e(bN);
            }
            i7++;
        }
        boolean z7 = i7 >= 2 && AbstractC1209k.a(jVarE, jVar);
        j jVar4 = f6989c;
        long j3 = 0;
        if (z7) {
            AbstractC1209k.c(jVarE);
            c0427g2.B(jVarE);
            c0427g2.B(jVarE);
        } else if (i7 > 0) {
            AbstractC1209k.c(jVarE);
            c0427g2.B(jVarE);
        } else {
            long jH = c0427g.h(jVar4);
            if (jVarE == null) {
                jVarE = jH == -1 ? f(u.f6810p) : e(c0427g.g(jH));
            }
            if (AbstractC1209k.a(jVarE, jVar)) {
                jVar2 = jVarE;
                if (c0427g.f6785p >= 2 && c0427g.g(1L) == 58 && (('a' <= (cG = (char) c0427g.g(0L)) && cG < '{') || ('A' <= cG && cG < '['))) {
                    if (jH == 2) {
                        c0427g2.e(3L, c0427g);
                    } else {
                        c0427g2.e(2L, c0427g);
                    }
                }
            } else {
                jVar2 = jVarE;
            }
            jVarE = jVar2;
        }
        boolean z8 = c0427g2.f6785p > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zD = c0427g.d();
            jVar3 = f6990d;
            if (zD) {
                break;
            }
            long j7 = j3;
            long jH2 = c0427g.h(jVar4);
            if (jH2 == -1) {
                jVarQ = c0427g.q(c0427g.f6785p);
            } else {
                jVarQ = c0427g.q(jH2);
                c0427g.n();
            }
            j jVar5 = f6991e;
            if (AbstractC1209k.a(jVarQ, jVar5)) {
                if (!z8 || !arrayList.isEmpty()) {
                    if (!z6 || (!z8 && (arrayList.isEmpty() || AbstractC1209k.a(n.x0(arrayList), jVar5)))) {
                        arrayList.add(jVarQ);
                    } else if ((!z7 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(o.d0(arrayList));
                    }
                }
            } else if (!AbstractC1209k.a(jVarQ, jVar3) && !AbstractC1209k.a(jVarQ, j.f6786r)) {
                arrayList.add(jVarQ);
            }
            j3 = j7;
        }
        long j8 = j3;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 > 0) {
                c0427g2.B(jVarE);
            }
            c0427g2.B((j) arrayList.get(i8));
        }
        if (c0427g2.f6785p == j8) {
            c0427g2.B(jVar3);
        }
        return new u(c0427g2.q(c0427g2.f6785p));
    }

    public static final j e(byte b7) {
        if (b7 == 47) {
            return f6987a;
        }
        if (b7 == 92) {
            return f6988b;
        }
        throw new IllegalArgumentException(n1.c.s(b7, "not a directory separator: "));
    }

    public static final j f(String str) {
        if (AbstractC1209k.a(str, "/")) {
            return f6987a;
        }
        if (AbstractC1209k.a(str, "\\")) {
            return f6988b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
