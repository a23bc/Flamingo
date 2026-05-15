package u1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Iterable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f17198o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f17199p;

    public v(Context context) {
        this.f17199p = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f17199p;
        ArrayList arrayList = this.f17198o;
        int size = arrayList.size();
        try {
            for (Intent intentA = d.a(context, componentName); intentA != null; intentA = d.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f17198o;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f17199p.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f17198o.iterator();
    }
}
