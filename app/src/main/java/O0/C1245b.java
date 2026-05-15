package o0;

import android.app.PendingIntent;
import f0.C0;
import f0.W;
import p0.n;

/* JADX INFO: renamed from: o0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1245b implements C0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1255l f14629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC1251h f14630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f14631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f14632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f14633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC1250g f14634t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final E3.e f14635u = new E3.e(25, this);

    public C1245b(InterfaceC1255l interfaceC1255l, InterfaceC1251h interfaceC1251h, String str, Object obj, Object[] objArr) {
        this.f14629o = interfaceC1255l;
        this.f14630p = interfaceC1251h;
        this.f14631q = str;
        this.f14632r = obj;
        this.f14633s = objArr;
    }

    @Override // f0.C0
    public final void a() throws PendingIntent.CanceledException {
        b();
    }

    public final void b() throws PendingIntent.CanceledException {
        String strA;
        InterfaceC1251h interfaceC1251h = this.f14630p;
        if (this.f14634t != null) {
            throw new IllegalArgumentException(("entry(" + this.f14634t + ") is not null").toString());
        }
        if (interfaceC1251h != null) {
            E3.e eVar = this.f14635u;
            Object objA = eVar.a();
            if (objA == null || interfaceC1251h.c(objA)) {
                this.f14634t = interfaceC1251h.d(this.f14631q, eVar);
                return;
            }
            if (objA instanceof n) {
                n nVar = (n) objA;
                if (nVar.a() == W.f11764q || nVar.a() == W.f11767t || nVar.a() == W.f11765r) {
                    strA = "MutableState containing " + nVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = AbstractC1256m.a(objA);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // f0.C0
    public final void e() {
        InterfaceC1250g interfaceC1250g = this.f14634t;
        if (interfaceC1250g != null) {
            ((A0.b) interfaceC1250g).q0();
        }
    }

    @Override // f0.C0
    public final void f() {
        InterfaceC1250g interfaceC1250g = this.f14634t;
        if (interfaceC1250g != null) {
            ((A0.b) interfaceC1250g).q0();
        }
    }
}
