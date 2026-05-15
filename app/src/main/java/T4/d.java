package T4;

import O0.C;
import Q0.AbstractC0347f;
import Q0.InterfaceC0356l;
import Q0.InterfaceC0360p;
import Q0.InterfaceC0361q;
import Q0.InterfaceC0369z;
import Q0.N;
import Q0.j0;
import Q0.n0;
import R0.AbstractC0403q0;
import a.AbstractC0509a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0894j0;
import j5.AbstractC1107a;
import j5.AbstractC1110d;
import java.util.ArrayList;
import java.util.Iterator;
import k.AbstractC1113a;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.AbstractC1397o;
import w5.AbstractC1767D;
import x0.C1892b;
import x0.C1893c;
import x0.C1895e;
import y0.AbstractC1959I;
import y0.AbstractC1961K;
import y0.AbstractC1968a;
import y0.AbstractC1983p;
import y0.C1979l;
import y0.C1987t;
import y0.y;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1397o implements InterfaceC0356l, InterfaceC0369z, InterfaceC0361q, n0, InterfaceC0360p {

    /* JADX INFO: renamed from: C */
    public final C0894j0 f6949C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f6950D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f6951E;

    /* JADX INFO: renamed from: F */
    public l f6952F;

    /* JADX INFO: renamed from: G */
    public m f6953G;

    /* JADX INFO: renamed from: H */
    public final Y4.m f6954H;

    /* JADX INFO: renamed from: I */
    public int f6955I;

    public d(l lVar, m mVar) {
        AbstractC1209k.f(lVar, "state");
        this.f6949C = C0879c.t(new C1892b(9205357640488583168L));
        ArrayList arrayList = new ArrayList();
        this.f6950D = arrayList;
        this.f6951E = arrayList;
        this.f6952F = lVar;
        this.f6953G = mVar;
        this.f6954H = AbstractC0509a.O(new b(this, 0));
    }

    public final void B0(N n7, f fVar, long j3, B0.d dVar) {
        float fD;
        float fE;
        long j7;
        long jG = C1892b.g(fVar.f6962f, ((C1892b) this.f6949C.getValue()).f19867a);
        if (!((9223372034707292159L & jG) != 9205357640488583168L)) {
            jG = 0;
        }
        if (!AbstractC1110d.z(jG) || C1892b.b(jG, 0L)) {
            float fD2 = C1895e.d(fVar.f6960d);
            float fB = C1895e.b(fVar.f6960d);
            A0.b bVar = n7.f5853o.f54p;
            long jW = bVar.W();
            bVar.S().l();
            try {
                ((A.b) bVar.f50p).o(0.0f, 0.0f, fD2, fB, 1);
                if (!AbstractC1110d.z(j3) || C1892b.b(j3, 0L)) {
                    k.a(this, n7, fVar, dVar);
                } else {
                    fD = C1892b.d(j3);
                    fE = C1892b.e(j3);
                    ((A.b) n7.f5853o.f54p.f50p).J(fD, fE);
                    try {
                        k.a(this, n7, fVar, dVar);
                        ((A.b) n7.f5853o.f54p.f50p).J(-fD, -fE);
                    } finally {
                    }
                }
                n1.c.A(bVar, jW);
                return;
            } catch (Throwable th) {
                n1.c.A(bVar, jW);
                throw th;
            }
        }
        fD = C1892b.d(jG);
        fE = C1892b.e(jG);
        A0.c cVar = n7.f5853o;
        ((A.b) cVar.f54p.f50p).J(fD, fE);
        try {
            float fD3 = C1895e.d(fVar.f6960d);
            float fB2 = C1895e.b(fVar.f6960d);
            A0.b bVar2 = n7.f5853o.f54p;
            long jW2 = bVar2.W();
            bVar2.S().l();
            try {
                try {
                    ((A.b) bVar2.f50p).o(0.0f, 0.0f, fD3, fB2, 1);
                    if (!AbstractC1110d.z(j3) || C1892b.b(j3, 0L)) {
                        k.a(this, n7, fVar, dVar);
                    } else {
                        fD = C1892b.d(j3);
                        fE = C1892b.e(j3);
                        ((A.b) n7.f5853o.f54p.f50p).J(fD, fE);
                        try {
                            k.a(this, n7, fVar, dVar);
                            ((A.b) n7.f5853o.f54p.f50p).J(-fD, -fE);
                        } finally {
                        }
                    }
                    bVar2.S().k();
                    bVar2.p0(jW2);
                } catch (Throwable th2) {
                    th = th2;
                    j7 = jW2;
                    bVar2.S().k();
                    bVar2.p0(j7);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j7 = jW2;
            }
        } finally {
            ((A.b) cVar.f54p.f50p).J(-fD, -fE);
        }
    }

    public final a C0() {
        return (a) this.f6954H.getValue();
    }

    @Override // Q0.n0
    public final void F() {
        AbstractC0347f.t(this, new b(this, 1));
    }

    @Override // Q0.InterfaceC0369z
    public final void Q(C c7) {
        AbstractC1209k.f(c7, "coordinates");
        C1892b c1892b = new C1892b(C1892b.h(c7.h(0L), n.a(this)));
        C0894j0 c0894j0 = this.f6949C;
        c0894j0.setValue(c1892b);
        a aVarC0 = C0();
        long j3 = ((C1892b) c0894j0.getValue()).f19867a;
        aVarC0.getClass();
        aVarC0.f6943b.setValue(new C1892b(j3));
        a aVarC02 = C0();
        long jE = AbstractC1107a.E(c7.G());
        aVarC02.getClass();
        aVarC02.f6942a.setValue(new C1895e(jE));
    }

    @Override // Q0.InterfaceC0360p
    public final void a(N n7) throws Throwable {
        B0.d dVar;
        long j3;
        long jA;
        B0.d dVar2;
        float f7;
        d dVar3 = this;
        N n8 = n7;
        ArrayList<f> arrayList = dVar3.f6951E;
        if (arrayList.isEmpty()) {
            n8.a();
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            C1979l c1979l = null;
            c1979l = null;
            if (!it.hasNext()) {
                break;
            }
            f fVar = (f) it.next();
            n1.d dVarU = n8.f5853o.f54p.U();
            AbstractC1209k.f(fVar, "<this>");
            AbstractC1209k.f(dVarU, "density");
            if (fVar.f6959c) {
                boolean z6 = k.f6975a;
                float f8 = fVar.f6963g;
                if (Float.isNaN(f8)) {
                    f8 = 0;
                }
                float fV = dVarU.v(f8);
                if (Build.VERSION.SDK_INT >= 31 && fV >= 0.005f) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(fV, fV, Shader.TileMode.CLAMP);
                    AbstractC1209k.e(renderEffectCreateBlurEffect, "createBlurEffect(...)");
                    float f9 = fVar.h;
                    if (f9 >= 0.005f) {
                        float f10 = f9 * 255;
                        int iH = AbstractC1267a.H(f10);
                        j jVar = k.f6976b;
                        Bitmap bitmap = (Bitmap) jVar.c(Integer.valueOf(iH));
                        if (bitmap == null || bitmap.isRecycled()) {
                            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(((Context) AbstractC0347f.i(dVar3, AndroidCompositionLocals_androidKt.f9324b)).getResources(), R.drawable.haze_noise);
                            AbstractC1209k.e(bitmapDecodeResource, "decodeResource(...)");
                            Paint paint = new Paint();
                            paint.setAlpha(i6.h.q(AbstractC1267a.H(f10), 0, 255));
                            f7 = 0.005f;
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), Bitmap.Config.ARGB_8888);
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeResource, 0.0f, 0.0f, paint);
                            AbstractC1209k.e(bitmapCreateBitmap, "also(...)");
                            jVar.d(Integer.valueOf(iH), bitmapCreateBitmap);
                            bitmap = bitmapCreateBitmap;
                        } else {
                            f7 = 0.005f;
                        }
                        Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                        RenderEffect renderEffectCreateShaderEffect = RenderEffect.createShaderEffect(new BitmapShader(bitmap, tileMode2, tileMode2));
                        BlendMode unused = BlendMode.DST_ATOP;
                        renderEffectCreateBlurEffect = RenderEffect.createBlendModeEffect(renderEffectCreateShaderEffect, renderEffectCreateBlurEffect, BlendMode.DST_ATOP);
                        AbstractC1209k.c(renderEffectCreateBlurEffect);
                    } else {
                        f7 = 0.005f;
                    }
                    AbstractC1983p abstractC1983p = fVar.f6964i;
                    C1893c c1893cO = AbstractC1113a.o(fVar.a(), fVar.f6960d);
                    if (abstractC1983p != null) {
                        Shader shaderB = abstractC1983p instanceof AbstractC1961K ? ((AbstractC1961K) abstractC1983p).b(c1893cO.c()) : null;
                        if (shaderB != null) {
                            RenderEffect renderEffectCreateShaderEffect2 = RenderEffect.createShaderEffect(shaderB);
                            AbstractC1209k.e(renderEffectCreateShaderEffect2, "createShaderEffect(...)");
                            RenderEffect renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(c1893cO.f19869a, c1893cO.f19870b, renderEffectCreateShaderEffect2);
                            BlendMode unused2 = BlendMode.SRC_IN;
                            renderEffectCreateBlurEffect = RenderEffect.createBlendModeEffect(renderEffectCreateOffsetEffect, renderEffectCreateBlurEffect, BlendMode.SRC_IN);
                            AbstractC1209k.e(renderEffectCreateBlurEffect, "createBlendModeEffect(...)");
                        }
                    }
                    long j7 = fVar.f6966k;
                    BlendMode unused3 = BlendMode.SRC_ATOP;
                    if (C1987t.d(j7) >= f7) {
                        AbstractC1968a.e();
                        renderEffectCreateBlurEffect = RenderEffect.createColorFilterEffect(H1.c.d(AbstractC1959I.x(j7)), renderEffectCreateBlurEffect);
                        AbstractC1209k.c(renderEffectCreateBlurEffect);
                    }
                    c1979l = new C1979l(renderEffectCreateBlurEffect);
                }
                fVar.f6958b = c1979l;
                fVar.f6959c = false;
            }
        }
        if (k.f6975a) {
            B0.d dVar4 = dVar3.f6952F.f6978b;
            if (dVar4 != null) {
                dVar3.f6955I = 0;
                y yVar = (y) AbstractC0347f.i(dVar3, AbstractC0403q0.f6508g);
                for (f fVar2 : arrayList) {
                    B0.d dVarB = yVar.b();
                    try {
                        C1979l c1979l2 = fVar2.f6958b;
                        B0.f fVar3 = dVarB.f615a;
                        if (!AbstractC1209k.a(fVar3.h(), c1979l2)) {
                            fVar3.C(c1979l2);
                        }
                        j3 = fVar2.f6961e;
                        jA = fVar2.a();
                        try {
                            dVar2 = dVar4;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        n8.d(AbstractC1107a.w(j3), dVarB, new g(fVar2, this, jA, dVar2));
                        N n9 = n8;
                        dVar = dVarB;
                        try {
                            B0(n9, fVar2, jA ^ (-9223372034707292160L), dVar);
                            yVar.a(dVar);
                            n8 = n7;
                            dVar4 = dVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            yVar.a(dVar);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        dVar = dVarB;
                        yVar.a(dVar);
                        throw th;
                    }
                }
            } else {
                int i7 = dVar3.f6955I + 1;
                dVar3.f6955I = i7;
                if (i7 <= 2) {
                    AbstractC1767D.t(dVar3.n0(), null, new c(dVar3, null), 3);
                }
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                dVar3.B0(n7, (f) it2.next(), 0L, null);
                dVar3 = this;
            }
        }
        n7.a();
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // Q0.InterfaceC0369z
    public final /* synthetic */ void r(long j3) {
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        a aVarC0 = C0();
        m mVar = this.f6953G;
        aVarC0.getClass();
        AbstractC1209k.f(mVar, "<set-?>");
        aVarC0.f6944c.setValue(mVar);
        C0().f6945d.setValue(null);
        F();
    }

    @Override // r0.AbstractC1397o
    public final void v0() {
        a aVarC0 = C0();
        aVarC0.getClass();
        aVarC0.f6943b.setValue(new C1892b(9205357640488583168L));
        aVarC0.f6942a.setValue(new C1895e(9205357640488583168L));
    }

    @Override // Q0.InterfaceC0361q
    public final void z(j0 j0Var) {
        Q(j0Var);
    }
}
