package G2;

import N5.d;
import a3.C0518a;
import b3.C0692h;
import d3.C0827c;
import t2.C1487p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2746a = new a();

    public final d a(C1487p c1487p) {
        String str = c1487p.f16701m;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new X2.b(0);
                case "application/x-icy":
                    return new C0518a();
                case "application/id3":
                    return new C0692h(null);
                case "application/x-emsg":
                    return new X2.b(1);
                case "application/x-scte35":
                    return new C0827c();
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }

    public final boolean b(C1487p c1487p) {
        String str = c1487p.f16701m;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
