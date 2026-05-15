package androidx.lifecycle;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0598v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0593p f9752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0595s f9753b;

    public final void a(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        EnumC0593p enumC0593pA = enumC0592o.a();
        EnumC0593p enumC0593p = this.f9752a;
        AbstractC1209k.f(enumC0593p, "state1");
        if (enumC0593pA.compareTo(enumC0593p) < 0) {
            enumC0593p = enumC0593pA;
        }
        this.f9752a = enumC0593p;
        this.f9753b.g(interfaceC0597u, enumC0592o);
        this.f9752a = enumC0593pA;
    }
}
