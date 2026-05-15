package z4;

import f0.C0879c;
import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: z4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2092k implements InterfaceC2098q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2091j f21226b = new C2091j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2091j f21227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2091j f21228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2091j f21229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2091j f21230f;

    public C2092k() {
        C2091j c2091j = new C2091j();
        this.f21227c = c2091j;
        C2091j c2091j2 = new C2091j();
        this.f21228d = c2091j2;
        this.f21229e = new C2091j();
        this.f21230f = new C2091j();
        InterfaceC2097p[] interfaceC2097pArr = (InterfaceC2097p[]) Arrays.copyOf(new InterfaceC2097p[]{c2091j2, c2091j}, 2);
        AbstractC1209k.f(interfaceC2097pArr, "types");
        C0879c.o(new C2082a(interfaceC2097pArr, 4));
        C0879c.o(new C2082a(interfaceC2097pArr, 0));
        C0879c.o(new C2082a(interfaceC2097pArr, 3));
        C0879c.o(new C2082a(interfaceC2097pArr, 2));
        C0879c.o(new C2082a(interfaceC2097pArr, 1));
    }

    @Override // z4.InterfaceC2098q
    public final InterfaceC2097p a() {
        return this.f21228d;
    }

    @Override // z4.InterfaceC2098q
    public final InterfaceC2097p b() {
        return this.f21227c;
    }
}
