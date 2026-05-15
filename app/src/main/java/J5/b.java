package J5;

import b5.C0701a;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3747d;

    public b(List list) {
        AbstractC1209k.f(list, "connectionSpecs");
        this.f3744a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final F5.i a(SSLSocket sSLSocket) throws UnknownServiceException {
        F5.i iVar;
        int i7;
        boolean z6;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i8 = this.f3745b;
        List list = this.f3744a;
        int size = list.size();
        while (true) {
            if (i8 >= size) {
                iVar = null;
                break;
            }
            iVar = (F5.i) list.get(i8);
            if (iVar.b(sSLSocket)) {
                this.f3745b = i8 + 1;
                break;
            }
            i8++;
        }
        if (iVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f3747d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC1209k.c(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            AbstractC1209k.e(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i9 = this.f3745b;
        int size2 = list.size();
        while (true) {
            i7 = 0;
            if (i9 >= size2) {
                z6 = false;
                break;
            }
            if (((F5.i) list.get(i9)).b(sSLSocket)) {
                z6 = true;
                break;
            }
            i9++;
        }
        this.f3746c = z6;
        boolean z7 = this.f3747d;
        String[] strArr = iVar.f2366c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            AbstractC1209k.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = G5.b.n(enabledCipherSuites2, strArr, F5.g.f2341c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r62 = iVar.f2367d;
        if (r62 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            AbstractC1209k.e(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = G5.b.n(enabledProtocols3, r62, C0701a.f10401p);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC1209k.e(supportedCipherSuites, "supportedCipherSuites");
        F5.f fVar = F5.g.f2341c;
        byte[] bArr = G5.b.f2765a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (fVar.compare(supportedCipherSuites[i7], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i7++;
        }
        if (z7 && i7 != -1) {
            AbstractC1209k.e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i7];
            AbstractC1209k.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC1209k.e(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        F5.h hVar = new F5.h();
        hVar.f2358a = iVar.f2364a;
        hVar.f2360c = strArr;
        hVar.f2361d = r62;
        hVar.f2359b = iVar.f2365b;
        AbstractC1209k.e(enabledCipherSuites, "cipherSuitesIntersection");
        hVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        AbstractC1209k.e(enabledProtocols, "tlsVersionsIntersection");
        hVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        F5.i iVarA = hVar.a();
        if (iVarA.c() != null) {
            sSLSocket.setEnabledProtocols(iVarA.f2367d);
        }
        if (iVarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(iVarA.f2366c);
        }
        return iVar;
    }
}
