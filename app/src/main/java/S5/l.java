package S5;

import java.io.FileNotFoundException;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f6793a;

    static {
        r rVar;
        try {
            Class.forName("java.nio.file.Files");
            rVar = new s();
        } catch (ClassNotFoundException unused) {
            rVar = new r();
        }
        f6793a = rVar;
        String str = u.f6810p;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC1209k.e(property, "getProperty(...)");
        N2.z.n(property);
        ClassLoader classLoader = T5.e.class.getClassLoader();
        AbstractC1209k.e(classLoader, "getClassLoader(...)");
        new T5.e(classLoader);
    }

    public abstract void a(u uVar);

    public final void b(u uVar) {
        AbstractC1209k.f(uVar, "path");
        a(uVar);
    }

    public final boolean c(u uVar) {
        AbstractC1209k.f(uVar, "path");
        return f(uVar) != null;
    }

    public abstract List d(u uVar);

    public final B3.a e(u uVar) throws FileNotFoundException {
        AbstractC1209k.f(uVar, "path");
        B3.a aVarF = f(uVar);
        if (aVarF != null) {
            return aVarF;
        }
        throw new FileNotFoundException("no such file: " + uVar);
    }

    public abstract B3.a f(u uVar);

    public abstract q g(u uVar);

    public abstract C h(u uVar);

    public abstract E i(u uVar);
}
