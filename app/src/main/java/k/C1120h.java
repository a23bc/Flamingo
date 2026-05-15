package k;

import android.view.LayoutInflater;
import com.blankj.utilcode.util.UtilsTransActivity;
import d.AbstractActivityC0759l;
import f.InterfaceC0872a;

/* JADX INFO: renamed from: k.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1120h implements InterfaceC0872a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UtilsTransActivity f13915a;

    public C1120h(UtilsTransActivity utilsTransActivity) {
        this.f13915a = utilsTransActivity;
    }

    @Override // f.InterfaceC0872a
    public final void a(AbstractActivityC0759l abstractActivityC0759l) {
        UtilsTransActivity utilsTransActivity = this.f13915a;
        o oVarL = utilsTransActivity.l();
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) oVarL;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C1111A.f13825y);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C1111A);
        } else {
            boolean z6 = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C1111A;
        }
        ((V.o) utilsTransActivity.f10786r.f7343q).f("androidx:appcompat");
        oVarL.b();
    }
}
