package d2;

import androidx.glance.appwidget.protobuf.AbstractC0554b;
import androidx.glance.appwidget.protobuf.AbstractC0568p;
import androidx.glance.appwidget.protobuf.AbstractC0572u;
import androidx.glance.appwidget.protobuf.C0569q;
import androidx.glance.appwidget.protobuf.InterfaceC0571t;
import androidx.glance.appwidget.protobuf.L;
import androidx.glance.appwidget.protobuf.N;
import androidx.glance.appwidget.protobuf.O;
import androidx.glance.appwidget.protobuf.r;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import w.AbstractC1676i;

/* JADX INFO: renamed from: d2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0821i extends r {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final C0821i DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile L PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private InterfaceC0571t children_ = N.f9584r;
    private boolean hasAction_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        C0821i c0821i = new C0821i();
        DEFAULT_INSTANCE = c0821i;
        r.i(C0821i.class, c0821i);
    }

    public static void k(C0821i c0821i, EnumC0822j enumC0822j) {
        c0821i.getClass();
        if (enumC0822j == EnumC0822j.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c0821i.type_ = enumC0822j.f11218o;
    }

    public static void l(C0821i c0821i, EnumC0814b enumC0814b) {
        c0821i.getClass();
        c0821i.width_ = enumC0814b.a();
    }

    public static void m(C0821i c0821i, EnumC0814b enumC0814b) {
        c0821i.getClass();
        c0821i.height_ = enumC0814b.a();
    }

    public static void n(C0821i c0821i, EnumC0815c enumC0815c) {
        c0821i.getClass();
        if (enumC0815c == EnumC0815c.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c0821i.horizontalAlignment_ = enumC0815c.f11206o;
    }

    public static void o(C0821i c0821i, EnumC0823k enumC0823k) {
        c0821i.getClass();
        if (enumC0823k == EnumC0823k.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c0821i.verticalAlignment_ = enumC0823k.f11224o;
    }

    public static void p(C0821i c0821i, EnumC0813a enumC0813a) {
        c0821i.getClass();
        if (enumC0813a == EnumC0813a.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c0821i.imageScale_ = enumC0813a.f11193o;
    }

    public static void q(C0821i c0821i) {
        c0821i.getClass();
        c0821i.identity_ = 1;
    }

    public static void r(C0821i c0821i, boolean z6) {
        c0821i.hasAction_ = z6;
    }

    public static void s(C0821i c0821i, ArrayList arrayList) {
        InterfaceC0571t interfaceC0571t = c0821i.children_;
        if (!((AbstractC0554b) interfaceC0571t).f9610o) {
            N n7 = (N) interfaceC0571t;
            int i7 = n7.f9586q;
            c0821i.children_ = n7.c(i7 == 0 ? 10 : i7 * 2);
        }
        RandomAccess randomAccess = c0821i.children_;
        Charset charset = AbstractC0572u.f9656a;
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(arrayList.size() + ((N) randomAccess).f9586q);
        }
        N n8 = (N) randomAccess;
        int i8 = n8.f9586q;
        for (Object obj : arrayList) {
            if (obj == null) {
                String str = "Element at index " + (n8.f9586q - i8) + " is null.";
                for (int i9 = n8.f9586q - 1; i9 >= i8; i9--) {
                    n8.remove(i9);
                }
                throw new NullPointerException(str);
            }
            n8.add(obj);
        }
    }

    public static void t(C0821i c0821i, boolean z6) {
        c0821i.hasImageDescription_ = z6;
    }

    public static void u(C0821i c0821i) {
        c0821i.hasImageColorFilter_ = false;
    }

    public static C0821i v() {
        return DEFAULT_INSTANCE;
    }

    public static C0820h w() {
        return (C0820h) ((AbstractC0568p) DEFAULT_INSTANCE.b(5));
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
                return new O(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", C0821i.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_"});
            case 3:
                return new C0821i();
            case 4:
                return new C0820h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L l = PARSER;
                if (l != null) {
                    return l;
                }
                synchronized (C0821i.class) {
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
}
