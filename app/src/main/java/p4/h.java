package p4;

import L2.C0247a;
import Z4.v;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.K;
import java.util.Arrays;
import m5.AbstractC1209k;
import n4.C1230a;
import w5.AbstractC1805x;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: A */
    public final C1230a f15047A;

    /* JADX INFO: renamed from: B */
    public final Integer f15048B;

    /* JADX INFO: renamed from: C */
    public final Integer f15049C;

    /* JADX INFO: renamed from: D */
    public final Integer f15050D;

    /* JADX INFO: renamed from: E */
    public final C1297c f15051E;

    /* JADX INFO: renamed from: F */
    public final C1296b f15052F;

    /* JADX INFO: renamed from: a */
    public final Context f15053a;

    /* JADX INFO: renamed from: b */
    public final Object f15054b;

    /* JADX INFO: renamed from: c */
    public final C0247a f15055c;

    /* JADX INFO: renamed from: d */
    public final C1230a f15056d;

    /* JADX INFO: renamed from: e */
    public final String f15057e;

    /* JADX INFO: renamed from: f */
    public final Bitmap.Config f15058f;

    /* JADX INFO: renamed from: g */
    public final q4.d f15059g;
    public final v h;

    /* JADX INFO: renamed from: i */
    public final r4.e f15060i;

    /* JADX INFO: renamed from: j */
    public final F5.m f15061j;

    /* JADX INFO: renamed from: k */
    public final o f15062k;
    public final boolean l;

    /* JADX INFO: renamed from: m */
    public final boolean f15063m;

    /* JADX INFO: renamed from: n */
    public final boolean f15064n;

    /* JADX INFO: renamed from: o */
    public final boolean f15065o;

    /* JADX INFO: renamed from: p */
    public final EnumC1295a f15066p;

    /* JADX INFO: renamed from: q */
    public final EnumC1295a f15067q;

    /* JADX INFO: renamed from: r */
    public final EnumC1295a f15068r;

    /* JADX INFO: renamed from: s */
    public final AbstractC1805x f15069s;

    /* JADX INFO: renamed from: t */
    public final AbstractC1805x f15070t;

    /* JADX INFO: renamed from: u */
    public final AbstractC1805x f15071u;

    /* JADX INFO: renamed from: v */
    public final AbstractC1805x f15072v;

    /* JADX INFO: renamed from: w */
    public final K f15073w;

    /* JADX INFO: renamed from: x */
    public final q4.i f15074x;

    /* JADX INFO: renamed from: y */
    public final q4.g f15075y;

    /* JADX INFO: renamed from: z */
    public final m f15076z;

    public h(Context context, Object obj, C0247a c0247a, C1230a c1230a, String str, Bitmap.Config config, q4.d dVar, v vVar, r4.e eVar, F5.m mVar, o oVar, boolean z6, boolean z7, boolean z8, boolean z9, EnumC1295a enumC1295a, EnumC1295a enumC1295a2, EnumC1295a enumC1295a3, AbstractC1805x abstractC1805x, AbstractC1805x abstractC1805x2, AbstractC1805x abstractC1805x3, AbstractC1805x abstractC1805x4, K k7, q4.i iVar, q4.g gVar, m mVar2, C1230a c1230a2, Integer num, Integer num2, Integer num3, C1297c c1297c, C1296b c1296b) {
        this.f15053a = context;
        this.f15054b = obj;
        this.f15055c = c0247a;
        this.f15056d = c1230a;
        this.f15057e = str;
        this.f15058f = config;
        this.f15059g = dVar;
        this.h = vVar;
        this.f15060i = eVar;
        this.f15061j = mVar;
        this.f15062k = oVar;
        this.l = z6;
        this.f15063m = z7;
        this.f15064n = z8;
        this.f15065o = z9;
        this.f15066p = enumC1295a;
        this.f15067q = enumC1295a2;
        this.f15068r = enumC1295a3;
        this.f15069s = abstractC1805x;
        this.f15070t = abstractC1805x2;
        this.f15071u = abstractC1805x3;
        this.f15072v = abstractC1805x4;
        this.f15073w = k7;
        this.f15074x = iVar;
        this.f15075y = gVar;
        this.f15076z = mVar2;
        this.f15047A = c1230a2;
        this.f15048B = num;
        this.f15049C = num2;
        this.f15050D = num3;
        this.f15051E = c1297c;
        this.f15052F = c1296b;
    }

    public static g a(h hVar) {
        Context context = hVar.f15053a;
        hVar.getClass();
        return new g(hVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC1209k.a(this.f15053a, hVar.f15053a) && this.f15054b.equals(hVar.f15054b) && AbstractC1209k.a(this.f15055c, hVar.f15055c) && AbstractC1209k.a(this.f15056d, hVar.f15056d) && AbstractC1209k.a(this.f15057e, hVar.f15057e) && this.f15058f == hVar.f15058f && this.f15059g == hVar.f15059g && AbstractC1209k.a(this.h, hVar.h) && AbstractC1209k.a(this.f15060i, hVar.f15060i) && AbstractC1209k.a(this.f15061j, hVar.f15061j) && this.f15062k.equals(hVar.f15062k) && this.l == hVar.l && this.f15063m == hVar.f15063m && this.f15064n == hVar.f15064n && this.f15065o == hVar.f15065o && this.f15066p == hVar.f15066p && this.f15067q == hVar.f15067q && this.f15068r == hVar.f15068r && AbstractC1209k.a(this.f15069s, hVar.f15069s) && AbstractC1209k.a(this.f15070t, hVar.f15070t) && AbstractC1209k.a(this.f15071u, hVar.f15071u) && AbstractC1209k.a(this.f15072v, hVar.f15072v) && AbstractC1209k.a(this.f15047A, hVar.f15047A) && AbstractC1209k.a(this.f15048B, hVar.f15048B) && AbstractC1209k.a(this.f15049C, hVar.f15049C) && AbstractC1209k.a(this.f15050D, hVar.f15050D) && AbstractC1209k.a(this.f15073w, hVar.f15073w) && this.f15074x.equals(hVar.f15074x) && this.f15075y == hVar.f15075y && this.f15076z.equals(hVar.f15076z) && this.f15051E.equals(hVar.f15051E) && AbstractC1209k.a(this.f15052F, hVar.f15052F);
    }

    public final int hashCode() {
        int iHashCode = (this.f15054b.hashCode() + (this.f15053a.hashCode() * 31)) * 31;
        C0247a c0247a = this.f15055c;
        int iHashCode2 = (iHashCode + (c0247a != null ? c0247a.hashCode() : 0)) * 961;
        C1230a c1230a = this.f15056d;
        int iHashCode3 = (iHashCode2 + (c1230a != null ? c1230a.hashCode() : 0)) * 31;
        String str = this.f15057e;
        int iHashCode4 = (this.f15059g.hashCode() + ((this.f15058f.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 29791;
        this.h.getClass();
        int iHashCode5 = (this.f15076z.f15091o.hashCode() + ((this.f15075y.hashCode() + ((this.f15074x.hashCode() + ((this.f15073w.hashCode() + ((this.f15072v.hashCode() + ((this.f15071u.hashCode() + ((this.f15070t.hashCode() + ((this.f15069s.hashCode() + ((this.f15068r.hashCode() + ((this.f15067q.hashCode() + ((this.f15066p.hashCode() + ((((((((((this.f15062k.f15100a.hashCode() + ((((this.f15060i.hashCode() + ((1 + iHashCode4) * 31)) * 31) + Arrays.hashCode(this.f15061j.f2385o)) * 31)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.f15063m ? 1231 : 1237)) * 31) + (this.f15064n ? 1231 : 1237)) * 31) + (this.f15065o ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        C1230a c1230a2 = this.f15047A;
        int iHashCode6 = (iHashCode5 + (c1230a2 != null ? c1230a2.hashCode() : 0)) * 31;
        Integer num = this.f15048B;
        int iHashCode7 = (iHashCode6 + (num != null ? num.hashCode() : 0)) * 961;
        Integer num2 = this.f15049C;
        int iHashCode8 = (iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 961;
        Integer num3 = this.f15050D;
        return this.f15052F.hashCode() + ((this.f15051E.hashCode() + ((iHashCode8 + (num3 != null ? num3.hashCode() : 0)) * 961)) * 31);
    }
}
