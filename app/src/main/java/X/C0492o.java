package X;

import b1.C0613I;
import b1.C0622g;
import b1.C0630o;

/* JADX INFO: renamed from: X.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0492o {

    /* JADX INFO: renamed from: a */
    public final long f8115a;

    /* JADX INFO: renamed from: b */
    public final W.g f8116b;

    /* JADX INFO: renamed from: c */
    public final W.g f8117c;

    /* JADX INFO: renamed from: e */
    public C0613I f8119e;

    /* JADX INFO: renamed from: d */
    public final C0492o f8118d = this;

    /* JADX INFO: renamed from: f */
    public int f8120f = -1;

    public C0492o(long j3, W.g gVar, W.g gVar2) {
        this.f8115a = j3;
        this.f8116b = gVar;
        this.f8117c = gVar2;
    }

    public final long a(E e7, boolean z6) {
        C0613I c0613i;
        D d4 = e7.f7891a;
        long j3 = this.f8115a;
        if (z6 && d4.f7889c != j3) {
            return 9205357640488583168L;
        }
        D d7 = e7.f7892b;
        if ((!z6 && d7.f7889c != j3) || c() == null || (c0613i = (C0613I) this.f8117c.a()) == null) {
            return 9205357640488583168L;
        }
        return AbstractC0498r0.t(c0613i, i6.h.q(z6 ? d4.f7888b : d7.f7888b, 0, b(c0613i)), z6, e7.f7893c);
    }

    public final int b(C0613I c0613i) {
        int i7;
        synchronized (this.f8118d) {
            try {
                if (this.f8119e != c0613i) {
                    C0630o c0630o = c0613i.f9930b;
                    boolean z6 = c0630o.f9989c;
                    int i8 = 0;
                    if (!(z6 || ((float) ((int) (c0613i.f9931c & 4294967295L))) < c0630o.f9991e) || z6) {
                        i8 = c0630o.f9992f - 1;
                    } else {
                        int iE = c0630o.e((int) (c0613i.f9931c & 4294967295L));
                        int i9 = c0613i.f9930b.f9992f - 1;
                        if (iE > i9) {
                            iE = i9;
                        }
                        while (iE >= 0 && c0613i.f9930b.f(iE) >= ((int) (c0613i.f9931c & 4294967295L))) {
                            iE--;
                        }
                        if (iE >= 0) {
                            i8 = iE;
                        }
                    }
                    this.f8120f = c0613i.f9930b.c(i8, true);
                    this.f8119e = c0613i;
                }
                i7 = this.f8120f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i7;
    }

    public final O0.C c() {
        O0.C c7 = (O0.C) this.f8116b.a();
        if (c7 == null || !c7.y()) {
            return null;
        }
        return c7;
    }

    public final C0622g d() {
        C0613I c0613i = (C0613I) this.f8117c.a();
        return c0613i == null ? new C0622g("") : c0613i.f9929a.f9920a;
    }
}
