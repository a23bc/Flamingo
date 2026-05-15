package d2;

import O1.C0329a;
import O1.o;
import androidx.glance.appwidget.protobuf.B;
import androidx.glance.appwidget.protobuf.C0561i;
import androidx.glance.appwidget.protobuf.C0574w;
import androidx.glance.appwidget.protobuf.M;
import androidx.glance.appwidget.protobuf.P;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0824l implements O1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0824l f11225a = new C0824l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0817e f11226b;

    static {
        C0817e c0817eN = C0817e.n();
        AbstractC1209k.e(c0817eN, "getDefaultInstance()");
        f11226b = c0817eN;
    }

    @Override // O1.j
    public final Object a() {
        return f11226b;
    }

    @Override // O1.j
    public final void b(Object obj, o oVar) throws IOException {
        C0817e c0817e = (C0817e) obj;
        c0817e.getClass();
        int iA = c0817e.a(null);
        Logger logger = C0561i.h;
        if (iA > 4096) {
            iA = 4096;
        }
        C0561i c0561i = new C0561i(oVar, iA);
        c0817e.getClass();
        M m7 = M.f9581c;
        m7.getClass();
        P pA = m7.a(c0817e.getClass());
        B b7 = c0561i.f9637c;
        if (b7 == null) {
            b7 = new B(c0561i);
        }
        pA.g(c0817e, b7);
        if (c0561i.f9640f > 0) {
            c0561i.l0();
        }
    }

    @Override // O1.j
    public final Object c(FileInputStream fileInputStream) throws C0329a {
        try {
            return C0817e.q(fileInputStream);
        } catch (C0574w e7) {
            throw new C0329a("Cannot read proto.", e7);
        }
    }
}
