package r3;

import D4.d;
import E4.G;
import E4.I;
import E4.b0;
import Z1.l;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
import k3.C1145a;
import k3.m;
import v2.C1635b;
import w2.AbstractC1697a;
import w2.c;
import w2.t;

/* JADX INFO: renamed from: r3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1416a implements m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w2.m f15765o = new w2.m();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f15766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f15769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f15770t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f15771u;

    public C1416a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f15767q = 0;
            this.f15768r = -1;
            this.f15769s = "sans-serif";
            this.f15766p = false;
            this.f15770t = 0.85f;
            this.f15771u = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f15767q = bArr[24];
        this.f15768r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f15769s = "Serif".equals(new String(bArr, 43, bArr.length - 43, d.f1569c)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f15771u = i7;
        boolean z6 = (bArr[0] & 32) != 0;
        this.f15766p = z6;
        if (z6) {
            this.f15770t = t.f(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
        } else {
            this.f15770t = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            int i12 = i11 | 33;
            boolean z6 = (i7 & 1) != 0;
            boolean z7 = (i7 & 2) != 0;
            if (z6) {
                if (z7) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                }
            } else if (z7) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
            }
            boolean z8 = (i7 & 4) != 0;
            if (z8) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            }
            if (z8 || z6 || z7) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
        }
    }

    @Override // k3.m
    public final /* synthetic */ void d() {
    }

    @Override // k3.m
    public final /* synthetic */ k3.d i(byte[] bArr, int i7, int i8) {
        return l.e(this, bArr, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k3.m
    public final void l(byte[] bArr, int i7, int i8, k3.l lVar, c cVar) {
        String strS;
        int i9;
        int i10;
        int i11 = 1;
        w2.m mVar = this.f15765o;
        mVar.E(i7 + i8, bArr);
        mVar.G(i7);
        int i12 = 0;
        AbstractC1697a.d(mVar.a() >= 2);
        int iA = mVar.A();
        if (iA == 0) {
            strS = "";
        } else {
            int i13 = mVar.f18868b;
            Charset charsetC = mVar.C();
            int i14 = iA - (mVar.f18868b - i13);
            if (charsetC == null) {
                charsetC = d.f1569c;
            }
            strS = mVar.s(i14, charsetC);
        }
        if (strS.isEmpty()) {
            G g6 = I.f1870p;
            cVar.c(new C1145a(b0.f1913s, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        b(spannableStringBuilder, this.f15767q, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f15768r, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f15769s;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f7 = this.f15770t;
        while (mVar.a() >= 8) {
            int i15 = mVar.f18868b;
            int iG = mVar.g();
            int iG2 = mVar.g();
            if (iG2 == 1937013100) {
                AbstractC1697a.d(mVar.a() >= 2 ? i11 : i12);
                int iA2 = mVar.A();
                int i16 = i12;
                while (i16 < iA2) {
                    AbstractC1697a.d(mVar.a() >= 12 ? i11 : i12);
                    int iA3 = mVar.A();
                    int iA4 = mVar.A();
                    mVar.H(2);
                    int i17 = i16;
                    int iU = mVar.u();
                    mVar.H(i11);
                    int iG3 = mVar.g();
                    int i18 = i11;
                    if (iA4 > spannableStringBuilder.length()) {
                        StringBuilder sbV = n1.c.v(iA4, "Truncating styl end (", ") to cueText.length() (");
                        sbV.append(spannableStringBuilder.length());
                        sbV.append(").");
                        AbstractC1697a.w(sbV.toString());
                        iA4 = spannableStringBuilder.length();
                    }
                    if (iA3 >= iA4) {
                        AbstractC1697a.w("Ignoring styl with start (" + iA3 + ") >= end (" + iA4 + ").");
                        i10 = i17;
                    } else {
                        i10 = i17;
                        int i19 = iA4;
                        b(spannableStringBuilder, iU, this.f15767q, iA3, i19, 0);
                        a(spannableStringBuilder, iG3, this.f15768r, iA3, i19, 0);
                    }
                    i16 = i10 + 1;
                    i11 = i18;
                    i12 = 0;
                }
                i9 = i11;
            } else {
                i9 = i11;
                if (iG2 == 1952608120 && this.f15766p) {
                    AbstractC1697a.d(mVar.a() >= 2 ? i9 : 0);
                    f7 = t.f(mVar.A() / this.f15771u, 0.0f, 0.95f);
                }
            }
            mVar.G(i15 + iG);
            i11 = i9;
            i12 = 0;
        }
        cVar.c(new C1145a(I.t(new C1635b(spannableStringBuilder, null, null, null, f7, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // k3.m
    public final /* synthetic */ void r(byte[] bArr, k3.l lVar, A2.I i7) {
        l.d(this, bArr, lVar, i7);
    }

    @Override // k3.m
    public final int s() {
        return 2;
    }
}
