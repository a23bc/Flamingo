package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: c */
    public static final U f9421c = new U();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f9423b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final F f9422a = new F();

    public final X a(Class cls) {
        X x6;
        Class cls2;
        AbstractC0548v.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f9423b;
        X x7 = (X) concurrentHashMap.get(cls);
        if (x7 != null) {
            return x7;
        }
        F f7 = this.f9422a;
        f7.getClass();
        Class cls3 = Y.f9431a;
        if (!AbstractC0546t.class.isAssignableFrom(cls) && (cls2 = Y.f9431a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        W wA = ((E) f7.f9391a).a(cls);
        if ((wA.f9430d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0546t.class.isAssignableFrom(cls);
            AbstractC0546t abstractC0546t = wA.f9427a;
            if (zIsAssignableFrom) {
                x6 = new O(Y.f9434d, AbstractC0541n.f9496a, abstractC0546t);
            } else {
                g0 g0Var = Y.f9432b;
                C0540m c0540m = AbstractC0541n.f9497b;
                if (c0540m == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x6 = new O(g0Var, c0540m, abstractC0546t);
            }
        } else if (AbstractC0546t.class.isAssignableFrom(cls)) {
            x6 = (wA.f9430d & 1) == 1 ? N.x(wA, Q.f9420b, D.f9388b, Y.f9434d, AbstractC0541n.f9496a, K.f9399b) : N.x(wA, Q.f9420b, D.f9388b, Y.f9434d, null, K.f9399b);
        } else if ((wA.f9430d & 1) == 1) {
            P p7 = Q.f9419a;
            B b7 = D.f9387a;
            g0 g0Var2 = Y.f9432b;
            C0540m c0540m2 = AbstractC0541n.f9497b;
            if (c0540m2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            x6 = N.x(wA, p7, b7, g0Var2, c0540m2, K.f9398a);
        } else {
            x6 = N.x(wA, Q.f9419a, D.f9387a, Y.f9433c, null, K.f9398a);
        }
        X x8 = (X) concurrentHashMap.putIfAbsent(cls, x6);
        return x8 != null ? x8 : x6;
    }
}
