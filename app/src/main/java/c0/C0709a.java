package c0;

import E0.K;
import Q0.N;
import android.view.ViewGroup;
import f0.C0;
import f0.C0879c;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import java.util.LinkedHashMap;
import o5.AbstractC1267a;
import x.InterfaceC1846d0;
import y0.AbstractC1970c;
import y0.C1987t;
import y0.InterfaceC1985r;

/* JADX INFO: renamed from: c0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0709a implements C0, s, InterfaceC1846d0 {

    /* JADX INFO: renamed from: o */
    public final boolean f10531o;

    /* JADX INFO: renamed from: p */
    public final B0.a f10532p;

    /* JADX INFO: renamed from: q */
    public final boolean f10533q;

    /* JADX INFO: renamed from: r */
    public final float f10534r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0878b0 f10535s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC0878b0 f10536t;

    /* JADX INFO: renamed from: u */
    public final ViewGroup f10537u;

    /* JADX INFO: renamed from: v */
    public r f10538v;

    /* JADX INFO: renamed from: w */
    public final C0894j0 f10539w = C0879c.t(null);

    /* JADX INFO: renamed from: x */
    public final C0894j0 f10540x = C0879c.t(Boolean.TRUE);

    /* JADX INFO: renamed from: y */
    public long f10541y = 0;

    /* JADX INFO: renamed from: z */
    public int f10542z = -1;

    /* JADX INFO: renamed from: A */
    public final K f10530A = new K(18, this);

    public C0709a(boolean z6, float f7, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, ViewGroup viewGroup) {
        this.f10531o = z6;
        this.f10532p = new B0.a(z6, new u(interfaceC0878b02, 0));
        this.f10533q = z6;
        this.f10534r = f7;
        this.f10535s = interfaceC0878b0;
        this.f10536t = interfaceC0878b02;
        this.f10537u = viewGroup;
    }

    @Override // x.InterfaceC1846d0
    public final void b(N n7) {
        A0.c cVar = n7.f5853o;
        this.f10541y = cVar.f54p.W();
        float f7 = this.f10534r;
        this.f10542z = Float.isNaN(f7) ? AbstractC1267a.H(q.a(n7, this.f10533q, cVar.f54p.W())) : n7.L(f7);
        long j3 = ((C1987t) this.f10535s.getValue()).f20264a;
        float f8 = ((h) this.f10536t.getValue()).f10561d;
        n7.a();
        this.f10532p.c(n7, Float.isNaN(f7) ? q.a(n7, this.f10531o, n7.f()) : n7.v(f7), j3);
        InterfaceC1985r interfaceC1985rS = cVar.f54p.S();
        ((Boolean) this.f10540x.getValue()).booleanValue();
        t tVar = (t) this.f10539w.getValue();
        if (tVar != null) {
            tVar.e(f8, cVar.f54p.W(), j3);
            tVar.draw(AbstractC1970c.a(interfaceC1985rS));
        }
    }

    @Override // c0.s
    public final void c0() {
        this.f10539w.setValue(null);
    }

    @Override // f0.C0
    public final void e() throws Exception {
        r rVar = this.f10538v;
        if (rVar != null) {
            c0();
            V1.a aVar = rVar.f10592r;
            t tVar = (t) ((LinkedHashMap) aVar.f7389o).get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f7389o;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f10591q.add(tVar);
            }
        }
    }

    @Override // f0.C0
    public final void f() throws Exception {
        r rVar = this.f10538v;
        if (rVar != null) {
            c0();
            V1.a aVar = rVar.f10592r;
            t tVar = (t) ((LinkedHashMap) aVar.f7389o).get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f7389o;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f10591q.add(tVar);
            }
        }
    }

    @Override // f0.C0
    public final void a() {
    }
}
