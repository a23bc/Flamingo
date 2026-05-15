package N4;

import K4.x;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class r extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5215a;

    public /* synthetic */ r(int i7) {
        this.f5215a = i7;
    }

    @Override // K4.x
    public final Object a(R4.a aVar) {
        switch (this.f5215a) {
            case 0:
                return new AtomicBoolean(aVar.s());
            default:
                AbstractC1209k.f(aVar, "in");
                String strC = aVar.C();
                AbstractC1209k.e(strC, "nextString(...)");
                return Uri.parse(strC);
        }
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) throws IOException {
        switch (this.f5215a) {
            case 0:
                bVar.y(((AtomicBoolean) obj).get());
                break;
            default:
                AbstractC1209k.f(bVar, "out");
                bVar.w(String.valueOf((Uri) obj));
                break;
        }
    }
}
