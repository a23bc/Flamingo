package o3;

import android.text.TextUtils;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: o3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1261a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14665e;

    public C1261a(int i7, int i8, int i9, int i10, int i11) {
        this.f14661a = i7;
        this.f14662b = i8;
        this.f14663c = i9;
        this.f14664d = i10;
        this.f14665e = i11;
    }

    public static C1261a a(String str) {
        AbstractC1697a.d(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            String strV = I0.c.V(strArrSplit[i11].trim());
            strV.getClass();
            switch (strV) {
                case "end":
                    i8 = i11;
                    break;
                case "text":
                    i10 = i11;
                    break;
                case "start":
                    i7 = i11;
                    break;
                case "style":
                    i9 = i11;
                    break;
            }
        }
        if (i7 == -1 || i8 == -1 || i10 == -1) {
            return null;
        }
        return new C1261a(i7, i8, i9, i10, strArrSplit.length);
    }
}
