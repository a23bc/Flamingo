package w5;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: w5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1804w implements c5.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC1210l f19577o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c5.h f19578p;

    /* JADX WARN: Multi-variable type inference failed */
    public C1804w(c5.h hVar, InterfaceC1182c interfaceC1182c) {
        AbstractC1209k.f(hVar, "baseKey");
        this.f19577o = (AbstractC1210l) interfaceC1182c;
        this.f19578p = hVar instanceof C1804w ? ((C1804w) hVar).f19578p : hVar;
    }
}
