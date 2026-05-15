package q0;

import Z4.A;
import a5.C0522b;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: q0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1355d extends RuntimeException {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f15443o;

    public C1355d(List list) {
        this.f15443o = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        C0522b c0522b = new C0522b(10);
        List list = this.f15443o;
        AbstractC1209k.f(list, "<this>");
        A a4 = new A(list);
        if (a4.b() > 0) {
            ((C1352a) a4.get(0)).getClass();
            throw null;
        }
        c0522b.n();
        c0522b.f8858q = true;
        if (c0522b.f8857p <= 0) {
            c0522b = C0522b.f8855r;
        }
        AbstractC1209k.f(c0522b, "<this>");
        A a7 = new A(c0522b);
        int iB = a7.b();
        for (int i7 = 0; i7 < iB; i7++) {
            sb.append("\tat " + ((String) a7.get(i7)));
            sb.append('\n');
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }
}
