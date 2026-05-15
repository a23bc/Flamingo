package E0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: E0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0093d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1720g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f1721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f1722j;

    public C0093d(String str, float f7, float f8, float f9, float f10, float f11, float f12, float f13, List list, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        f7 = (i7 & 2) != 0 ? 0.0f : f7;
        f8 = (i7 & 4) != 0 ? 0.0f : f8;
        f9 = (i7 & 8) != 0 ? 0.0f : f9;
        f10 = (i7 & 16) != 0 ? 1.0f : f10;
        f11 = (i7 & 32) != 0 ? 1.0f : f11;
        f12 = (i7 & 64) != 0 ? 0.0f : f12;
        f13 = (i7 & 128) != 0 ? 0.0f : f13;
        if ((i7 & 256) != 0) {
            int i8 = I.f1667a;
            list = Z4.v.f8818o;
        }
        ArrayList arrayList = new ArrayList();
        this.f1714a = str;
        this.f1715b = f7;
        this.f1716c = f8;
        this.f1717d = f9;
        this.f1718e = f10;
        this.f1719f = f11;
        this.f1720g = f12;
        this.h = f13;
        this.f1721i = list;
        this.f1722j = arrayList;
    }
}
