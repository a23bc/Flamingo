package d2;

import androidx.glance.appwidget.protobuf.AbstractC0568p;
import androidx.glance.appwidget.protobuf.C0569q;
import androidx.glance.appwidget.protobuf.L;
import androidx.glance.appwidget.protobuf.O;
import androidx.glance.appwidget.protobuf.r;
import w.AbstractC1676i;

/* JADX INFO: renamed from: d2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0819g extends r {
    private static final C0819g DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile L PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private C0821i layout_;

    static {
        C0819g c0819g = new C0819g();
        DEFAULT_INSTANCE = c0819g;
        r.i(C0819g.class, c0819g);
    }

    public static void k(C0819g c0819g, C0821i c0821i) {
        c0819g.getClass();
        c0821i.getClass();
        c0819g.layout_ = c0821i;
        c0819g.bitField0_ |= 1;
    }

    public static void l(C0819g c0819g, int i7) {
        c0819g.layoutIndex_ = i7;
    }

    public static C0818f o() {
        return (C0818f) ((AbstractC0568p) DEFAULT_INSTANCE.b(5));
    }

    @Override // androidx.glance.appwidget.protobuf.r
    public final Object b(int i7) {
        L c0569q;
        switch (AbstractC1676i.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new C0819g();
            case 4:
                return new C0818f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L l = PARSER;
                if (l != null) {
                    return l;
                }
                synchronized (C0819g.class) {
                    try {
                        c0569q = PARSER;
                        if (c0569q == null) {
                            c0569q = new C0569q();
                            PARSER = c0569q;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0569q;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final C0821i m() {
        C0821i c0821i = this.layout_;
        return c0821i == null ? C0821i.v() : c0821i;
    }

    public final int n() {
        return this.layoutIndex_;
    }
}
