package androidx.glance.appwidget.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: c */
    public static final M f9581c = new M();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f9583b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final B f9582a = new B();

    public final P a(Class cls) {
        P pX;
        Class cls2;
        AbstractC0572u.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f9583b;
        P p7 = (P) concurrentHashMap.get(cls);
        if (p7 != null) {
            return p7;
        }
        B b7 = this.f9582a;
        b7.getClass();
        Class cls3 = Q.f9591a;
        if (!r.class.isAssignableFrom(cls) && (cls2 = Q.f9591a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        O oA = ((A) b7.f9557a).a(cls);
        if ((oA.f9590d & 2) == 2) {
            boolean zIsAssignableFrom = r.class.isAssignableFrom(cls);
            r rVar = oA.f9587a;
            if (zIsAssignableFrom) {
                pX = new I(Q.f9593c, AbstractC0565m.f9645a, rVar);
            } else {
                U u7 = Q.f9592b;
                C0564l c0564l = AbstractC0565m.f9646b;
                if (c0564l == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                pX = new I(u7, c0564l, rVar);
            }
        } else if (r.class.isAssignableFrom(cls)) {
            C0564l c0564l2 = null;
            J j3 = K.f9580b;
            C0576y c0576y = AbstractC0577z.f9671b;
            U u8 = Q.f9593c;
            if (AbstractC1676i.b(oA.a()) != 1) {
                c0564l2 = AbstractC0565m.f9645a;
            }
            C0564l c0564l3 = c0564l2;
            D d4 = E.f9561b;
            int[] iArr = H.f9563n;
            if (!(oA instanceof O)) {
                oA.getClass();
                throw new ClassCastException();
            }
            pX = H.x(oA, j3, c0576y, u8, c0564l3, d4);
        } else {
            C0564l c0564l4 = null;
            J j7 = K.f9579a;
            C0576y c0576y2 = AbstractC0577z.f9670a;
            U u9 = Q.f9592b;
            if (AbstractC1676i.b(oA.a()) != 1 && (c0564l4 = AbstractC0565m.f9646b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0564l c0564l5 = c0564l4;
            D d7 = E.f9560a;
            int[] iArr2 = H.f9563n;
            if (!(oA instanceof O)) {
                oA.getClass();
                throw new ClassCastException();
            }
            pX = H.x(oA, j7, c0576y2, u9, c0564l5, d7);
        }
        P p8 = (P) concurrentHashMap.putIfAbsent(cls, pX);
        return p8 != null ? p8 : pX;
    }
}
