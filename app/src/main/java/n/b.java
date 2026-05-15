package N;

import F.g;
import P.d;
import Y4.o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import b1.L;
import java.util.List;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f4955a = new g(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4956b = new a();

    public static final void a(O.a aVar, final Context context, final boolean z6, final CharSequence charSequence, final long j3) {
        if (L.c(j3) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) f4955a.b(context);
        if (list.isEmpty()) {
            return;
        }
        aVar.a();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i7);
            aVar.f5273a.a(new d(new P.a(i7), resolveInfo.loadLabel(packageManager).toString(), 0, new InterfaceC1182c() { // from class: N.c
                @Override // l5.InterfaceC1182c
                public final Object b(Object obj) {
                    a aVar2 = b.f4956b;
                    Boolean boolValueOf = Boolean.valueOf(z6);
                    L l = new L(j3);
                    aVar2.g(context, resolveInfo, boolValueOf, charSequence, l);
                    ((P.g) obj).close();
                    return o.f8736a;
                }
            }));
        }
        aVar.a();
    }
}
