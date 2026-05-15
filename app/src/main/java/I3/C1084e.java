package i3;

import N2.C0293j;
import java.io.EOFException;
import w2.AbstractC1697a;
import w2.m;

/* JADX INFO: renamed from: i3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1084e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1085f f13468a = new C1085f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f13469b = new m(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13470c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13472e;

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        this.f13471d = 0;
        do {
            int i10 = this.f13471d;
            int i11 = i7 + i10;
            C1085f c1085f = this.f13468a;
            if (i11 >= c1085f.f13475c) {
                break;
            }
            int[] iArr = c1085f.f13478f;
            this.f13471d = i10 + 1;
            i8 = iArr[i10 + i7];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public final boolean b(C0293j c0293j) {
        int i7;
        AbstractC1697a.i(c0293j != null);
        boolean z6 = this.f13472e;
        m mVar = this.f13469b;
        if (z6) {
            this.f13472e = false;
            mVar.D(0);
        }
        while (!this.f13472e) {
            int i8 = this.f13470c;
            C1085f c1085f = this.f13468a;
            if (i8 < 0) {
                if (c1085f.b(c0293j, -1L) && c1085f.a(c0293j, true)) {
                    int iA = c1085f.f13476d;
                    if ((c1085f.f13473a & 1) == 1 && mVar.f18869c == 0) {
                        iA += a(0);
                        i7 = this.f13471d;
                    } else {
                        i7 = 0;
                    }
                    try {
                        c0293j.g(iA);
                        this.f13470c = i7;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f13470c);
            int i9 = this.f13470c + this.f13471d;
            if (iA2 > 0) {
                mVar.b(mVar.f18869c + iA2);
                c0293j.b(mVar.f18867a, mVar.f18869c, iA2, false);
                mVar.F(mVar.f18869c + iA2);
                this.f13472e = c1085f.f13478f[i9 + (-1)] != 255;
            }
            if (i9 == c1085f.f13475c) {
                i9 = -1;
            }
            this.f13470c = i9;
        }
        return true;
    }
}
