package D;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import java.util.WeakHashMap;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: D.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0058c implements InterfaceC0064f, InterfaceC0067h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1302a;

    public /* synthetic */ C0058c(int i7) {
        this.f1302a = i7;
    }

    public static final C0054a d(int i7, String str) {
        WeakHashMap weakHashMap = z0.f1422u;
        return new C0054a(i7, str);
    }

    public static final v0 e(int i7, String str) {
        WeakHashMap weakHashMap = z0.f1422u;
        return new v0(new Z(0, 0, 0, 0), str);
    }

    public static z0 f(C0912t c0912t) {
        z0 z0Var;
        View view = (View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f);
        WeakHashMap weakHashMap = z0.f1422u;
        synchronized (weakHashMap) {
            try {
                Object z0Var2 = weakHashMap.get(view);
                if (z0Var2 == null) {
                    z0Var2 = new z0(view);
                    weakHashMap.put(view, z0Var2);
                }
                z0Var = (z0) z0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zH = c0912t.h(z0Var) | c0912t.h(view);
        Object objK = c0912t.K();
        if (zH || objK == C0903o.f11850a) {
            objK = new h0(z0Var, 2, view);
            c0912t.i0(objK);
        }
        C0879c.d(z0Var, (InterfaceC1182c) objK, c0912t);
        return z0Var;
    }

    @Override // D.InterfaceC0064f, D.InterfaceC0067h
    public float a() {
        switch (this.f1302a) {
        }
        return 0;
    }

    @Override // D.InterfaceC0067h
    public void b(n1.d dVar, int i7, int[] iArr, int[] iArr2) {
        switch (this.f1302a) {
            case 2:
                AbstractC0068i.c(i7, iArr, iArr2, false);
                break;
            default:
                AbstractC0068i.b(iArr, iArr2, false);
                break;
        }
    }

    @Override // D.InterfaceC0064f
    public void c(n1.d dVar, int i7, int[] iArr, n1.n nVar, int[] iArr2) {
        switch (this.f1302a) {
            case 0:
                AbstractC0068i.b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC0068i.c(i7, iArr, iArr2, false);
                break;
            case 2:
            default:
                if (nVar != n1.n.f14521o) {
                    AbstractC0068i.c(i7, iArr, iArr2, true);
                } else {
                    AbstractC0068i.b(iArr, iArr2, false);
                }
                break;
            case 3:
                if (nVar != n1.n.f14521o) {
                    AbstractC0068i.b(iArr, iArr2, true);
                } else {
                    AbstractC0068i.c(i7, iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f1302a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#Bottom";
            case 3:
                return "Arrangement#End";
            case 4:
                return "Arrangement#Start";
            case 5:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
