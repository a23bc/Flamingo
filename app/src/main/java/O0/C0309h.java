package O0;

import java.util.Map;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: O0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0309h implements InterfaceC0296a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f5396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K0.A f5397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f5398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0298b0 f5399g;

    public /* synthetic */ C0309h(int i7, int i8, Map map, K0.A a4, InterfaceC1182c interfaceC1182c, InterfaceC0298b0 interfaceC0298b0, int i9) {
        this.f5393a = i9;
        this.f5398f = interfaceC1182c;
        this.f5399g = interfaceC0298b0;
        this.f5394b = i7;
        this.f5395c = i8;
        this.f5396d = map;
        this.f5397e = a4;
    }

    @Override // O0.InterfaceC0296a0
    public final Map a() {
        switch (this.f5393a) {
        }
        return this.f5396d;
    }

    @Override // O0.InterfaceC0296a0
    public final void b() {
        switch (this.f5393a) {
            case 0:
                ((p0) this.f5398f).b(((C0311i) this.f5399g).f5401o.f5887z);
                break;
            default:
                this.f5398f.b(((Q0.T) this.f5399g).f5887z);
                break;
        }
    }

    @Override // O0.InterfaceC0296a0
    public final int c() {
        switch (this.f5393a) {
        }
        return this.f5395c;
    }

    @Override // O0.InterfaceC0296a0
    public final InterfaceC1182c d() {
        switch (this.f5393a) {
        }
        return this.f5397e;
    }

    @Override // O0.InterfaceC0296a0
    public final int e() {
        switch (this.f5393a) {
        }
        return this.f5394b;
    }
}
