package d;

import a.AbstractC0509a;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.InterfaceC0595s;
import androidx.lifecycle.InterfaceC0597u;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0772y implements InterfaceC0595s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Y4.m f10809p = AbstractC0509a.O(C0769v.f10804p);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractActivityC0759l f10810o;

    public C0772y(AbstractActivityC0759l abstractActivityC0759l) {
        this.f10810o = abstractActivityC0759l;
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        if (enumC0592o != EnumC0592o.ON_DESTROY) {
            return;
        }
        Object systemService = this.f10810o.getSystemService("input_method");
        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        AbstractC0768u abstractC0768u = (AbstractC0768u) f10809p.getValue();
        Object objB = abstractC0768u.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = abstractC0768u.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = abstractC0768u.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
