package g1;

import C2.AbstractC0032d;
import R0.C0415x;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import b1.AbstractC0607C;
import b1.C0613I;
import b1.C0630o;
import b1.L;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import x0.C1893c;
import y0.AbstractC1959I;
import y0.C1953C;

/* JADX INFO: renamed from: g1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0961c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0415x f12334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.b f12335b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12340g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0980v f12342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0613I f12343k;
    public B2.m l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C1893c f12345n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1893c f12346o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12336c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC1182c f12344m = C0960b.f12328r;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f12347p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f12348q = C1953C.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f12349r = new Matrix();

    public C0961c(C0415x c0415x, A0.b bVar) {
        this.f12334a = c0415x;
        this.f12335b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [Y4.e] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y4.e, java.lang.Object] */
    public final void a() {
        ?? r21;
        C0630o c0630o;
        boolean z6;
        boolean z7;
        float f7;
        int iE;
        int iE2;
        A0.b bVar = this.f12335b;
        ?? r22 = bVar.f51q;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view = (View) bVar.f50p;
        if (inputMethodManager.isActive(view)) {
            InterfaceC1182c interfaceC1182c = this.f12344m;
            float[] fArr = this.f12348q;
            interfaceC1182c.b(new C1953C(fArr));
            this.f12334a.w(fArr);
            Matrix matrix = this.f12349r;
            AbstractC1959I.p(matrix, fArr);
            C0980v c0980v = this.f12342j;
            AbstractC1209k.c(c0980v);
            B2.m mVar = this.l;
            AbstractC1209k.c(mVar);
            C0613I c0613i = this.f12343k;
            AbstractC1209k.c(c0613i);
            C1893c c1893c = this.f12345n;
            AbstractC1209k.c(c1893c);
            C1893c c1893c2 = this.f12346o;
            AbstractC1209k.c(c1893c2);
            boolean z8 = this.f12339f;
            boolean z9 = this.f12340g;
            boolean z10 = this.h;
            boolean z11 = this.f12341i;
            CursorAnchorInfo.Builder builder = this.f12347p;
            builder.reset();
            builder.setMatrix(matrix);
            long j3 = c0980v.f12385b;
            int iF = L.f(j3);
            builder.setSelectionRange(iF, L.e(j3));
            if (!z8 || iF < 0) {
                r21 = r22;
            } else {
                mVar.a(iF);
                C1893c c1893cC = c0613i.c(iF);
                r21 = r22;
                float fP = i6.h.p(c1893cC.f19869a, 0.0f, (int) (c0613i.f9931c >> 32));
                boolean zK = android.support.v4.media.session.b.k(c1893c, fP, c1893cC.f19870b);
                boolean zK2 = android.support.v4.media.session.b.k(c1893c, fP, c1893cC.f19872d);
                boolean z12 = c0613i.a(iF) == m1.j.f14342p;
                int i7 = (zK || zK2) ? 1 : 0;
                if (!zK || !zK2) {
                    i7 |= 2;
                }
                if (z12) {
                    i7 |= 4;
                }
                float f8 = c1893cC.f19870b;
                float f9 = c1893cC.f19872d;
                builder.setInsertionMarkerLocation(fP, f8, f9, f9, i7);
            }
            C0630o c0630o2 = c0613i.f9930b;
            float f10 = c1893c.f19872d;
            float f11 = c1893c.f19870b;
            if (z9) {
                L l = c0980v.f12386c;
                z6 = z10;
                int iF2 = l != null ? L.f(l.f9945a) : -1;
                int iE3 = l != null ? L.e(l.f9945a) : -1;
                if (iF2 < 0 || iF2 >= iE3) {
                    z7 = z11;
                    f7 = f11;
                    c0630o = c0630o2;
                } else {
                    builder.setComposingText(iF2, c0980v.f12384a.f9970p.subSequence(iF2, iE3));
                    mVar.a(iF2);
                    mVar.a(iE3);
                    float[] fArr2 = new float[(iE3 - iF2) * 4];
                    boolean z13 = z11;
                    C0630o c0630o3 = c0630o2;
                    c0630o3.a(AbstractC0607C.b(iF2, iE3), fArr2);
                    f7 = f11;
                    int i8 = iF2;
                    while (i8 < iE3) {
                        mVar.a(i8);
                        int i9 = (i8 - iF2) * 4;
                        C0630o c0630o4 = c0630o3;
                        float f12 = fArr2[i9];
                        int i10 = iE3;
                        float f13 = fArr2[i9 + 1];
                        float[] fArr3 = fArr2;
                        float f14 = fArr3[i9 + 2];
                        float f15 = fArr3[i9 + 3];
                        boolean z14 = z13;
                        int i11 = (c1893c.f19869a < f14 ? 1 : 0) & (f12 < c1893c.f19871c ? 1 : 0) & (f7 < f15 ? 1 : 0) & (f13 < f10 ? 1 : 0);
                        if (!android.support.v4.media.session.b.k(c1893c, f12, f13) || !android.support.v4.media.session.b.k(c1893c, f14, f15)) {
                            i11 |= 2;
                        }
                        if (c0613i.a(i8) == m1.j.f14342p) {
                            i11 |= 4;
                        }
                        builder.addCharacterBounds(i8, f12, f13, f14, f15, i11);
                        i8++;
                        c0630o3 = c0630o4;
                        iE3 = i10;
                        fArr2 = fArr3;
                        z13 = z14;
                    }
                    z7 = z13;
                    c0630o = c0630o3;
                }
            } else {
                c0630o = c0630o2;
                z6 = z10;
                z7 = z11;
                f7 = f11;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 33 && z6) {
                builder.setEditorBoundsInfo(AbstractC0032d.h().setEditorBounds(AbstractC1959I.v(c1893c2)).setHandwritingBounds(AbstractC1959I.v(c1893c2)).build());
            }
            if (i12 >= 34 && z7 && !c1893c.f() && (iE = c0630o.e(f7)) <= (iE2 = c0630o.e(f10))) {
                while (true) {
                    builder.addVisibleLineBounds(c0613i.f(iE), c0630o.f(iE), c0613i.g(iE), c0630o.b(iE));
                    if (iE == iE2) {
                        break;
                    } else {
                        iE++;
                    }
                }
            }
            ((InputMethodManager) r21.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f12338e = false;
        }
    }
}
