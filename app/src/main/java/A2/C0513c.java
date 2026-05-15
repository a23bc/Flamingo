package a2;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: a2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0513c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8835a;

    public C0513c(String str) {
        this.f8835a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0513c) {
            return AbstractC1209k.a(this.f8835a, ((C0513c) obj).f8835a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8835a.hashCode();
    }

    public final String toString() {
        return this.f8835a;
    }
}
