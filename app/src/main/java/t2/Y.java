package t2;

import android.os.Bundle;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16371a;

    static {
        int i7 = w2.t.f18881a;
        f16371a = Integer.toString(0, 36);
    }

    public static Y a(Bundle bundle) {
        String str = f16371a;
        int i7 = bundle.getInt(str, -1);
        if (i7 == 0) {
            String str2 = r.f16721d;
            AbstractC1697a.d(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(r.f16721d, false) ? new r(bundle.getBoolean(r.f16722e, false)) : new r();
        }
        if (i7 == 1) {
            String str3 = O.f16334c;
            AbstractC1697a.d(bundle.getInt(str, -1) == 1);
            float f7 = bundle.getFloat(O.f16334c, -1.0f);
            return f7 == -1.0f ? new O() : new O(f7);
        }
        if (i7 != 2) {
            if (i7 != 3) {
                throw new IllegalArgumentException(n1.c.s(i7, "Unknown RatingType: "));
            }
            String str4 = b0.f16408d;
            AbstractC1697a.d(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(b0.f16408d, false) ? new b0(bundle.getBoolean(b0.f16409e, false)) : new b0();
        }
        String str5 = Z.f16372d;
        AbstractC1697a.d(bundle.getInt(str, -1) == 2);
        int i8 = bundle.getInt(Z.f16372d, 5);
        float f8 = bundle.getFloat(Z.f16373e, -1.0f);
        return f8 == -1.0f ? new Z(i8) : new Z(i8, f8);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
