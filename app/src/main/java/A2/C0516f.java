package a2;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: a2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0516f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8836a;

    public C0516f(LinkedHashMap linkedHashMap) {
        this.f8836a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0516f) {
            return this.f8836a.equals(((C0516f) obj).f8836a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8836a.hashCode();
    }

    public final String toString() {
        return this.f8836a.toString();
    }
}
