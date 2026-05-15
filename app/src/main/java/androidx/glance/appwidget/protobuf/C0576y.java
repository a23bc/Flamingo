package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0576y {
    public static InterfaceC0571t a(long j3, Object obj) {
        InterfaceC0571t interfaceC0571t = (InterfaceC0571t) Z.f9604c.h(j3, obj);
        if (((AbstractC0554b) interfaceC0571t).f9610o) {
            return interfaceC0571t;
        }
        N n7 = (N) interfaceC0571t;
        int i7 = n7.f9586q;
        N nC = n7.c(i7 == 0 ? 10 : i7 * 2);
        Z.o(obj, j3, nC);
        return nC;
    }
}
