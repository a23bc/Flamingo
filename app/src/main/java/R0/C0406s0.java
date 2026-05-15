package R0;

import java.util.Map;
import l5.InterfaceC1180a;
import o0.C1252i;
import o0.InterfaceC1250g;
import o0.InterfaceC1251h;

/* JADX INFO: renamed from: R0.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0406s0 implements InterfaceC1251h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1252i f6528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0410u0 f6529p;

    public C0406s0(C1252i c1252i, C0410u0 c0410u0) {
        this.f6528o = c1252i;
        this.f6529p = c0410u0;
    }

    @Override // o0.InterfaceC1251h
    public final boolean c(Object obj) {
        return this.f6528o.c(obj);
    }

    @Override // o0.InterfaceC1251h
    public final InterfaceC1250g d(String str, InterfaceC1180a interfaceC1180a) {
        return this.f6528o.d(str, interfaceC1180a);
    }

    @Override // o0.InterfaceC1251h
    public final Map e() {
        return this.f6528o.e();
    }

    @Override // o0.InterfaceC1251h
    public final Object f(String str) {
        return this.f6528o.f(str);
    }
}
