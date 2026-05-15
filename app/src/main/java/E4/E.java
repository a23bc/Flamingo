package E4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0115m implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f1863p;

    public E(Object obj, Object obj2) {
        this.f1862o = obj;
        this.f1863p = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1862o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1863p;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
