package G1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: G1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0137d implements InterfaceC0136c, InterfaceC0138e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f2692o;

    /* JADX INFO: renamed from: p */
    public Object f2693p;

    /* JADX INFO: renamed from: q */
    public int f2694q;

    /* JADX INFO: renamed from: r */
    public int f2695r;

    /* JADX INFO: renamed from: s */
    public Object f2696s;

    /* JADX INFO: renamed from: t */
    public Cloneable f2697t;

    public /* synthetic */ C0137d(int i7) {
        this.f2692o = i7;
    }

    @Override // G1.InterfaceC0136c
    public C0139f a() {
        return new C0139f(new C0137d(this));
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.lang.Cloneable] */
    public int b(long j3) {
        int i7 = this.f2694q + 1;
        long[] jArr = (long[]) this.f2693p;
        int length = jArr.length;
        if (i7 > length) {
            int i8 = length * 2;
            long[] jArr2 = new long[i8];
            int[] iArr = new int[i8];
            Z4.l.Y(jArr, jArr2, 0, 0, jArr.length);
            Z4.l.Z(0, 0, 14, (int[]) this.f2696s, iArr);
            this.f2693p = jArr2;
            this.f2696s = iArr;
        }
        int i9 = this.f2694q;
        this.f2694q = i9 + 1;
        int length2 = ((int[]) this.f2697t).length;
        if (this.f2695r >= length2) {
            int i10 = length2 * 2;
            ?? r22 = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                r22[i11] = i12;
                i11 = i12;
            }
            Z4.l.Z(0, 0, 14, (int[]) this.f2697t, r22);
            this.f2697t = r22;
        }
        int i13 = this.f2695r;
        int[] iArr2 = (int[]) this.f2697t;
        this.f2695r = iArr2[i13];
        long[] jArr3 = (long[]) this.f2693p;
        jArr3[i9] = j3;
        ((int[]) this.f2696s)[i9] = i13;
        iArr2[i13] = i9;
        while (i9 > 0) {
            int i14 = ((i9 + 1) >> 1) - 1;
            if (AbstractC1209k.h(jArr3[i14], j3) <= 0) {
                break;
            }
            c(i14, i9);
            i9 = i14;
        }
        return i13;
    }

    public void c(int i7, int i8) {
        long[] jArr = (long[]) this.f2693p;
        int[] iArr = (int[]) this.f2696s;
        int[] iArr2 = (int[]) this.f2697t;
        long j3 = jArr[i7];
        jArr[i7] = jArr[i8];
        jArr[i8] = j3;
        int i9 = iArr[i7];
        int i10 = iArr[i8];
        iArr[i7] = i10;
        iArr[i8] = i9;
        iArr2[i10] = i7;
        iArr2[i9] = i8;
    }

    @Override // G1.InterfaceC0136c
    public void f(Bundle bundle) {
        this.f2697t = bundle;
    }

    @Override // G1.InterfaceC0136c
    public void h(Uri uri) {
        this.f2696s = uri;
    }

    @Override // G1.InterfaceC0136c
    public void i(int i7) {
        this.f2695r = i7;
    }

    @Override // G1.InterfaceC0138e
    public int j() {
        return this.f2695r;
    }

    @Override // G1.InterfaceC0138e
    public ClipData k() {
        return (ClipData) this.f2693p;
    }

    @Override // G1.InterfaceC0138e
    public ContentInfo l() {
        return null;
    }

    @Override // G1.InterfaceC0138e
    public int m() {
        return this.f2694q;
    }

    public String toString() {
        String str;
        switch (this.f2692o) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f2693p).getDescription());
                sb.append(", source=");
                int i7 = this.f2694q;
                sb.append(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i8 = this.f2695r;
                sb.append((i8 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i8));
                Uri uri = (Uri) this.f2696s;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return Z1.l.t(sb, ((Bundle) this.f2697t) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0137d(C0137d c0137d) {
        this.f2692o = 1;
        ClipData clipData = (ClipData) c0137d.f2693p;
        clipData.getClass();
        this.f2693p = clipData;
        int i7 = c0137d.f2694q;
        if (i7 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i7 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f2694q = i7;
        int i8 = c0137d.f2695r;
        if ((i8 & 1) == i8) {
            this.f2695r = i8;
            this.f2696s = (Uri) c0137d.f2696s;
            this.f2697t = (Bundle) c0137d.f2697t;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i8) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
