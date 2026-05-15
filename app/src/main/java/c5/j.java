package c5;

import java.io.Serializable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f10685o = new j();

    @Override // c5.i
    public final i h(i iVar) {
        AbstractC1209k.f(iVar, "context");
        return iVar;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // c5.i
    public final g n(h hVar) {
        AbstractC1209k.f(hVar, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // c5.i
    public final i u(h hVar) {
        AbstractC1209k.f(hVar, "key");
        return this;
    }

    @Override // c5.i
    public final Object y(Object obj, l5.e eVar) {
        return obj;
    }
}
