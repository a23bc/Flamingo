package B5;

import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1765B {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c5.i f885o;

    public d(c5.i iVar) {
        this.f885o = iVar;
    }

    @Override // w5.InterfaceC1765B
    public final c5.i g() {
        return this.f885o;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f885o + ')';
    }
}
