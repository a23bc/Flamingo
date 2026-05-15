package R3;

import N3.p;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6665b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f6666a;

    static {
        p.i("SystemJobInfoConverter");
    }

    public a(Context context) {
        this.f6666a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
