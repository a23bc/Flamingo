package androidx.datastore.preferences.protobuf;

import d2.C0821i;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0542o {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f9499c = 0;

    /* JADX INFO: renamed from: a */
    public final Z f9500a = new Z(16);

    /* JADX INFO: renamed from: b */
    public boolean f9501b;

    static {
        new C0542o(0);
    }

    public C0542o() {
    }

    public static void b(C0537j c0537j, w0 w0Var, int i7, Object obj) throws IOException {
        if (w0Var == w0.f9524r) {
            c0537j.R(i7, 3);
            ((AbstractC0528a) obj).c(c0537j);
            c0537j.R(i7, 4);
        }
        c0537j.R(i7, w0Var.f9528p);
        switch (w0Var.ordinal()) {
            case 0:
                c0537j.L(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0537j.J(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0537j.V(((Long) obj).longValue());
                break;
            case 3:
                c0537j.V(((Long) obj).longValue());
                break;
            case 4:
                c0537j.N(((Integer) obj).intValue());
                break;
            case 5:
                c0537j.L(((Long) obj).longValue());
                break;
            case 6:
                c0537j.J(((Integer) obj).intValue());
                break;
            case 7:
                c0537j.D(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0533f)) {
                    c0537j.Q((String) obj);
                } else {
                    c0537j.H((C0533f) obj);
                }
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                ((AbstractC0528a) obj).c(c0537j);
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                AbstractC0528a abstractC0528a = (AbstractC0528a) obj;
                c0537j.getClass();
                c0537j.T(abstractC0528a.a());
                abstractC0528a.c(c0537j);
                break;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof C0533f)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0537j.T(length);
                    c0537j.E(bArr, 0, length);
                } else {
                    c0537j.H((C0533f) obj);
                }
                break;
            case 12:
                c0537j.T(((Integer) obj).intValue());
                break;
            case 13:
                c0537j.N(((Integer) obj).intValue());
                break;
            case 14:
                c0537j.J(((Integer) obj).intValue());
                break;
            case 15:
                c0537j.L(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0537j.T((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0537j.V((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f9501b) {
            return;
        }
        Z z6 = this.f9500a;
        if (!z6.f9439r) {
            if (z6.f9437p.size() > 0) {
                z6.d(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = z6.e().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!z6.f9439r) {
            z6.f9438q = z6.f9438q.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z6.f9438q);
            z6.f9441t = z6.f9441t.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z6.f9441t);
            z6.f9439r = true;
        }
        this.f9501b = true;
    }

    public final Object clone() {
        C0542o c0542o = new C0542o();
        Z z6 = this.f9500a;
        if (z6.f9437p.size() > 0) {
            Map.Entry entryD = z6.d(0);
            if (entryD.getKey() != null) {
                throw new ClassCastException();
            }
            entryD.getValue();
            throw null;
        }
        Iterator it = z6.e().iterator();
        if (!it.hasNext()) {
            return c0542o;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0542o) {
            return this.f9500a.equals(((C0542o) obj).f9500a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9500a.hashCode();
    }

    public C0542o(int i7) {
        a();
        a();
    }
}
