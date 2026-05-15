package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0544q f9390b = new C0544q(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9391a;

    public F(C0537j c0537j) {
        AbstractC0548v.a(c0537j, "output");
        this.f9391a = c0537j;
        c0537j.f9486c = this;
    }

    public void a(int i7, C0533f c0533f) throws IOException {
        ((C0537j) this.f9391a).G(i7, c0533f);
    }

    public void b(int i7, Object obj, X x6) throws IOException {
        C0537j c0537j = (C0537j) this.f9391a;
        c0537j.R(i7, 3);
        x6.d((AbstractC0528a) obj, c0537j.f9486c);
        c0537j.R(i7, 4);
    }

    public F() {
        L l;
        try {
            l = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            l = f9390b;
        }
        L[] lArr = {C0544q.f9515b, l};
        E e7 = new E();
        e7.f9389a = lArr;
        Charset charset = AbstractC0548v.f9521a;
        this.f9391a = e7;
    }
}
