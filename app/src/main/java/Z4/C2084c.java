package z4;

import f0.C0879c;
import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: z4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2084c implements InterfaceC2098q {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2097p f21199b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2097p f21200c;

    public C2084c() {
        C2096o c2096o = InterfaceC2097p.f21237n;
        c2096o.getClass();
        C2085d c2085d = C2096o.f21236b;
        c2096o.getClass();
        c2096o.getClass();
        c2096o.getClass();
        c2096o.getClass();
        AbstractC1209k.f(c2085d, "systemGestures");
        AbstractC1209k.f(c2085d, "navigationBars");
        AbstractC1209k.f(c2085d, "statusBars");
        AbstractC1209k.f(c2085d, "ime");
        AbstractC1209k.f(c2085d, "displayCutout");
        this.f21199b = c2085d;
        this.f21200c = c2085d;
        InterfaceC2097p[] interfaceC2097pArr = (InterfaceC2097p[]) Arrays.copyOf(new InterfaceC2097p[]{c2085d, c2085d}, 2);
        AbstractC1209k.f(interfaceC2097pArr, "types");
        C0879c.o(new C2082a(interfaceC2097pArr, 4));
        C0879c.o(new C2082a(interfaceC2097pArr, 0));
        C0879c.o(new C2082a(interfaceC2097pArr, 3));
        C0879c.o(new C2082a(interfaceC2097pArr, 2));
        C0879c.o(new C2082a(interfaceC2097pArr, 1));
    }

    @Override // z4.InterfaceC2098q
    public final InterfaceC2097p a() {
        return this.f21200c;
    }

    @Override // z4.InterfaceC2098q
    public final InterfaceC2097p b() {
        return this.f21199b;
    }
}
