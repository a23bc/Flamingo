package p4;

import E0.C0096g;
import L2.C0247a;
import Z4.v;
import Z4.y;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.InterfaceC0597u;
import androidx.lifecycle.K;
import b2.w0;
import j5.AbstractC1107a;
import java.util.LinkedHashMap;
import n4.C1230a;
import q4.C1377a;
import q4.C1379c;
import r4.C1417a;
import w5.AbstractC1805x;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a */
    public final Context f15025a;

    /* JADX INFO: renamed from: b */
    public C1296b f15026b;

    /* JADX INFO: renamed from: c */
    public Object f15027c;

    /* JADX INFO: renamed from: d */
    public C0247a f15028d;

    /* JADX INFO: renamed from: e */
    public C1230a f15029e;

    /* JADX INFO: renamed from: f */
    public String f15030f;

    /* JADX INFO: renamed from: g */
    public q4.d f15031g;
    public final v h;

    /* JADX INFO: renamed from: i */
    public r4.e f15032i;

    /* JADX INFO: renamed from: j */
    public final C0096g f15033j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap f15034k;
    public final boolean l;

    /* JADX INFO: renamed from: m */
    public Boolean f15035m;

    /* JADX INFO: renamed from: n */
    public final boolean f15036n;

    /* JADX INFO: renamed from: o */
    public final w0 f15037o;

    /* JADX INFO: renamed from: p */
    public C1230a f15038p;

    /* JADX INFO: renamed from: q */
    public Integer f15039q;

    /* JADX INFO: renamed from: r */
    public Integer f15040r;

    /* JADX INFO: renamed from: s */
    public Integer f15041s;

    /* JADX INFO: renamed from: t */
    public q4.i f15042t;

    /* JADX INFO: renamed from: u */
    public q4.g f15043u;

    /* JADX INFO: renamed from: v */
    public K f15044v;

    /* JADX INFO: renamed from: w */
    public q4.i f15045w;

    /* JADX INFO: renamed from: x */
    public q4.g f15046x;

    public g(Context context) {
        this.f15025a = context;
        this.f15026b = s4.d.f15918a;
        this.f15027c = null;
        this.f15028d = null;
        this.f15029e = null;
        this.f15030f = null;
        this.f15031g = null;
        this.h = v.f8818o;
        this.f15032i = null;
        this.f15033j = null;
        this.f15034k = null;
        this.l = true;
        this.f15035m = null;
        this.f15036n = true;
        this.f15037o = null;
        this.f15038p = null;
        this.f15039q = null;
        this.f15040r = null;
        this.f15041s = null;
        this.f15042t = null;
        this.f15043u = null;
        this.f15044v = null;
        this.f15045w = null;
        this.f15046x = null;
    }

    public final h a() {
        K k7;
        q4.i iVar;
        K kH;
        Object obj = this.f15027c;
        if (obj == null) {
            obj = j.f15077a;
        }
        Object obj2 = obj;
        C0247a c0247a = this.f15028d;
        C1230a c1230a = this.f15029e;
        String str = this.f15030f;
        C1296b c1296b = this.f15026b;
        Bitmap.Config config = c1296b.f15011g;
        q4.d dVar = this.f15031g;
        if (dVar == null) {
            dVar = c1296b.f15010f;
        }
        q4.d dVar2 = dVar;
        r4.e eVar = this.f15032i;
        if (eVar == null) {
            eVar = c1296b.f15009e;
        }
        r4.e eVar2 = eVar;
        C0096g c0096g = this.f15033j;
        F5.m mVarH = c0096g != null ? c0096g.h() : null;
        if (mVarH == null) {
            mVarH = s4.e.f15920b;
        } else {
            Bitmap.Config config2 = s4.e.f15919a;
        }
        F5.m mVar = mVarH;
        LinkedHashMap linkedHashMap = this.f15034k;
        o oVar = linkedHashMap != null ? new o(AbstractC1107a.D(linkedHashMap)) : null;
        if (oVar == null) {
            oVar = o.f15099b;
        }
        o oVar2 = oVar;
        Boolean bool = this.f15035m;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f15026b.h;
        this.f15026b.getClass();
        C1296b c1296b2 = this.f15026b;
        EnumC1295a enumC1295a = c1296b2.f15012i;
        EnumC1295a enumC1295a2 = c1296b2.f15013j;
        EnumC1295a enumC1295a3 = c1296b2.f15014k;
        AbstractC1805x abstractC1805x = c1296b2.f15005a;
        D5.d dVar3 = c1296b2.f15006b;
        D5.d dVar4 = c1296b2.f15007c;
        D5.d dVar5 = c1296b2.f15008d;
        K k8 = this.f15044v;
        Context context = this.f15025a;
        if (k8 == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof InterfaceC0597u) {
                    kH = ((InterfaceC0597u) baseContext).h();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    kH = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (kH == null) {
                kH = f.f15023e;
            }
            k7 = kH;
        } else {
            k7 = k8;
        }
        q4.i iVar2 = this.f15042t;
        if (iVar2 == null) {
            q4.i c1379c = this.f15045w;
            if (c1379c == null) {
                c1379c = new C1379c(context);
            }
            iVar = c1379c;
        } else {
            iVar = iVar2;
        }
        q4.g gVar = this.f15043u;
        if (gVar == null && (gVar = this.f15046x) == null) {
            if (iVar2 instanceof q4.f) {
            }
            gVar = q4.g.f15591p;
        }
        q4.g gVar2 = gVar;
        w0 w0Var = this.f15037o;
        m mVar2 = w0Var != null ? new m(AbstractC1107a.D(w0Var.f10345a)) : null;
        if (mVar2 == null) {
            mVar2 = m.f15090p;
        }
        return new h(this.f15025a, obj2, c0247a, c1230a, str, config, dVar2, this.h, eVar2, mVar, oVar2, this.l, zBooleanValue, false, this.f15036n, enumC1295a, enumC1295a2, enumC1295a3, abstractC1805x, dVar3, dVar4, dVar5, k7, iVar, gVar2, mVar2, this.f15038p, this.f15039q, this.f15040r, this.f15041s, new C1297c(this.f15042t, this.f15043u, this.f15032i, this.f15031g, this.f15035m), this.f15026b);
    }

    public final void b() {
        this.f15032i = new C1417a(100);
    }

    public final void c(int i7) {
        this.f15042t = new q4.e(new q4.h(new C1377a(i7), new C1377a(i7)));
        this.f15044v = null;
        this.f15045w = null;
        this.f15046x = null;
    }

    public g(h hVar, Context context) {
        this.f15025a = context;
        this.f15026b = hVar.f15052F;
        this.f15027c = hVar.f15054b;
        this.f15028d = hVar.f15055c;
        this.f15029e = hVar.f15056d;
        this.f15030f = hVar.f15057e;
        C1297c c1297c = hVar.f15051E;
        this.f15031g = c1297c.f15018d;
        this.h = hVar.h;
        this.f15032i = c1297c.f15017c;
        this.f15033j = hVar.f15061j.g();
        this.f15034k = y.q0(hVar.f15062k.f15100a);
        this.l = hVar.l;
        this.f15035m = c1297c.f15019e;
        this.f15036n = hVar.f15065o;
        this.f15037o = new w0(hVar.f15076z);
        this.f15038p = hVar.f15047A;
        this.f15039q = hVar.f15048B;
        this.f15040r = hVar.f15049C;
        this.f15041s = hVar.f15050D;
        this.f15042t = c1297c.f15015a;
        this.f15043u = c1297c.f15016b;
        if (hVar.f15053a == context) {
            this.f15044v = hVar.f15073w;
            this.f15045w = hVar.f15074x;
            this.f15046x = hVar.f15075y;
        } else {
            this.f15044v = null;
            this.f15045w = null;
            this.f15046x = null;
        }
    }
}
