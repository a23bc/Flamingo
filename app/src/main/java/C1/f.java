package C1;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f945e;

    public f(String str, String str2, String str3, List list) {
        str.getClass();
        this.f941a = str;
        str2.getClass();
        this.f942b = str2;
        this.f943c = str3;
        list.getClass();
        this.f944d = list;
        this.f945e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f941a + ", mProviderPackage: " + this.f942b + ", mQuery: " + this.f943c + ", mCertificates:");
        int i7 = 0;
        while (true) {
            List list = this.f944d;
            if (i7 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i7);
            for (int i8 = 0; i8 < list2.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i8), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i7++;
        }
    }
}
