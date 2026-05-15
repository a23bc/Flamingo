package d;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0593p;
import androidx.lifecycle.InterfaceC0597u;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0743I {

    /* JADX INFO: renamed from: a */
    public final Runnable f10737a;

    /* JADX INFO: renamed from: b */
    public final Z4.k f10738b = new Z4.k();

    /* JADX INFO: renamed from: c */
    public AbstractC0773z f10739c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f10740d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f10741e;

    /* JADX INFO: renamed from: f */
    public boolean f10742f;

    /* JADX INFO: renamed from: g */
    public boolean f10743g;

    public C0743I(Runnable runnable) {
        this.f10737a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f10740d = i7 >= 34 ? C0740F.f10730a.a(new C0735A(this, 0), new C0735A(this, 1), new C0736B(this, 0), new C0736B(this, 1)) : C0738D.f10725a.a(new C0736B(this, 2));
        }
    }

    public final void a(InterfaceC0597u interfaceC0597u, AbstractC0773z abstractC0773z) {
        AbstractC1209k.f(interfaceC0597u, "owner");
        AbstractC1209k.f(abstractC0773z, "onBackPressedCallback");
        androidx.lifecycle.K kH = interfaceC0597u.h();
        if (kH.i() == EnumC0593p.f9745o) {
            return;
        }
        abstractC0773z.f10812b.add(new C0741G(this, kH, abstractC0773z));
        e();
        abstractC0773z.f10813c = new R.o(0, this, C0743I.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 2);
    }

    public final void b() {
        Object objPrevious;
        if (this.f10739c == null) {
            Z4.k kVar = this.f10738b;
            ListIterator<E> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC0773z) objPrevious).f10811a) {
                        break;
                    }
                }
            }
        }
        this.f10739c = null;
    }

    public final void c() {
        Object objPrevious;
        AbstractC0773z abstractC0773z = this.f10739c;
        if (abstractC0773z == null) {
            Z4.k kVar = this.f10738b;
            ListIterator listIterator = kVar.listIterator(kVar.b());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC0773z) objPrevious).f10811a) {
                        break;
                    }
                }
            }
            abstractC0773z = (AbstractC0773z) objPrevious;
        }
        this.f10739c = null;
        if (abstractC0773z != null) {
            abstractC0773z.a();
        } else {
            this.f10737a.run();
        }
    }

    public final void d(boolean z6) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f10741e;
        OnBackInvokedCallback onBackInvokedCallback = this.f10740d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0738D c0738d = C0738D.f10725a;
        if (z6 && !this.f10742f) {
            c0738d.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f10742f = true;
        } else {
            if (z6 || !this.f10742f) {
                return;
            }
            c0738d.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f10742f = false;
        }
    }

    public final void e() {
        boolean z6 = this.f10743g;
        Z4.k kVar = this.f10738b;
        boolean z7 = false;
        if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC0773z) it.next()).f10811a) {
                    z7 = true;
                    break;
                }
            }
        }
        this.f10743g = z7;
        if (z7 == z6 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z7);
    }
}
