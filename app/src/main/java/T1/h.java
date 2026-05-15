package T1;

import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6855o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f6857q;

    public h(SystemForegroundService systemForegroundService, int i7) {
        this.f6857q = systemForegroundService;
        this.f6856p = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6855o) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f6857q;
                int size = arrayList.size();
                int i7 = 0;
                if (this.f6856p == 1) {
                    while (i7 < size) {
                        ((g) arrayList.get(i7)).b();
                        i7++;
                    }
                } else {
                    while (i7 < size) {
                        ((g) arrayList.get(i7)).a();
                        i7++;
                    }
                }
                break;
            default:
                ((SystemForegroundService) this.f6857q).f9866s.cancel(this.f6856p);
                break;
        }
    }

    public h(List list, int i7, Throwable th) {
        N5.d.r(list, "initCallbacks cannot be null");
        this.f6857q = new ArrayList(list);
        this.f6856p = i7;
    }
}
