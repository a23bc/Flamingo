package G1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class A implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m0 f2634a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0147n f2636c;

    public A(View view, InterfaceC0147n interfaceC0147n) {
        this.f2635b = view;
        this.f2636c = interfaceC0147n;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m0 m0VarC = m0.c(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        InterfaceC0147n interfaceC0147n = this.f2636c;
        if (i7 < 30) {
            B.a(windowInsets, this.f2635b);
            if (m0VarC.equals(this.f2634a)) {
                return interfaceC0147n.j(view, m0VarC).b();
            }
        }
        this.f2634a = m0VarC;
        m0 m0VarJ = interfaceC0147n.j(view, m0VarC);
        if (i7 >= 30) {
            return m0VarJ.b();
        }
        WeakHashMap weakHashMap = I.f2641a;
        AbstractC0158z.c(view);
        return m0VarJ.b();
    }
}
