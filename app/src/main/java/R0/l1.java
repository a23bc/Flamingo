package R0;

import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.InterfaceC0595s;
import androidx.lifecycle.InterfaceC0597u;
import f0.C0924z;
import f0.InterfaceC0916v;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements InterfaceC0916v, InterfaceC0595s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0415x f6480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0924z f6481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.K f6483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n0.d f6484s = AbstractC0399o0.f6490a;

    public l1(C0415x c0415x, C0924z c0924z) {
        this.f6480o = c0415x;
        this.f6481p = c0924z;
    }

    @Override // f0.InterfaceC0916v
    public final void a() {
        if (!this.f6482q) {
            this.f6482q = true;
            this.f6480o.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.K k7 = this.f6483r;
            if (k7 != null) {
                k7.l(this);
            }
        }
        this.f6481p.a();
    }

    public final void e(l5.e eVar) {
        this.f6480o.setOnViewTreeOwnersAvailable(new K0.A(this, 10, (n0.d) eVar));
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        if (enumC0592o == EnumC0592o.ON_DESTROY) {
            a();
        } else {
            if (enumC0592o != EnumC0592o.ON_CREATE || this.f6482q) {
                return;
            }
            e(this.f6484s);
        }
    }
}
