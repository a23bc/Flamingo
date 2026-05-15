package D;

import G1.InterfaceC0147n;
import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class W extends G1.P implements Runnable, InterfaceC0147n, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q */
    public final z0 f1277q;

    /* JADX INFO: renamed from: r */
    public boolean f1278r;

    /* JADX INFO: renamed from: s */
    public boolean f1279s;

    /* JADX INFO: renamed from: t */
    public G1.m0 f1280t;

    public W(z0 z0Var) {
        super(!z0Var.f1438r ? 1 : 0);
        this.f1277q = z0Var;
    }

    @Override // G1.P
    public final void d(G1.Z z6) {
        this.f1278r = false;
        this.f1279s = false;
        G1.m0 m0Var = this.f1280t;
        if (z6.f2681a.a() > 0 && m0Var != null) {
            z0 z0Var = this.f1277q;
            z0Var.getClass();
            G1.j0 j0Var = m0Var.f2725a;
            z0Var.f1437q.f(AbstractC0060d.n(j0Var.g(8)));
            z0Var.f1436p.f(AbstractC0060d.n(j0Var.g(8)));
            z0.a(z0Var, m0Var);
        }
        this.f1280t = null;
    }

    @Override // G1.P
    public final void e(G1.Z z6) {
        this.f1278r = true;
        this.f1279s = true;
    }

    @Override // G1.P
    public final G1.m0 f(G1.m0 m0Var, List list) {
        z0 z0Var = this.f1277q;
        z0.a(z0Var, m0Var);
        return z0Var.f1438r ? G1.m0.f2724b : m0Var;
    }

    @Override // G1.P
    public final V.o g(G1.Z z6, V.o oVar) {
        this.f1278r = false;
        return oVar;
    }

    @Override // G1.InterfaceC0147n
    public final G1.m0 j(View view, G1.m0 m0Var) {
        this.f1280t = m0Var;
        z0 z0Var = this.f1277q;
        z0Var.getClass();
        G1.j0 j0Var = m0Var.f2725a;
        z0Var.f1436p.f(AbstractC0060d.n(j0Var.g(8)));
        if (this.f1278r) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f1279s) {
            z0Var.f1437q.f(AbstractC0060d.n(j0Var.g(8)));
            z0.a(z0Var, m0Var);
        }
        return z0Var.f1438r ? G1.m0.f2724b : m0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1278r) {
            this.f1278r = false;
            this.f1279s = false;
            G1.m0 m0Var = this.f1280t;
            if (m0Var != null) {
                z0 z0Var = this.f1277q;
                z0Var.getClass();
                z0Var.f1437q.f(AbstractC0060d.n(m0Var.f2725a.g(8)));
                z0.a(z0Var, m0Var);
                this.f1280t = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
