package K5;

import F5.q;
import F5.x;
import S5.i;
import S5.y;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class g extends x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f4077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f4078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f4079q;

    public g(String str, long j3, y yVar) {
        this.f4077o = str;
        this.f4078p = j3;
        this.f4079q = yVar;
    }

    @Override // F5.x
    public final long b() {
        return this.f4078p;
    }

    @Override // F5.x
    public final q c() {
        String str = this.f4077o;
        if (str == null) {
            return null;
        }
        Pattern pattern = q.f2402b;
        try {
            return N5.d.E(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // F5.x
    public final i g() {
        return this.f4079q;
    }
}
