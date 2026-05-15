package u1;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d */
    public static String f17191d;

    /* JADX INFO: renamed from: g */
    public static q f17194g;

    /* JADX INFO: renamed from: a */
    public final Context f17195a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f17196b;

    /* JADX INFO: renamed from: c */
    public static final Object f17190c = new Object();

    /* JADX INFO: renamed from: e */
    public static HashSet f17192e = new HashSet();

    /* JADX INFO: renamed from: f */
    public static final Object f17193f = new Object();

    public r(Context context) {
        this.f17195a = context;
        this.f17196b = (NotificationManager) context.getSystemService("notification");
    }
}
