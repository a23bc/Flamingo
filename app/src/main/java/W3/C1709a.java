package w3;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: w3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1709a {

    /* JADX INFO: renamed from: i */
    public static final String f19116i;

    /* JADX INFO: renamed from: j */
    public static final String f19117j;

    /* JADX INFO: renamed from: k */
    public static final String f19118k;
    public static final String l;

    /* JADX INFO: renamed from: m */
    public static final String f19119m;

    /* JADX INFO: renamed from: n */
    public static final String f19120n;

    /* JADX INFO: renamed from: o */
    public static final String f19121o;

    /* JADX INFO: renamed from: p */
    public static final String f19122p;

    /* JADX INFO: renamed from: a */
    public final v1 f19123a;

    /* JADX INFO: renamed from: b */
    public final int f19124b;

    /* JADX INFO: renamed from: c */
    public final int f19125c;

    /* JADX INFO: renamed from: d */
    public final int f19126d;

    /* JADX INFO: renamed from: e */
    public final Uri f19127e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f19128f;

    /* JADX INFO: renamed from: g */
    public final Bundle f19129g;
    public final boolean h;

    static {
        int i7 = w2.t.f18881a;
        f19116i = Integer.toString(0, 36);
        f19117j = Integer.toString(1, 36);
        f19118k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        f19119m = Integer.toString(4, 36);
        f19120n = Integer.toString(5, 36);
        f19121o = Integer.toString(6, 36);
        f19122p = Integer.toString(7, 36);
    }

    public C1709a(v1 v1Var, int i7, int i8, int i9, Uri uri, CharSequence charSequence, Bundle bundle, boolean z6) {
        this.f19123a = v1Var;
        this.f19124b = i7;
        this.f19125c = i8;
        this.f19126d = i9;
        this.f19127e = uri;
        this.f19128f = charSequence;
        this.f19129g = new Bundle(bundle);
        this.h = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static E4.b0 a(java.util.List r13, w3.w1 r14, t2.T r15) {
        /*
            E4.F r0 = new E4.F
            r1 = 4
            r0.<init>(r1)
            r1 = 0
        L7:
            int r2 = r13.size()
            if (r1 >= r2) goto L56
            java.lang.Object r2 = r13.get(r1)
            w3.a r2 = (w3.C1709a) r2
            w3.v1 r3 = r2.f19123a
            if (r3 == 0) goto L22
            r14.getClass()
            E4.M r4 = r14.f19387a
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L2d
        L22:
            r3 = -1
            int r4 = r2.f19124b
            if (r4 == r3) goto L31
            boolean r3 = r15.a(r4)
            if (r3 == 0) goto L31
        L2d:
            r0.a(r2)
            goto L53
        L31:
            boolean r3 = r2.h
            if (r3 != 0) goto L36
            goto L50
        L36:
            w3.a r4 = new w3.a
            android.os.Bundle r11 = new android.os.Bundle
            android.os.Bundle r3 = r2.f19129g
            r11.<init>(r3)
            int r8 = r2.f19126d
            r12 = 0
            w3.v1 r5 = r2.f19123a
            int r6 = r2.f19124b
            int r7 = r2.f19125c
            android.net.Uri r9 = r2.f19127e
            java.lang.CharSequence r10 = r2.f19128f
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r4
        L50:
            r0.a(r2)
        L53:
            int r1 = r1 + 1
            goto L7
        L56:
            E4.b0 r13 = r0.f()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C1709a.a(java.util.List, w3.w1, t2.T):E4.b0");
    }

    public static C1709a b(int i7, Bundle bundle) {
        int i8;
        Bundle bundle2 = bundle.getBundle(f19116i);
        v1 v1VarA = bundle2 == null ? null : v1.a(bundle2);
        int i9 = bundle.getInt(f19117j, -1);
        int i10 = bundle.getInt(f19118k, 0);
        CharSequence charSequence = bundle.getCharSequence(l, "");
        Bundle bundle3 = bundle.getBundle(f19119m);
        boolean z6 = i7 < 3 || bundle.getBoolean(f19120n, true);
        Uri uri = (Uri) bundle.getParcelable(f19121o);
        int i11 = bundle.getInt(f19122p, 0);
        Bundle bundle4 = Bundle.EMPTY;
        if (v1VarA == null) {
            v1VarA = null;
        }
        if (i9 != -1) {
            AbstractC1697a.c("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", v1VarA == null);
            i8 = i9;
        } else {
            i8 = -1;
        }
        Uri uri2 = uri != null ? uri : null;
        if (bundle3 == null) {
            bundle3 = bundle4;
        }
        Bundle bundle5 = new Bundle(bundle3);
        AbstractC1697a.h("Exactly one of sessionCommand and playerCommand should be set", (v1VarA == null) != (i8 == -1));
        return new C1709a(v1VarA, i8, i11, i10, uri2, charSequence, bundle5, z6);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        v1 v1Var = this.f19123a;
        if (v1Var != null) {
            bundle.putBundle(f19116i, v1Var.b());
        }
        int i7 = this.f19124b;
        if (i7 != -1) {
            bundle.putInt(f19117j, i7);
        }
        int i8 = this.f19125c;
        if (i8 != 0) {
            bundle.putInt(f19122p, i8);
        }
        int i9 = this.f19126d;
        if (i9 != 0) {
            bundle.putInt(f19118k, i9);
        }
        CharSequence charSequence = this.f19128f;
        if (charSequence != "") {
            bundle.putCharSequence(l, charSequence);
        }
        Bundle bundle2 = this.f19129g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f19119m, bundle2);
        }
        Uri uri = this.f19127e;
        if (uri != null) {
            bundle.putParcelable(f19121o, uri);
        }
        boolean z6 = this.h;
        if (!z6) {
            bundle.putBoolean(f19120n, z6);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1709a)) {
            return false;
        }
        C1709a c1709a = (C1709a) obj;
        return M3.a.L(this.f19123a, c1709a.f19123a) && this.f19124b == c1709a.f19124b && this.f19125c == c1709a.f19125c && this.f19126d == c1709a.f19126d && M3.a.L(this.f19127e, c1709a.f19127e) && TextUtils.equals(this.f19128f, c1709a.f19128f) && this.h == c1709a.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19123a, Integer.valueOf(this.f19124b), Integer.valueOf(this.f19125c), Integer.valueOf(this.f19126d), this.f19128f, Boolean.valueOf(this.h), this.f19127e});
    }
}
