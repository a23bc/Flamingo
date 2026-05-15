package B5;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import x5.C1944b;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f886a;

    static {
        try {
            f886a = t5.j.J(t5.j.G(Arrays.asList(new C1944b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
