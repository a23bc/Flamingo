package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: b */
    public static final C0567o f9556b = new C0567o(1);

    /* JADX INFO: renamed from: a */
    public final Object f9557a;

    public B(C0561i c0561i) {
        Charset charset = AbstractC0572u.f9656a;
        this.f9557a = c0561i;
        c0561i.f9637c = this;
    }

    public void a(int i7, Object obj, P p7) {
        C0561i c0561i = (C0561i) this.f9557a;
        c0561i.y0(i7, 3);
        p7.g((AbstractC0553a) obj, c0561i.f9637c);
        c0561i.y0(i7, 4);
    }

    public B() {
        M m7 = M.f9581c;
        F f7 = f9556b;
        try {
            f7 = (F) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        F[] fArr = {C0567o.f9652b, f7};
        A a4 = new A();
        a4.f9555a = fArr;
        Charset charset = AbstractC0572u.f9656a;
        this.f9557a = a4;
    }
}
