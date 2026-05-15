package F5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a */
    public boolean f2358a = true;

    /* JADX INFO: renamed from: b */
    public boolean f2359b;

    /* JADX INFO: renamed from: c */
    public Object f2360c;

    /* JADX INFO: renamed from: d */
    public Serializable f2361d;

    public i a() {
        return new i(this.f2358a, this.f2359b, (String[]) this.f2360c, (String[]) this.f2361d);
    }

    public void b(g... gVarArr) {
        AbstractC1209k.f(gVarArr, "cipherSuites");
        if (!this.f2358a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(gVarArr.length);
        for (g gVar : gVarArr) {
            arrayList.add(gVar.f2357a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        AbstractC1209k.f(strArr, "cipherSuites");
        if (!this.f2358a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2360c = (String[]) strArr.clone();
    }

    public void d(z... zVarArr) {
        if (!this.f2358a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(zVarArr.length);
        for (z zVar : zVarArr) {
            arrayList.add(zVar.f2482o);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        AbstractC1209k.f(strArr, "tlsVersions");
        if (!this.f2358a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f2361d = (String[]) strArr.clone();
    }
}
