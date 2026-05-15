package R0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.InterfaceC0906p0;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: R0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0402q extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q */
    public static final C0402q f6496q = new C0402q(1, 0);

    /* JADX INFO: renamed from: r */
    public static final C0402q f6497r = new C0402q(1, 1);

    /* JADX INFO: renamed from: s */
    public static final C0402q f6498s = new C0402q(1, 2);

    /* JADX INFO: renamed from: t */
    public static final C0402q f6499t = new C0402q(1, 3);

    /* JADX INFO: renamed from: u */
    public static final C0402q f6500u = new C0402q(1, 4);

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f6501p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0402q(int i7, int i8) {
        super(i7);
        this.f6501p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f6501p) {
            case 0:
                return Y4.o.f8736a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                f0.D d4 = AndroidCompositionLocals_androidKt.f9323a;
                n0.i iVar = (n0.i) ((InterfaceC0906p0) obj);
                iVar.getClass();
                C0879c.v(iVar, d4);
                return ((Context) C0879c.v(iVar, AndroidCompositionLocals_androidKt.f9324b)).getResources();
            default:
                return Boolean.valueOf(M.r(obj));
        }
    }
}
