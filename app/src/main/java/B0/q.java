package B0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import m5.AbstractC1210l;
import y0.C1969b;
import y0.C1986s;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final class q extends View {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p f709y = new p(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0.a f710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1986s f711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A0.c f712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Outline f714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f715t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n1.d f716u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n1.n f717v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractC1210l f718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f719x;

    public q(C0.a aVar, C1986s c1986s, A0.c cVar) {
        super(aVar.getContext());
        this.f710o = aVar;
        this.f711p = c1986s;
        this.f712q = cVar;
        setOutlineProvider(f709y);
        this.f715t = true;
        this.f716u = A0.d.f57a;
        this.f717v = n1.n.f14521o;
        f.f638a.getClass();
        this.f718w = c.f613r;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [l5.c, m5.l] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1986s c1986s = this.f711p;
        C1969b c1969b = c1986s.f20254a;
        Canvas canvas2 = c1969b.f20227a;
        c1969b.f20227a = canvas;
        n1.d dVar = this.f716u;
        n1.n nVar = this.f717v;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        d dVar2 = this.f719x;
        ?? r9 = this.f718w;
        A0.c cVar = this.f712q;
        n1.d dVarU = cVar.f54p.U();
        A0.b bVar = cVar.f54p;
        n1.n nVarV = bVar.V();
        InterfaceC1985r interfaceC1985rS = bVar.S();
        long jW = bVar.W();
        d dVar3 = (d) bVar.f51q;
        bVar.n0(dVar);
        bVar.o0(nVar);
        bVar.m0(c1969b);
        bVar.p0(jFloatToRawIntBits);
        bVar.f51q = dVar2;
        c1969b.l();
        try {
            r9.b(cVar);
            c1969b.k();
            bVar.n0(dVarU);
            bVar.o0(nVarV);
            bVar.m0(interfaceC1985rS);
            bVar.p0(jW);
            bVar.f51q = dVar3;
            c1986s.f20254a.f20227a = canvas2;
            this.f713r = false;
        } catch (Throwable th) {
            c1969b.k();
            bVar.n0(dVarU);
            bVar.o0(nVarV);
            bVar.m0(interfaceC1985rS);
            bVar.p0(jW);
            bVar.f51q = dVar3;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f715t;
    }

    public final C1986s getCanvasHolder() {
        return this.f711p;
    }

    public final View getOwnerView() {
        return this.f710o;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f715t;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f713r) {
            return;
        }
        this.f713r = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z6) {
        if (this.f715t != z6) {
            this.f715t = z6;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z6) {
        this.f713r = z6;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
    }
}
