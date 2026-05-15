package F5;

import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC1210l f2380q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(InterfaceC1180a interfaceC1180a, int i7) {
        super(0);
        this.f2379p = i7;
        switch (i7) {
            case 1:
                this.f2380q = (AbstractC1210l) interfaceC1180a;
                super(0);
                break;
            default:
                this.f2380q = (AbstractC1210l) interfaceC1180a;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l5.a, m5.l] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l5.a, m5.l] */
    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f2379p) {
            case 0:
                try {
                    return (List) this.f2380q.a();
                } catch (SSLPeerUnverifiedException unused) {
                    return Z4.v.f8818o;
                }
            default:
                File file = (File) this.f2380q.a();
                AbstractC1209k.f(file, "<this>");
                String name = file.getName();
                AbstractC1209k.e(name, "getName(...)");
                if (AbstractC1545g.p0(name, '.', "").equals("preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
