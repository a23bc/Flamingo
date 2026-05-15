package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0580c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f9734b;

    public C0580c(int i7, Method method) {
        this.f9733a = i7;
        this.f9734b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0580c)) {
            return false;
        }
        C0580c c0580c = (C0580c) obj;
        return this.f9733a == c0580c.f9733a && this.f9734b.getName().equals(c0580c.f9734b.getName());
    }

    public final int hashCode() {
        return this.f9734b.getName().hashCode() + (this.f9733a * 31);
    }
}
