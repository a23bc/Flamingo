package A2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import t2.C1487p;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: A2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0013n extends t2.P {

    /* JADX INFO: renamed from: E */
    public static final String f363E;

    /* JADX INFO: renamed from: F */
    public static final String f364F;

    /* JADX INFO: renamed from: G */
    public static final String f365G;

    /* JADX INFO: renamed from: H */
    public static final String f366H;

    /* JADX INFO: renamed from: I */
    public static final String f367I;

    /* JADX INFO: renamed from: J */
    public static final String f368J;

    /* JADX INFO: renamed from: A */
    public final C1487p f369A;

    /* JADX INFO: renamed from: B */
    public final int f370B;

    /* JADX INFO: renamed from: C */
    public final H2.A f371C;

    /* JADX INFO: renamed from: D */
    public final boolean f372D;

    /* JADX INFO: renamed from: x */
    public final int f373x;

    /* JADX INFO: renamed from: y */
    public final String f374y;

    /* JADX INFO: renamed from: z */
    public final int f375z;

    static {
        int i7 = w2.t.f18881a;
        f363E = Integer.toString(1001, 36);
        f364F = Integer.toString(1002, 36);
        f365G = Integer.toString(1003, 36);
        f366H = Integer.toString(1004, 36);
        f367I = Integer.toString(1005, 36);
        f368J = Integer.toString(1006, 36);
    }

    public C0013n(int i7, Exception exc, int i8) {
        this(i7, exc, i8, null, -1, null, 4, false);
    }

    @Override // t2.P
    public final boolean a(t2.P p7) {
        if (!super.a(p7)) {
            return false;
        }
        int i7 = w2.t.f18881a;
        C0013n c0013n = (C0013n) p7;
        return this.f373x == c0013n.f373x && w2.t.a(this.f374y, c0013n.f374y) && this.f375z == c0013n.f375z && w2.t.a(this.f369A, c0013n.f369A) && this.f370B == c0013n.f370B && w2.t.a(this.f371C, c0013n.f371C) && this.f372D == c0013n.f372D;
    }

    @Override // t2.P
    public final Bundle b() {
        Bundle bundleB = super.b();
        bundleB.putInt(f363E, this.f373x);
        bundleB.putString(f364F, this.f374y);
        bundleB.putInt(f365G, this.f375z);
        C1487p c1487p = this.f369A;
        if (c1487p != null) {
            bundleB.putBundle(f366H, c1487p.c(false));
        }
        bundleB.putInt(f367I, this.f370B);
        bundleB.putBoolean(f368J, this.f372D);
        return bundleB;
    }

    public final C0013n c(H2.A a4) {
        String message = getMessage();
        int i7 = w2.t.f18881a;
        return new C0013n(message, getCause(), this.f16342o, this.f373x, this.f374y, this.f375z, this.f369A, this.f370B, a4, this.f16343p, this.f372D);
    }

    public C0013n(String str, Throwable th, int i7, int i8, String str2, int i9, C1487p c1487p, int i10, H2.A a4, long j3, boolean z6) {
        super(str, th, i7, Bundle.EMPTY, j3);
        AbstractC1697a.d(!z6 || i8 == 1);
        AbstractC1697a.d(th != null || i8 == 3);
        this.f373x = i8;
        this.f374y = str2;
        this.f375z = i9;
        this.f369A = c1487p;
        this.f370B = i10;
        this.f371C = a4;
        this.f372D = z6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0013n(int i7, Throwable th, int i8, String str, int i9, C1487p c1487p, int i10, boolean z6) {
        String str2;
        int i11;
        C1487p c1487p2;
        String string;
        String str3;
        if (i7 == 0) {
            str2 = str;
            i11 = i9;
            c1487p2 = c1487p;
            string = "Source error";
        } else if (i7 != 1) {
            if (i7 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i11 = i9;
            c1487p2 = c1487p;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i11 = i9;
            sb.append(i11);
            sb.append(", format=");
            c1487p2 = c1487p;
            sb.append(c1487p2);
            sb.append(", format_supported=");
            int i12 = w2.t.f18881a;
            if (i10 == 0) {
                str3 = "NO";
            } else if (i10 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i10 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i10 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i10 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : n1.c.t(string, ": null"), th, i8, i7, str2, i11, c1487p2, i10, null, SystemClock.elapsedRealtime(), z6);
    }
}
