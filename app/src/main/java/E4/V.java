package E4;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class V implements D4.j, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1894o;

    public V() {
        AbstractC0119q.d(2, "expectedValuesPerKey");
        this.f1894o = 2;
    }

    @Override // D4.j
    public final Object get() {
        return new ArrayList(this.f1894o);
    }
}
