package v2;

import android.os.Bundle;
import android.text.Spanned;
import w2.t;

/* JADX INFO: renamed from: v2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1637d {

    /* JADX INFO: renamed from: a */
    public static final String f18276a;

    /* JADX INFO: renamed from: b */
    public static final String f18277b;

    /* JADX INFO: renamed from: c */
    public static final String f18278c;

    /* JADX INFO: renamed from: d */
    public static final String f18279d;

    /* JADX INFO: renamed from: e */
    public static final String f18280e;

    static {
        int i7 = t.f18881a;
        f18276a = Integer.toString(0, 36);
        f18277b = Integer.toString(1, 36);
        f18278c = Integer.toString(2, 36);
        f18279d = Integer.toString(3, 36);
        f18280e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f18276a, spanned.getSpanStart(obj));
        bundle2.putInt(f18277b, spanned.getSpanEnd(obj));
        bundle2.putInt(f18278c, spanned.getSpanFlags(obj));
        bundle2.putInt(f18279d, i7);
        if (bundle != null) {
            bundle2.putBundle(f18280e, bundle);
        }
        return bundle2;
    }
}
