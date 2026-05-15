package b1;

import java.util.Comparator;

/* JADX INFO: renamed from: b1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0621f implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9968o;

    public /* synthetic */ C0621f(int i7) {
        this.f9968o = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9968o) {
        }
        return N5.l.r(Integer.valueOf(((C0620e) obj).f9965b), Integer.valueOf(((C0620e) obj2).f9965b));
    }
}
