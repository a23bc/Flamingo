package e5;

import m5.AbstractC1209k;
import m5.AbstractC1221w;
import m5.C1222x;
import m5.InterfaceC1206h;

/* JADX INFO: renamed from: e5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0870h extends AbstractC0869g implements InterfaceC1206h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11604o;

    public AbstractC0870h(c5.d dVar) {
        super(dVar);
        this.f11604o = 2;
    }

    @Override // m5.InterfaceC1206h
    public final int getArity() {
        return this.f11604o;
    }

    @Override // e5.AbstractC0863a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        AbstractC1221w.f14440a.getClass();
        String strA = C1222x.a(this);
        AbstractC1209k.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
