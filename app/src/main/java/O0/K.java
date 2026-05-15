package O0;

import Q0.C0364u;
import java.util.Map;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC0296a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f5329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K0.A f5330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f5331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S f5332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f5333g;

    public K(int i7, int i8, Map map, K0.A a4, L l, S s7, InterfaceC1182c interfaceC1182c) {
        this.f5327a = i7;
        this.f5328b = i8;
        this.f5329c = map;
        this.f5330d = a4;
        this.f5331e = l;
        this.f5332f = s7;
        this.f5333g = interfaceC1182c;
    }

    @Override // O0.InterfaceC0296a0
    public final Map a() {
        return this.f5329c;
    }

    @Override // O0.InterfaceC0296a0
    public final void b() {
        C0364u c0364u;
        boolean zS = this.f5331e.s();
        InterfaceC1182c interfaceC1182c = this.f5333g;
        S s7 = this.f5332f;
        if (!zS || (c0364u = s7.f5355o.f5821T.f6002c.f6084g0) == null) {
            interfaceC1182c.b(s7.f5355o.f5821T.f6002c.f5887z);
        } else {
            interfaceC1182c.b(c0364u.f5887z);
        }
    }

    @Override // O0.InterfaceC0296a0
    public final int c() {
        return this.f5328b;
    }

    @Override // O0.InterfaceC0296a0
    public final InterfaceC1182c d() {
        return this.f5330d;
    }

    @Override // O0.InterfaceC0296a0
    public final int e() {
        return this.f5327a;
    }
}
