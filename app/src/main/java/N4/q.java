package N4;

import H2.C0196m;
import K4.x;
import K4.y;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class q implements y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Class f5212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Class f5213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f5214q;

    public q(Class cls, Class cls2, x xVar) {
        this.f5212o = cls;
        this.f5213p = cls2;
        this.f5214q = xVar;
    }

    @Override // K4.y
    public final x a(C0196m c0196m, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (rawType == this.f5212o || rawType == this.f5213p) {
            return this.f5214q;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f5213p.getName() + "+" + this.f5212o.getName() + ",adapter=" + this.f5214q + "]";
    }
}
