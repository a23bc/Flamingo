package R;

import D.AbstractC0074o;
import D.C0078t;
import D.J;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import l5.InterfaceC1182c;
import r0.C1395m;
import r0.InterfaceC1398p;
import y.AbstractC1949e;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f6222a = new v();

    public final void a(Drawable drawable, C0912t c0912t, int i7) {
        c0912t.Z(257732500);
        int i8 = (c0912t.h(drawable) ? 4 : 2) | i7;
        if (c0912t.N(i8 & 1, (i8 & 3) != 2)) {
            InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(C1395m.f15634a, AbstractC1949e.f20163j);
            boolean zH = c0912t.h(drawable);
            Object objK = c0912t.K();
            if (zH || objK == C0903o.f11850a) {
                objK = new J(12, drawable);
                c0912t.i0(objK);
            }
            AbstractC0074o.a(androidx.compose.ui.draw.a.a(interfaceC1398pG, (InterfaceC1182c) objK), c0912t, 0);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(this, drawable, i7, 6);
        }
    }

    public final void b(final Icon icon, C0912t c0912t, final int i7) {
        c0912t.Z(2116504409);
        int i8 = (c0912t.h(icon) ? 4 : 2) | i7;
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            boolean zF = c0912t.f(icon) | c0912t.f(context);
            Object objK = c0912t.K();
            if (zF || objK == C0903o.f11850a) {
                objK = icon.loadDrawable(context);
                c0912t.i0(objK);
            }
            Drawable drawable = (Drawable) objK;
            if (drawable == null) {
                C0915u0 c0915u0R = c0912t.r();
                if (c0915u0R != null) {
                    final int i9 = 1;
                    c0915u0R.f11932d = new l5.e(this, icon, i7, i9) { // from class: R.u

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ int f6219o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ v f6220p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ Icon f6221q;

                        {
                            this.f6219o = i9;
                            this.f6220p = this;
                        }

                        @Override // l5.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i10 = this.f6219o;
                            C0912t c0912t2 = (C0912t) obj;
                            ((Integer) obj2).getClass();
                            switch (i10) {
                                case 0:
                                    this.f6220p.b(this.f6221q, c0912t2, C0879c.B(49));
                                    break;
                                default:
                                    this.f6220p.b(this.f6221q, c0912t2, C0879c.B(49));
                                    break;
                            }
                            return Y4.o.f8736a;
                        }
                    };
                    return;
                }
                return;
            }
            a(drawable, c0912t, 48);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R2 = c0912t.r();
        if (c0915u0R2 != null) {
            final int i10 = 0;
            c0915u0R2.f11932d = new l5.e(this, icon, i7, i10) { // from class: R.u

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ int f6219o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ v f6220p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ Icon f6221q;

                {
                    this.f6219o = i10;
                    this.f6220p = this;
                }

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    int i102 = this.f6219o;
                    C0912t c0912t2 = (C0912t) obj;
                    ((Integer) obj2).getClass();
                    switch (i102) {
                        case 0:
                            this.f6220p.b(this.f6221q, c0912t2, C0879c.B(49));
                            break;
                        default:
                            this.f6220p.b(this.f6221q, c0912t2, C0879c.B(49));
                            break;
                    }
                    return Y4.o.f8736a;
                }
            };
        }
    }
}
