package v2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: renamed from: v2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1635b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f18237A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f18238B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f18239C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f18240D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f18241E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f18242F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f18243G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f18244H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f18245I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f18246J;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f18247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f18248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f18249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f18250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f18251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f18252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f18253x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f18254y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f18255z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f18256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f18257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f18258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f18259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18262g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f18264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f18265k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f18268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f18269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f18270q;

    static {
        new C1635b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i7 = t.f18881a;
        f18247r = Integer.toString(0, 36);
        f18248s = Integer.toString(17, 36);
        f18249t = Integer.toString(1, 36);
        f18250u = Integer.toString(2, 36);
        f18251v = Integer.toString(3, 36);
        f18252w = Integer.toString(18, 36);
        f18253x = Integer.toString(4, 36);
        f18254y = Integer.toString(5, 36);
        f18255z = Integer.toString(6, 36);
        f18237A = Integer.toString(7, 36);
        f18238B = Integer.toString(8, 36);
        f18239C = Integer.toString(9, 36);
        f18240D = Integer.toString(10, 36);
        f18241E = Integer.toString(11, 36);
        f18242F = Integer.toString(12, 36);
        f18243G = Integer.toString(13, 36);
        f18244H = Integer.toString(14, 36);
        f18245I = Integer.toString(15, 36);
        f18246J = Integer.toString(16, 36);
    }

    public C1635b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f7, int i7, int i8, float f8, int i9, int i10, float f9, float f10, float f11, boolean z6, int i11, int i12, float f12) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC1697a.d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f18256a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f18256a = charSequence.toString();
        } else {
            this.f18256a = null;
        }
        this.f18257b = alignment;
        this.f18258c = alignment2;
        this.f18259d = bitmap;
        this.f18260e = f7;
        this.f18261f = i7;
        this.f18262g = i8;
        this.h = f8;
        this.f18263i = i9;
        this.f18264j = f10;
        this.f18265k = f11;
        this.l = z6;
        this.f18266m = i11;
        this.f18267n = i10;
        this.f18268o = f9;
        this.f18269p = i12;
        this.f18270q = f12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [android.text.Spannable, android.text.SpannableString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v2.C1635b a(android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.C1635b.a(android.os.Bundle):v2.b");
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f18256a;
        if (charSequence != null) {
            bundle.putCharSequence(f18247r, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = AbstractC1637d.f18276a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f18281c, fVar.f18283a);
                    bundle2.putInt(f.f18282d, fVar.f18284b);
                    arrayList.add(AbstractC1637d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.f18285d, gVar.f18288a);
                    bundle3.putInt(g.f18286e, gVar.f18289b);
                    bundle3.putInt(g.f18287f, gVar.f18290c);
                    arrayList.add(AbstractC1637d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(AbstractC1637d.a(spanned, eVar, 3, null));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f18248s, arrayList);
                }
            }
        }
        bundle.putSerializable(f18249t, this.f18257b);
        bundle.putSerializable(f18250u, this.f18258c);
        bundle.putFloat(f18253x, this.f18260e);
        bundle.putInt(f18254y, this.f18261f);
        bundle.putInt(f18255z, this.f18262g);
        bundle.putFloat(f18237A, this.h);
        bundle.putInt(f18238B, this.f18263i);
        bundle.putInt(f18239C, this.f18267n);
        bundle.putFloat(f18240D, this.f18268o);
        bundle.putFloat(f18241E, this.f18264j);
        bundle.putFloat(f18242F, this.f18265k);
        bundle.putBoolean(f18244H, this.l);
        bundle.putInt(f18243G, this.f18266m);
        bundle.putInt(f18245I, this.f18269p);
        bundle.putFloat(f18246J, this.f18270q);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1635b.class == obj.getClass()) {
            C1635b c1635b = (C1635b) obj;
            if (TextUtils.equals(this.f18256a, c1635b.f18256a) && this.f18257b == c1635b.f18257b && this.f18258c == c1635b.f18258c) {
                Bitmap bitmap = c1635b.f18259d;
                Bitmap bitmap2 = this.f18259d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f18260e == c1635b.f18260e && this.f18261f == c1635b.f18261f && this.f18262g == c1635b.f18262g && this.h == c1635b.h && this.f18263i == c1635b.f18263i && this.f18264j == c1635b.f18264j && this.f18265k == c1635b.f18265k && this.l == c1635b.l && this.f18266m == c1635b.f18266m && this.f18267n == c1635b.f18267n && this.f18268o == c1635b.f18268o && this.f18269p == c1635b.f18269p && this.f18270q == c1635b.f18270q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18256a, this.f18257b, this.f18258c, this.f18259d, Float.valueOf(this.f18260e), Integer.valueOf(this.f18261f), Integer.valueOf(this.f18262g), Float.valueOf(this.h), Integer.valueOf(this.f18263i), Float.valueOf(this.f18264j), Float.valueOf(this.f18265k), Boolean.valueOf(this.l), Integer.valueOf(this.f18266m), Integer.valueOf(this.f18267n), Float.valueOf(this.f18268o), Integer.valueOf(this.f18269p), Float.valueOf(this.f18270q)});
    }
}
