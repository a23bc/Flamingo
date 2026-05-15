package o0;

import C2.I;
import V.o;
import android.os.Bundle;
import androidx.lifecycle.C0599w;
import androidx.lifecycle.K;
import java.util.Map;
import l5.InterfaceC1180a;

/* JADX INFO: renamed from: o0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1254k implements InterfaceC1251h, E3.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1252i f14650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f14651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0599w f14652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f14653r;

    public C1254k(C1252i c1252i) {
        this.f14650o = c1252i;
        o oVar = new o(new I(this, new E3.e(0, this)));
        this.f14651p = oVar;
        this.f14652q = new C0599w(this, false);
        this.f14653r = (o) oVar.f7343q;
        Object objF = c1252i.f("androidx.savedstate.SavedStateRegistry");
        oVar.D(objF instanceof Bundle ? (Bundle) objF : null);
        c1252i.d("androidx.savedstate.SavedStateRegistry", new E3.e(26, this));
    }

    @Override // E3.f
    public final o b() {
        return this.f14653r;
    }

    @Override // o0.InterfaceC1251h
    public final boolean c(Object obj) {
        return this.f14650o.c(obj);
    }

    @Override // o0.InterfaceC1251h
    public final InterfaceC1250g d(String str, InterfaceC1180a interfaceC1180a) {
        return this.f14650o.d(str, interfaceC1180a);
    }

    @Override // o0.InterfaceC1251h
    public final Map e() {
        return this.f14650o.e();
    }

    @Override // o0.InterfaceC1251h
    public final Object f(String str) {
        return this.f14650o.f(str);
    }

    @Override // androidx.lifecycle.InterfaceC0597u
    public final K h() {
        return this.f14652q;
    }
}
