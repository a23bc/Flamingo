package d2;

import androidx.glance.appwidget.protobuf.InterfaceC0570s;

/* JADX INFO: renamed from: d2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0814b implements InterfaceC0570s {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11200o;

    EnumC0814b(int i7) {
        this.f11200o = i7;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f11200o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
