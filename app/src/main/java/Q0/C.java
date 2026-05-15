package Q0;

import O0.InterfaceC0296a0;
import java.util.Map;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC0296a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0296a0 f5772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5774c;

    public C(InterfaceC0296a0 interfaceC0296a0, D d4) {
        this.f5772a = interfaceC0296a0;
        B b7 = d4.f5779h0;
        AbstractC1209k.c(b7);
        this.f5773b = b7.f5416o;
        B b8 = d4.f5779h0;
        AbstractC1209k.c(b8);
        this.f5774c = b8.f5417p;
    }

    @Override // O0.InterfaceC0296a0
    public final Map a() {
        return this.f5772a.a();
    }

    @Override // O0.InterfaceC0296a0
    public final void b() {
        this.f5772a.b();
    }

    @Override // O0.InterfaceC0296a0
    public final int c() {
        return this.f5774c;
    }

    @Override // O0.InterfaceC0296a0
    public final InterfaceC1182c d() {
        return this.f5772a.d();
    }

    @Override // O0.InterfaceC0296a0
    public final int e() {
        return this.f5773b;
    }
}
