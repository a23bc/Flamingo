package x3;

import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: renamed from: x3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1931p implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final String f20092a;

    /* JADX INFO: renamed from: b */
    public final int f20093b;

    /* JADX INFO: renamed from: c */
    public final int f20094c;

    /* JADX INFO: renamed from: d */
    public final f0 f20095d;

    /* JADX INFO: renamed from: e */
    public final k.I f20096e;

    /* JADX INFO: renamed from: f */
    public final HashMap f20097f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractServiceC1940y f20098g;

    public C1931p(AbstractServiceC1940y abstractServiceC1940y, String str, int i7, int i8, k.I i9) {
        this.f20098g = abstractServiceC1940y;
        this.f20092a = str;
        this.f20093b = i7;
        this.f20094c = i8;
        this.f20095d = new f0(str, i7, i8);
        this.f20096e = i9;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f20098g.f20130u.post(new B3.c(13, this));
    }
}
