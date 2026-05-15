package p4;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f15079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4.h f15080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q4.g f15081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15084g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F5.m f15085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f15086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f15087k;
    public final EnumC1295a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final EnumC1295a f15088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final EnumC1295a f15089n;

    public l(Context context, Bitmap.Config config, q4.h hVar, q4.g gVar, boolean z6, boolean z7, boolean z8, String str, F5.m mVar, o oVar, m mVar2, EnumC1295a enumC1295a, EnumC1295a enumC1295a2, EnumC1295a enumC1295a3) {
        this.f15078a = context;
        this.f15079b = config;
        this.f15080c = hVar;
        this.f15081d = gVar;
        this.f15082e = z6;
        this.f15083f = z7;
        this.f15084g = z8;
        this.h = str;
        this.f15085i = mVar;
        this.f15086j = oVar;
        this.f15087k = mVar2;
        this.l = enumC1295a;
        this.f15088m = enumC1295a2;
        this.f15089n = enumC1295a3;
    }

    public static l a(l lVar) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Context context = lVar.f15078a;
        lVar.getClass();
        q4.h hVar = lVar.f15080c;
        q4.g gVar = lVar.f15081d;
        boolean z6 = lVar.f15082e;
        boolean z7 = lVar.f15083f;
        boolean z8 = lVar.f15084g;
        String str = lVar.h;
        F5.m mVar = lVar.f15085i;
        o oVar = lVar.f15086j;
        m mVar2 = lVar.f15087k;
        EnumC1295a enumC1295a = lVar.l;
        EnumC1295a enumC1295a2 = lVar.f15088m;
        EnumC1295a enumC1295a3 = lVar.f15089n;
        lVar.getClass();
        return new l(context, config, hVar, gVar, z6, z7, z8, str, mVar, oVar, mVar2, enumC1295a, enumC1295a2, enumC1295a3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC1209k.a(this.f15078a, lVar.f15078a) && this.f15079b == lVar.f15079b && AbstractC1209k.a(this.f15080c, lVar.f15080c) && this.f15081d == lVar.f15081d && this.f15082e == lVar.f15082e && this.f15083f == lVar.f15083f && this.f15084g == lVar.f15084g && AbstractC1209k.a(this.h, lVar.h) && AbstractC1209k.a(this.f15085i, lVar.f15085i) && this.f15086j.equals(lVar.f15086j) && this.f15087k.equals(lVar.f15087k) && this.l == lVar.l && this.f15088m == lVar.f15088m && this.f15089n == lVar.f15089n;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f15081d.hashCode() + ((this.f15080c.hashCode() + ((this.f15079b.hashCode() + (this.f15078a.hashCode() * 31)) * 961)) * 31)) * 31) + (this.f15082e ? 1231 : 1237)) * 31) + (this.f15083f ? 1231 : 1237)) * 31) + (this.f15084g ? 1231 : 1237)) * 31;
        String str = this.h;
        return this.f15089n.hashCode() + ((this.f15088m.hashCode() + ((this.l.hashCode() + ((this.f15087k.f15091o.hashCode() + ((this.f15086j.f15100a.hashCode() + ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f15085i.f2385o)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
