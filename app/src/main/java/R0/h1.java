package R0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import f0.AbstractC0918w;
import java.util.LinkedHashMap;
import o5.AbstractC1267a;
import w5.AbstractC1767D;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f6463a = new LinkedHashMap();

    public static final z5.H a(Context context) {
        z5.H h;
        LinkedHashMap linkedHashMap = f6463a;
        synchronized (linkedHashMap) {
            try {
                Object objJ = linkedHashMap.get(context);
                if (objJ == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    y5.c cVarA = y5.j.a(-1, 6, null);
                    z3.t tVar = new z3.t(new f1(contentResolver, uriFor, new g1(cVarA, AbstractC1267a.r(Looper.getMainLooper())), cVarA, context, null));
                    w5.y0 y0VarC = AbstractC1767D.c();
                    D5.e eVar = w5.M.f19497a;
                    objJ = z5.z.j(tVar, new B5.d(I0.c.L(y0VarC, B5.n.f912a)), new z5.G(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objJ);
                }
                h = (z5.H) objJ;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public static final AbstractC0918w b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0918w) {
            return (AbstractC0918w) tag;
        }
        return null;
    }
}
