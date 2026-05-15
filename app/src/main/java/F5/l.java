package F5;

import a.AbstractC0509a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a */
    public final z f2381a;

    /* JADX INFO: renamed from: b */
    public final g f2382b;

    /* JADX INFO: renamed from: c */
    public final List f2383c;

    /* JADX INFO: renamed from: d */
    public final Y4.m f2384d;

    public l(z zVar, g gVar, List list, InterfaceC1180a interfaceC1180a) {
        this.f2381a = zVar;
        this.f2382b = gVar;
        this.f2383c = list;
        this.f2384d = AbstractC0509a.O(new k(interfaceC1180a, 0));
    }

    public final List a() {
        return (List) this.f2384d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f2381a == this.f2381a && AbstractC1209k.a(lVar.f2382b, this.f2382b) && AbstractC1209k.a(lVar.a(), a()) && AbstractC1209k.a(lVar.f2383c, this.f2383c);
    }

    public final int hashCode() {
        return this.f2383c.hashCode() + ((a().hashCode() + ((this.f2382b.hashCode() + ((this.f2381a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(Z4.p.j0(listA));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC1209k.e(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f2381a);
        sb.append(" cipherSuite=");
        sb.append(this.f2382b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f2383c;
        ArrayList arrayList2 = new ArrayList(Z4.p.j0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC1209k.e(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
