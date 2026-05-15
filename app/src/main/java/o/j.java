package o;

import G1.N;
import a.AbstractC0509a;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c */
    public BaseInterpolator f14619c;

    /* JADX INFO: renamed from: d */
    public AbstractC0509a f14620d;

    /* JADX INFO: renamed from: e */
    public boolean f14621e;

    /* JADX INFO: renamed from: b */
    public long f14618b = -1;

    /* JADX INFO: renamed from: f */
    public final i f14622f = new i(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f14617a = new ArrayList();

    public final void a() {
        if (this.f14621e) {
            Iterator it = this.f14617a.iterator();
            while (it.hasNext()) {
                ((N) it.next()).b();
            }
            this.f14621e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f14621e) {
            return;
        }
        for (N n7 : this.f14617a) {
            long j3 = this.f14618b;
            if (j3 >= 0) {
                n7.c(j3);
            }
            BaseInterpolator baseInterpolator = this.f14619c;
            if (baseInterpolator != null && (view = (View) n7.f2652a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f14620d != null) {
                n7.d(this.f14622f);
            }
            View view2 = (View) n7.f2652a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f14621e = true;
    }
}
