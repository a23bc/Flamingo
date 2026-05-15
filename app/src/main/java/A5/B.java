package A5;

import m5.AbstractC1209k;
import z5.H;

/* JADX INFO: loaded from: classes.dex */
public final class B extends z5.y implements H {
    @Override // z5.H
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f21339v;
            AbstractC1209k.c(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f21340w + ((long) ((int) ((o() + ((long) this.f21342y)) - this.f21340w)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i7) {
        synchronized (this) {
            Object[] objArr = this.f21339v;
            AbstractC1209k.c(objArr);
            q(Integer.valueOf(((Number) objArr[((int) ((this.f21340w + ((long) ((int) ((o() + ((long) this.f21342y)) - this.f21340w)))) - 1)) & (objArr.length - 1)]).intValue() + i7));
        }
    }
}
