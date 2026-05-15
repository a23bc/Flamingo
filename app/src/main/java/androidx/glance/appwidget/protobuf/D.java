package androidx.glance.appwidget.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class D {
    public static C a(Object obj, Object obj2) {
        C cD = (C) obj;
        C c7 = (C) obj2;
        if (!c7.isEmpty()) {
            if (!cD.f9559o) {
                cD = cD.d();
            }
            cD.c();
            if (!c7.isEmpty()) {
                cD.putAll(c7);
            }
        }
        return cD;
    }
}
