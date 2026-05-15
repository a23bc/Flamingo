package f0;

import L2.C0247a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import m5.AbstractC1209k;
import m5.AbstractC1223y;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0918w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f11863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f11864e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0894j0 f11865f = new C0894j0(n0.i.f14490r, W.f11765r);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0912t f11866g;

    public r(C0912t c0912t, long j3, boolean z6, boolean z7, C0247a c0247a) {
        this.f11866g = c0912t;
        this.f11860a = j3;
        this.f11861b = z6;
        this.f11862c = z7;
    }

    @Override // f0.AbstractC0918w
    public final void a(C0924z c0924z, l5.e eVar) {
        this.f11866g.f11894b.a(c0924z, eVar);
    }

    @Override // f0.AbstractC0918w
    public final t.K b(C0924z c0924z, B2.g gVar, l5.e eVar) {
        return this.f11866g.f11894b.b(c0924z, gVar, eVar);
    }

    @Override // f0.AbstractC0918w
    public final void c() {
        C0912t c0912t = this.f11866g;
        c0912t.f11872A--;
    }

    @Override // f0.AbstractC0918w
    public final boolean d() {
        return this.f11866g.f11894b.d();
    }

    @Override // f0.AbstractC0918w
    public final boolean e() {
        return this.f11861b;
    }

    @Override // f0.AbstractC0918w
    public final boolean f() {
        return this.f11862c;
    }

    @Override // f0.AbstractC0918w
    public final long g() {
        return this.f11860a;
    }

    @Override // f0.AbstractC0918w
    public final InterfaceC0916v h() {
        return this.f11866g.h;
    }

    @Override // f0.AbstractC0918w
    public final InterfaceC0906p0 i() {
        return (InterfaceC0906p0) this.f11865f.getValue();
    }

    @Override // f0.AbstractC0918w
    public final c5.i j() {
        return this.f11866g.f11894b.j();
    }

    @Override // f0.AbstractC0918w
    public final void k(C0924z c0924z) {
        C0912t c0912t = this.f11866g;
        c0912t.f11894b.k(c0912t.h);
        c0912t.f11894b.k(c0924z);
    }

    @Override // f0.AbstractC0918w
    public final Z l(AbstractC0876a0 abstractC0876a0) {
        return this.f11866g.f11894b.l(abstractC0876a0);
    }

    @Override // f0.AbstractC0918w
    public final t.K m(C0924z c0924z, B2.g gVar, t.K k7) {
        return this.f11866g.f11894b.m(c0924z, gVar, k7);
    }

    @Override // f0.AbstractC0918w
    public final void n(Set set) {
        HashSet hashSet = this.f11863d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f11863d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // f0.AbstractC0918w
    public final void o(C0912t c0912t) {
        this.f11864e.add(c0912t);
    }

    @Override // f0.AbstractC0918w
    public final void p(C0915u0 c0915u0) {
        this.f11866g.f11894b.p(c0915u0);
    }

    @Override // f0.AbstractC0918w
    public final void q(C0924z c0924z) {
        this.f11866g.f11894b.q(c0924z);
    }

    @Override // f0.AbstractC0918w
    public final void r() {
        this.f11866g.f11872A++;
    }

    @Override // f0.AbstractC0918w
    public final void s(C0912t c0912t) {
        HashSet<Set> hashSet = this.f11863d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                AbstractC1209k.d(c0912t, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c0912t.f11895c);
            }
        }
        LinkedHashSet linkedHashSet = this.f11864e;
        AbstractC1223y.a(linkedHashSet);
        linkedHashSet.remove(c0912t);
    }

    @Override // f0.AbstractC0918w
    public final void t(C0924z c0924z) {
        this.f11866g.f11894b.t(c0924z);
    }

    public final void u() {
        LinkedHashSet<C0912t> linkedHashSet = this.f11864e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f11863d;
        if (hashSet != null) {
            for (C0912t c0912t : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0912t.f11895c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
