package s4;

import A2.W;
import android.content.Context;
import android.graphics.drawable.Drawable;
import p4.C1296b;
import q4.C1379c;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a */
    public static final C1296b f15918a = new C1296b();

    public static final boolean a(p4.h hVar) {
        int iOrdinal = hVar.f15059g.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return hVar.f15051E.f15015a == null && (hVar.f15074x instanceof C1379c);
        }
        throw new W();
    }

    public static final Drawable b(p4.h hVar, Integer num) {
        if (num == null || num.intValue() == 0) {
            return null;
        }
        Context context = hVar.f15053a;
        int iIntValue = num.intValue();
        Drawable drawableV = i6.g.v(context, iIntValue);
        if (drawableV != null) {
            return drawableV;
        }
        throw new IllegalStateException(n1.c.s(iIntValue, "Invalid resource ID: ").toString());
    }
}
