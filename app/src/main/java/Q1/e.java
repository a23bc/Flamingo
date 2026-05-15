package Q1;

import A2.W;
import androidx.datastore.preferences.protobuf.AbstractC0546t;
import androidx.datastore.preferences.protobuf.C0534g;
import androidx.datastore.preferences.protobuf.C0535h;
import androidx.datastore.preferences.protobuf.C0539l;
import androidx.datastore.preferences.protobuf.C0545s;
import androidx.datastore.preferences.protobuf.C0550x;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.r;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0546t {
    private static final e DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f9396p;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0546t.h(e.class, eVar);
    }

    public static I i(e eVar) {
        I i7 = eVar.preferences_;
        if (!i7.f9397o) {
            eVar.preferences_ = i7.c();
        }
        return eVar.preferences_;
    }

    public static c k() {
        return (c) ((r) DEFAULT_INSTANCE.d(5));
    }

    public static e l(FileInputStream fileInputStream) throws C0550x {
        e eVar = DEFAULT_INSTANCE;
        C0534g c0534g = new C0534g(fileInputStream);
        C0539l c0539lA = C0539l.a();
        AbstractC0546t abstractC0546t = (AbstractC0546t) eVar.d(4);
        try {
            U u7 = U.f9421c;
            u7.getClass();
            X xA = u7.a(abstractC0546t.getClass());
            C0535h c0535h = c0534g.f9470b;
            if (c0535h == null) {
                c0535h = new C0535h(c0534g);
            }
            xA.h(abstractC0546t, c0535h, c0539lA);
            xA.a(abstractC0546t);
            if (abstractC0546t.g()) {
                return (e) abstractC0546t;
            }
            throw new C0550x(new W().getMessage());
        } catch (IOException e7) {
            if (e7.getCause() instanceof C0550x) {
                throw ((C0550x) e7.getCause());
            }
            throw new C0550x(e7.getMessage());
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof C0550x) {
                throw ((C0550x) e8.getCause());
            }
            throw e8;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0546t
    public final Object d(int i7) {
        S c0545s;
        switch (AbstractC1676i.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new androidx.datastore.preferences.protobuf.W(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f6106a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s7 = PARSER;
                if (s7 != null) {
                    return s7;
                }
                synchronized (e.class) {
                    try {
                        c0545s = PARSER;
                        if (c0545s == null) {
                            c0545s = new C0545s();
                            PARSER = c0545s;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0545s;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
