package p4;

import android.graphics.Bitmap;
import m5.AbstractC1209k;
import r4.C1419c;
import w5.AbstractC1805x;
import w5.M;

/* JADX INFO: renamed from: p4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1296b {

    /* JADX INFO: renamed from: a */
    public final AbstractC1805x f15005a;

    /* JADX INFO: renamed from: b */
    public final D5.d f15006b;

    /* JADX INFO: renamed from: c */
    public final D5.d f15007c;

    /* JADX INFO: renamed from: d */
    public final D5.d f15008d;

    /* JADX INFO: renamed from: e */
    public final C1419c f15009e;

    /* JADX INFO: renamed from: f */
    public final q4.d f15010f;

    /* JADX INFO: renamed from: g */
    public final Bitmap.Config f15011g;
    public final boolean h;

    /* JADX INFO: renamed from: i */
    public final EnumC1295a f15012i;

    /* JADX INFO: renamed from: j */
    public final EnumC1295a f15013j;

    /* JADX INFO: renamed from: k */
    public final EnumC1295a f15014k;

    public C1296b() {
        D5.e eVar = M.f19497a;
        x5.d dVar = B5.n.f912a.f20145t;
        D5.d dVar2 = M.f19498b;
        C1419c c1419c = r4.e.f15778a;
        q4.d dVar3 = q4.d.f15587q;
        Bitmap.Config config = s4.e.f15919a;
        EnumC1295a enumC1295a = EnumC1295a.f15000q;
        this.f15005a = dVar;
        this.f15006b = dVar2;
        this.f15007c = dVar2;
        this.f15008d = dVar2;
        this.f15009e = c1419c;
        this.f15010f = dVar3;
        this.f15011g = config;
        this.h = true;
        this.f15012i = enumC1295a;
        this.f15013j = enumC1295a;
        this.f15014k = enumC1295a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1296b)) {
            return false;
        }
        C1296b c1296b = (C1296b) obj;
        return AbstractC1209k.a(this.f15005a, c1296b.f15005a) && AbstractC1209k.a(this.f15006b, c1296b.f15006b) && AbstractC1209k.a(this.f15007c, c1296b.f15007c) && AbstractC1209k.a(this.f15008d, c1296b.f15008d) && AbstractC1209k.a(this.f15009e, c1296b.f15009e) && this.f15010f == c1296b.f15010f && this.f15011g == c1296b.f15011g && this.h == c1296b.h && this.f15012i == c1296b.f15012i && this.f15013j == c1296b.f15013j && this.f15014k == c1296b.f15014k;
    }

    public final int hashCode() {
        int iHashCode = (this.f15008d.hashCode() + ((this.f15007c.hashCode() + ((this.f15006b.hashCode() + (this.f15005a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f15009e.getClass();
        return this.f15014k.hashCode() + ((this.f15013j.hashCode() + ((this.f15012i.hashCode() + ((((((this.f15011g.hashCode() + ((this.f15010f.hashCode() + ((C1419c.class.hashCode() + iHashCode) * 31)) * 31)) * 31) + (this.h ? 1231 : 1237)) * 31) + 1237) * 923521)) * 31)) * 31);
    }
}
