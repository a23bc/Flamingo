package n0;

import f0.C0;
import f0.D0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g implements C0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f14487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0.e f14488p = new h0.e(new D0[16]);

    public g(Set set) {
        this.f14487o = set;
    }

    @Override // f0.C0
    public final void a() {
        h0.e eVar = this.f14488p;
        Object[] objArr = eVar.f12546o;
        int i7 = eVar.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            C0 c02 = ((D0) objArr[i8]).f11647a;
            this.f14487o.remove(c02);
            c02.a();
        }
    }

    @Override // f0.C0
    public final void e() {
    }

    @Override // f0.C0
    public final void f() {
    }
}
