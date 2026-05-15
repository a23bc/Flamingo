package q4;

import e4.C0859h;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f15589a;

    public e(h hVar) {
        this.f15589a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return AbstractC1209k.a(this.f15589a, ((e) obj).f15589a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15589a.hashCode();
    }

    @Override // q4.i
    public final Object k(C0859h c0859h) {
        return this.f15589a;
    }
}
