package T1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.InterfaceC0583f;
import androidx.lifecycle.InterfaceC0597u;
import androidx.lifecycle.K;
import m5.AbstractC1209k;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC0583f {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f6868o = 0;

    /* JADX INFO: renamed from: p */
    public final K f6869p;

    /* JADX INFO: renamed from: q */
    public final Object f6870q;

    public k(K k7, InterfaceC1786g0 interfaceC1786g0) {
        this.f6869p = k7;
        this.f6870q = interfaceC1786g0;
    }

    private final /* synthetic */ void a(InterfaceC0597u interfaceC0597u) {
    }

    private final /* synthetic */ void e(InterfaceC0597u interfaceC0597u) {
    }

    private final /* synthetic */ void f(InterfaceC0597u interfaceC0597u) {
    }

    private final /* synthetic */ void k(InterfaceC0597u interfaceC0597u) {
    }

    private final /* synthetic */ void l(InterfaceC0597u interfaceC0597u) {
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final void b(InterfaceC0597u interfaceC0597u) {
        switch (this.f6868o) {
            case 0:
                ((EmojiCompatInitializer) this.f6870q).getClass();
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new C1.a(2), 500L);
                this.f6869p.l(this);
                break;
            default:
                AbstractC1209k.f(interfaceC0597u, "owner");
                break;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final void c(InterfaceC0597u interfaceC0597u) {
        switch (this.f6868o) {
            case 0:
                break;
            default:
                ((InterfaceC1786g0) this.f6870q).c(null);
                break;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final /* synthetic */ void d(InterfaceC0597u interfaceC0597u) {
        int i7 = this.f6868o;
        Z1.l.c(interfaceC0597u);
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final /* synthetic */ void h(InterfaceC0597u interfaceC0597u) {
        int i7 = this.f6868o;
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final void i(InterfaceC0597u interfaceC0597u) {
        switch (this.f6868o) {
            case 0:
                AbstractC1209k.f(interfaceC0597u, "owner");
                break;
            default:
                AbstractC1209k.f(interfaceC0597u, "owner");
                break;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final /* synthetic */ void j(InterfaceC0597u interfaceC0597u) {
        int i7 = this.f6868o;
    }

    public k(EmojiCompatInitializer emojiCompatInitializer, K k7) {
        this.f6870q = emojiCompatInitializer;
        this.f6869p = k7;
    }
}
