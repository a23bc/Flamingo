package m5;

import java.io.Serializable;

/* JADX INFO: renamed from: m5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1210l implements InterfaceC1206h, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f14432o;

    public AbstractC1210l(int i7) {
        this.f14432o = i7;
    }

    @Override // m5.InterfaceC1206h
    public final int getArity() {
        return this.f14432o;
    }

    public final String toString() {
        AbstractC1221w.f14440a.getClass();
        String strA = C1222x.a(this);
        AbstractC1209k.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
