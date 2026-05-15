package s;

import java.util.HashMap;

/* JADX INFO: renamed from: s.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1424a extends C1429f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f15805s = new HashMap();

    @Override // s.C1429f
    public final C1426c a(Object obj) {
        return (C1426c) this.f15805s.get(obj);
    }

    @Override // s.C1429f
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.f15805s.remove(obj);
        return objB;
    }
}
