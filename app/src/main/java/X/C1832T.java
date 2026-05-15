package x;

import Q0.AbstractC0358n;
import Q0.InterfaceC0360p;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import i4.AbstractC1086a;
import o5.AbstractC1267a;
import x0.C1895e;
import y0.AbstractC1970c;
import y0.C1969b;
import y0.InterfaceC1985r;
import z.EnumC2048l0;

/* JADX INFO: renamed from: x.T */
/* JADX INFO: loaded from: classes.dex */
public final class C1832T extends AbstractC0358n implements InterfaceC0360p {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f19684E = 1;

    /* JADX INFO: renamed from: F */
    public final C1875s f19685F;

    /* JADX INFO: renamed from: G */
    public final C1825L f19686G;

    /* JADX INFO: renamed from: H */
    public Object f19687H;

    public C1832T(K0.N n7, C1875s c1875s, C1825L c1825l) {
        this.f19685F = c1875s;
        this.f19686G = c1825l;
        B0(n7);
    }

    public static boolean E0(float f7, EdgeEffect edgeEffect, Canvas canvas) {
        if (f7 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f7);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean F0(float f7, long j3, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f7);
        canvas.translate(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final /* synthetic */ void H0() {
    }

    private final /* synthetic */ void I0() {
    }

    public RenderNode G0() {
        RenderNode renderNode = (RenderNode) this.f19687H;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeD = AbstractC1086a.d();
        this.f19687H = renderNodeD;
        return renderNodeD;
    }

    @Override // Q0.InterfaceC0360p
    public final void a(Q0.N n7) {
        boolean zF0;
        long j3;
        A0.b bVar;
        boolean z6;
        boolean zE0;
        char c7;
        float f7;
        float f8;
        float f9;
        switch (this.f19684E) {
            case 0:
                A0.c cVar = n7.f5853o;
                long jW = cVar.f54p.W();
                C1875s c1875s = this.f19685F;
                c1875s.i(jW);
                if (C1895e.e(cVar.f54p.W())) {
                    n7.a();
                    return;
                }
                n7.a();
                c1875s.f19832d.getValue();
                Canvas canvasA = AbstractC1970c.a(cVar.f54p.S());
                C1825L c1825l = this.f19686G;
                boolean zF = C1825L.f(c1825l.f19662f);
                D.k0 k0Var = (D.k0) this.f19687H;
                if (zF) {
                    zF0 = F0(270.0f, (((long) Float.floatToRawIntBits(n7.v(k0Var.a(n7.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (n7.f() & 4294967295L)))) << 32), c1825l.c(), canvasA);
                } else {
                    zF0 = false;
                }
                if (C1825L.f(c1825l.f19660d)) {
                    j3 = 4294967295L;
                    zF0 = F0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(n7.v(k0Var.f1345b))) & 4294967295L), c1825l.e(), canvasA) || zF0;
                } else {
                    j3 = 4294967295L;
                }
                if (C1825L.f(c1825l.f19663g)) {
                    zF0 = F0(90.0f, (((long) Float.floatToRawIntBits(n7.v(k0Var.b(n7.getLayoutDirection())) + (-((float) AbstractC1267a.H(Float.intBitsToFloat((int) (n7.f() >> 32))))))) & j3) | (((long) Float.floatToRawIntBits(0.0f)) << 32), c1825l.d(), canvasA) || zF0;
                }
                if (C1825L.f(c1825l.f19661e)) {
                    zF0 = F0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (n7.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (n7.f() & j3))) + n7.v(k0Var.f1347d))) & j3), c1825l.b(), canvasA) || zF0;
                }
                if (zF0) {
                    c1875s.d();
                    return;
                }
                return;
            default:
                A0.c cVar2 = n7.f5853o;
                long jW2 = cVar2.f54p.W();
                C1875s c1875s2 = this.f19685F;
                c1875s2.i(jW2);
                Canvas canvasA2 = AbstractC1970c.a(cVar2.f54p.S());
                c1875s2.f19832d.getValue();
                A0.b bVar2 = cVar2.f54p;
                if (C1895e.e(bVar2.W())) {
                    n7.a();
                    return;
                }
                boolean zIsHardwareAccelerated = canvasA2.isHardwareAccelerated();
                C1825L c1825l2 = this.f19686G;
                if (!zIsHardwareAccelerated) {
                    EdgeEffect edgeEffect = c1825l2.f19660d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = c1825l2.f19661e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = c1825l2.f19662f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = c1825l2.f19663g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = c1825l2.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = c1825l2.f19664i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = c1825l2.f19665j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = c1825l2.f19666k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    n7.a();
                    return;
                }
                float fV = n7.v(AbstractC1889z.f19862a);
                boolean z7 = C1825L.f(c1825l2.f19660d) || C1825L.g(c1825l2.h) || C1825L.f(c1825l2.f19661e) || C1825L.g(c1825l2.f19664i);
                boolean z8 = C1825L.f(c1825l2.f19662f) || C1825L.g(c1825l2.f19665j) || C1825L.f(c1825l2.f19663g) || C1825L.g(c1825l2.f19666k);
                if (z7 && z8) {
                    G0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else if (z7) {
                    G0().setPosition(0, 0, (AbstractC1267a.H(fV) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    if (!z8) {
                        n7.a();
                        return;
                    }
                    G0().setPosition(0, 0, canvasA2.getWidth(), (AbstractC1267a.H(fV) * 2) + canvasA2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = G0().beginRecording();
                if (C1825L.g(c1825l2.f19665j)) {
                    EdgeEffect edgeEffectA = c1825l2.f19665j;
                    if (edgeEffectA == null) {
                        edgeEffectA = c1825l2.a(EnumC2048l0.f20895p);
                        c1825l2.f19665j = edgeEffectA;
                    }
                    E0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (C1825L.f(c1825l2.f19662f)) {
                    EdgeEffect edgeEffectC = c1825l2.c();
                    zE0 = E0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (C1825L.g(c1825l2.f19662f)) {
                        z6 = z8;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1875s2.c() & 4294967295L));
                        EdgeEffect edgeEffectA2 = c1825l2.f19665j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = c1825l2.a(EnumC2048l0.f20895p);
                            c1825l2.f19665j = edgeEffectA2;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        float fB = i7 >= 31 ? AbstractC1881v.b(edgeEffectC) : 0.0f;
                        bVar = bVar2;
                        float f10 = 1 - fIntBitsToFloat;
                        if (i7 >= 31) {
                            AbstractC1881v.c(edgeEffectA2, fB, f10);
                        } else {
                            edgeEffectA2.onPull(fB, f10);
                        }
                    } else {
                        bVar = bVar2;
                        z6 = z8;
                    }
                } else {
                    bVar = bVar2;
                    z6 = z8;
                    zE0 = false;
                }
                if (C1825L.g(c1825l2.h)) {
                    EdgeEffect edgeEffectA3 = c1825l2.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = c1825l2.a(EnumC2048l0.f20894o);
                        c1825l2.h = edgeEffectA3;
                    }
                    E0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (C1825L.f(c1825l2.f19660d)) {
                    EdgeEffect edgeEffectE = c1825l2.e();
                    boolean z9 = E0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zE0;
                    if (C1825L.g(c1825l2.f19660d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1875s2.c() >> 32));
                        EdgeEffect edgeEffectA4 = c1825l2.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = c1825l2.a(EnumC2048l0.f20894o);
                            c1825l2.h = edgeEffectA4;
                        }
                        c7 = ' ';
                        int i8 = Build.VERSION.SDK_INT;
                        float fB2 = i8 >= 31 ? AbstractC1881v.b(edgeEffectE) : 0.0f;
                        if (i8 >= 31) {
                            AbstractC1881v.c(edgeEffectA4, fB2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                        }
                    } else {
                        c7 = ' ';
                    }
                    zE0 = z9;
                } else {
                    c7 = ' ';
                }
                if (C1825L.g(c1825l2.f19666k)) {
                    EdgeEffect edgeEffectA5 = c1825l2.f19666k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = c1825l2.a(EnumC2048l0.f20895p);
                        c1825l2.f19666k = edgeEffectA5;
                    }
                    E0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (C1825L.f(c1825l2.f19663g)) {
                    EdgeEffect edgeEffectD = c1825l2.d();
                    boolean z10 = E0(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zE0;
                    if (C1825L.g(c1825l2.f19663g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c1875s2.c() & 4294967295L));
                        EdgeEffect edgeEffectA6 = c1825l2.f19666k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = c1825l2.a(EnumC2048l0.f20895p);
                            c1825l2.f19666k = edgeEffectA6;
                        }
                        int i9 = Build.VERSION.SDK_INT;
                        float fB3 = i9 >= 31 ? AbstractC1881v.b(edgeEffectD) : 0.0f;
                        if (i9 >= 31) {
                            AbstractC1881v.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                        }
                    }
                    zE0 = z10;
                }
                if (C1825L.g(c1825l2.f19664i)) {
                    EdgeEffect edgeEffectA7 = c1825l2.f19664i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = c1825l2.a(EnumC2048l0.f20894o);
                        c1825l2.f19664i = edgeEffectA7;
                    }
                    f7 = 0.0f;
                    E0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                } else {
                    f7 = 0.0f;
                }
                if (C1825L.f(c1825l2.f19661e)) {
                    EdgeEffect edgeEffectB = c1825l2.b();
                    boolean z11 = E0(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zE0;
                    if (C1825L.g(c1825l2.f19661e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c1875s2.c() >> c7));
                        EdgeEffect edgeEffectA8 = c1825l2.f19664i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = c1825l2.a(EnumC2048l0.f20894o);
                            c1825l2.f19664i = edgeEffectA8;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        float fB4 = i10 >= 31 ? AbstractC1881v.b(edgeEffectB) : f7;
                        float f11 = 1 - fIntBitsToFloat4;
                        if (i10 >= 31) {
                            AbstractC1881v.c(edgeEffectA8, fB4, f11);
                        } else {
                            edgeEffectA8.onPull(fB4, f11);
                        }
                    }
                    zE0 = z11;
                }
                if (zE0) {
                    c1875s2.d();
                }
                float f12 = z6 ? 0.0f : fV;
                if (z7) {
                    fV = 0.0f;
                }
                n1.n layoutDirection = n7.getLayoutDirection();
                C1969b c1969b = new C1969b();
                c1969b.f20227a = recordingCanvasBeginRecording;
                long jW3 = bVar.W();
                n1.d dVarU = cVar2.f54p.U();
                n1.n nVarV = cVar2.f54p.V();
                InterfaceC1985r interfaceC1985rS = cVar2.f54p.S();
                long jW4 = cVar2.f54p.W();
                A0.b bVar3 = cVar2.f54p;
                B0.d dVar = (B0.d) bVar3.f51q;
                bVar3.n0(n7);
                bVar3.o0(layoutDirection);
                bVar3.m0(c1969b);
                bVar3.p0(jW3);
                bVar3.f51q = null;
                c1969b.l();
                try {
                    ((A.b) cVar2.f54p.f50p).J(f12, fV);
                    try {
                        n7.a();
                        c1969b.k();
                        A0.b bVar4 = cVar2.f54p;
                        bVar4.n0(dVarU);
                        bVar4.o0(nVarV);
                        bVar4.m0(interfaceC1985rS);
                        bVar4.p0(jW4);
                        bVar4.f51q = dVar;
                        G0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f8, f9);
                        canvasA2.drawRenderNode(G0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((A.b) cVar2.f54p.f50p).J(-f12, -fV);
                    }
                } catch (Throwable th) {
                    c1969b.k();
                    A0.b bVar5 = cVar2.f54p;
                    bVar5.n0(dVarU);
                    bVar5.o0(nVarV);
                    bVar5.m0(interfaceC1985rS);
                    bVar5.p0(jW4);
                    bVar5.f51q = dVar;
                    throw th;
                }
        }
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
        int i7 = this.f19684E;
    }

    public C1832T(K0.N n7, C1875s c1875s, C1825L c1825l, D.k0 k0Var) {
        this.f19685F = c1875s;
        this.f19686G = c1825l;
        this.f19687H = k0Var;
        B0(n7);
    }
}
