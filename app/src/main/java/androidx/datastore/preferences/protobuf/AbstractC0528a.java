package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0528a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(X x6) {
        AbstractC0546t abstractC0546t = (AbstractC0546t) this;
        int i7 = abstractC0546t.memoizedSerializedSize;
        if (i7 != -1) {
            return i7;
        }
        int iF = x6.f(this);
        abstractC0546t.memoizedSerializedSize = iF;
        return iF;
    }

    public abstract void c(C0537j c0537j);
}
