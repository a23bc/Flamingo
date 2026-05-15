package d2;

import androidx.datastore.preferences.protobuf.C0535h;
import androidx.glance.appwidget.protobuf.AbstractC0554b;
import androidx.glance.appwidget.protobuf.C0560h;
import androidx.glance.appwidget.protobuf.C0563k;
import androidx.glance.appwidget.protobuf.C0569q;
import androidx.glance.appwidget.protobuf.C0574w;
import androidx.glance.appwidget.protobuf.InterfaceC0571t;
import androidx.glance.appwidget.protobuf.L;
import androidx.glance.appwidget.protobuf.M;
import androidx.glance.appwidget.protobuf.N;
import androidx.glance.appwidget.protobuf.O;
import androidx.glance.appwidget.protobuf.P;
import androidx.glance.appwidget.protobuf.S;
import androidx.glance.appwidget.protobuf.r;
import java.io.FileInputStream;
import java.io.IOException;
import w.AbstractC1676i;

/* JADX INFO: renamed from: d2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0817e extends r {
    private static final C0817e DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile L PARSER;
    private InterfaceC0571t layout_ = N.f9584r;
    private int nextIndex_;

    static {
        C0817e c0817e = new C0817e();
        DEFAULT_INSTANCE = c0817e;
        r.i(C0817e.class, c0817e);
    }

    public static void k(C0817e c0817e, C0819g c0819g) {
        c0817e.getClass();
        InterfaceC0571t interfaceC0571t = c0817e.layout_;
        if (!((AbstractC0554b) interfaceC0571t).f9610o) {
            N n7 = (N) interfaceC0571t;
            int i7 = n7.f9586q;
            c0817e.layout_ = n7.c(i7 == 0 ? 10 : i7 * 2);
        }
        ((N) c0817e.layout_).add(c0819g);
    }

    public static void l(C0817e c0817e) {
        c0817e.getClass();
        c0817e.layout_ = N.f9584r;
    }

    public static void m(C0817e c0817e, int i7) {
        c0817e.nextIndex_ = i7;
    }

    public static C0817e n() {
        return DEFAULT_INSTANCE;
    }

    public static C0817e q(FileInputStream fileInputStream) throws C0574w {
        C0817e c0817e = DEFAULT_INSTANCE;
        C0560h c0560h = new C0560h(fileInputStream);
        C0563k c0563kA = C0563k.a();
        r rVarH = c0817e.h();
        try {
            M m7 = M.f9581c;
            m7.getClass();
            P pA = m7.a(rVarH.getClass());
            C0535h c0535h = (C0535h) c0560h.f2654p;
            if (c0535h == null) {
                c0535h = new C0535h(c0560h);
            }
            pA.f(rVarH, c0535h, c0563kA);
            pA.a(rVarH);
            if (r.e(rVarH, true)) {
                return (C0817e) rVarH;
            }
            throw new C0574w(new S().getMessage());
        } catch (S e7) {
            throw new C0574w(e7.getMessage());
        } catch (C0574w e8) {
            if (e8.f9658o) {
                throw new C0574w(e8.getMessage(), e8);
            }
            throw e8;
        } catch (IOException e9) {
            if (e9.getCause() instanceof C0574w) {
                throw ((C0574w) e9.getCause());
            }
            throw new C0574w(e9.getMessage(), e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C0574w) {
                throw ((C0574w) e10.getCause());
            }
            throw e10;
        }
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
                return new O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", C0819g.class, "nextIndex_"});
            case 3:
                return new C0817e();
            case 4:
                return new C0816d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                L l = PARSER;
                if (l != null) {
                    return l;
                }
                synchronized (C0817e.class) {
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

    public final InterfaceC0571t o() {
        return this.layout_;
    }

    public final int p() {
        return this.nextIndex_;
    }
}
