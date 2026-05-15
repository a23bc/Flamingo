package b3;

import t2.C1487p;
import t2.I;
import t2.K;

/* JADX INFO: renamed from: b3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0693i implements K {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f10385o;

    public AbstractC0693i(String str) {
        this.f10385o = str;
    }

    @Override // t2.K
    public /* synthetic */ void b(I i7) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // t2.K
    public final /* synthetic */ C1487p i() {
        return null;
    }

    @Override // t2.K
    public final /* synthetic */ byte[] n() {
        return null;
    }

    public String toString() {
        return this.f10385o;
    }
}
