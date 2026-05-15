package C1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f950e;

    public /* synthetic */ g(String str, Context context, Object obj, int i7, int i8) {
        this.f946a = i8;
        this.f947b = str;
        this.f948c = context;
        this.f950e = obj;
        this.f949d = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i7 = this.f949d;
        Object obj = this.f950e;
        Context context = this.f948c;
        String str = this.f947b;
        switch (this.f946a) {
            case 0:
                Object[] objArr = {(f) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return j.b(str, context, Collections.unmodifiableList(arrayList), i7);
            default:
                try {
                    return j.b(str, context, (List) obj, i7);
                } catch (Throwable unused) {
                    return new i(-3);
                }
        }
    }
}
