package R0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0922y;
import java.util.Set;
import m5.AbstractC1210l;
import n5.InterfaceC1237a;
import n5.InterfaceC1242f;
import q0.AbstractC1356e;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l1 f6477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0.d f6478r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(l1 l1Var, n0.d dVar, int i7) {
        super(2);
        this.f6476p = i7;
        this.f6477q = l1Var;
        this.f6478r = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6476p) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(this.f6477q.f6480o, this.f6478r, c0912t, 0);
                } else {
                    c0912t.Q();
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                boolean z6 = false;
                if (c0912t2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l1 l1Var = this.f6477q;
                    Object tag = l1Var.f6480o.getTag(R.id.inspection_slot_table_set);
                    if ((tag instanceof Set) && (!(tag instanceof InterfaceC1237a) || (tag instanceof InterfaceC1242f))) {
                        z6 = true;
                    }
                    Set set = z6 ? (Set) tag : null;
                    C0415x c0415x = l1Var.f6480o;
                    if (set == null) {
                        Object parent = c0415x.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC1237a) && !(tag2 instanceof InterfaceC1242f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        C0922y c0922y = c0912t2.f11892U;
                        if (c0922y == null) {
                            c0922y = new C0922y(c0912t2.h);
                            c0912t2.f11892U = c0922y;
                        }
                        set.add(c0922y);
                        c0912t2.f11907q = true;
                        c0912t2.f11874C = true;
                        c0912t2.f11895c.c();
                        c0912t2.f11879H.c();
                        f0.L0 l02 = c0912t2.f11880I;
                        f0.I0 i02 = l02.f11694a;
                        l02.f11698e = i02.f11688x;
                        l02.f11699f = i02.f11689y;
                    }
                    boolean zH = c0912t2.h(l1Var);
                    Object objK = c0912t2.K();
                    f0.W w7 = C0903o.f11850a;
                    if (zH || objK == w7) {
                        objK = new i1(l1Var, null);
                        c0912t2.i0(objK);
                    }
                    C0879c.e(c0912t2, c0415x, (l5.e) objK);
                    boolean zH2 = c0912t2.h(l1Var);
                    Object objK2 = c0912t2.K();
                    if (zH2 || objK2 == w7) {
                        objK2 = new j1(l1Var, null);
                        c0912t2.i0(objK2);
                    }
                    C0879c.e(c0912t2, c0415x, (l5.e) objK2);
                    C0879c.a(AbstractC1356e.f15444a.a(set), n0.e.e(-280240369, new k1(l1Var, this.f6478r, 0), c0912t2), c0912t2, 56);
                } else {
                    c0912t2.Q();
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
