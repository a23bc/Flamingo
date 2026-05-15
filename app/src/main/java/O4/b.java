package o4;

import E0.C0096g;
import F5.m;
import F5.v;
import S5.w;
import S5.y;
import Y4.f;
import a.AbstractC0509a;
import android.graphics.Bitmap;
import java.io.EOFException;
import m5.AbstractC1209k;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f14703f;

    public b(y yVar) throws EOFException {
        f fVar = f.f8724p;
        this.f14698a = AbstractC0509a.N(fVar, new C1266a(this, 0));
        this.f14699b = AbstractC0509a.N(fVar, new C1266a(this, 1));
        this.f14700c = Long.parseLong(yVar.s(Long.MAX_VALUE));
        this.f14701d = Long.parseLong(yVar.s(Long.MAX_VALUE));
        this.f14702e = Integer.parseInt(yVar.s(Long.MAX_VALUE)) > 0;
        int i7 = Integer.parseInt(yVar.s(Long.MAX_VALUE));
        C0096g c0096g = new C0096g(1);
        for (int i8 = 0; i8 < i7; i8++) {
            String strS = yVar.s(Long.MAX_VALUE);
            Bitmap.Config config = s4.e.f15919a;
            int iW = AbstractC1545g.W(strS, ':', 0, 6);
            if (iW == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strS).toString());
            }
            String strSubstring = strS.substring(0, iW);
            AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = AbstractC1545g.u0(strSubstring).toString();
            String strSubstring2 = strS.substring(iW + 1);
            AbstractC1209k.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            c0096g.g(string, strSubstring2);
        }
        this.f14703f = c0096g.h();
    }

    public final void a(w wVar) {
        wVar.c(this.f14700c);
        wVar.m(10);
        wVar.c(this.f14701d);
        wVar.m(10);
        wVar.c(this.f14702e ? 1L : 0L);
        wVar.m(10);
        m mVar = this.f14703f;
        wVar.c(mVar.size());
        wVar.m(10);
        int size = mVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            wVar.v(mVar.e(i7));
            wVar.v(": ");
            wVar.v(mVar.i(i7));
            wVar.m(10);
        }
    }

    public b(v vVar) {
        f fVar = f.f8724p;
        this.f14698a = AbstractC0509a.N(fVar, new C1266a(this, 0));
        this.f14699b = AbstractC0509a.N(fVar, new C1266a(this, 1));
        this.f14700c = vVar.f2469y;
        this.f14701d = vVar.f2470z;
        this.f14702e = vVar.f2463s != null;
        this.f14703f = vVar.f2464t;
    }
}
