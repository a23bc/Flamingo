package e5;

import m5.AbstractC1209k;
import m5.AbstractC1221w;
import m5.C1222x;
import m5.InterfaceC1206h;

/* JADX INFO: renamed from: e5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0871i extends AbstractC0865c implements InterfaceC1206h {
    private final int arity;

    public AbstractC0871i(int i7, c5.d dVar) {
        super(dVar);
        this.arity = i7;
    }

    @Override // m5.InterfaceC1206h
    public int getArity() {
        return this.arity;
    }

    @Override // e5.AbstractC0863a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        AbstractC1221w.f14440a.getClass();
        String strA = C1222x.a(this);
        AbstractC1209k.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
