package N4;

import H2.C0196m;
import K4.x;
import K4.y;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class p implements y {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f5209o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f5210p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ x f5211q;

    public /* synthetic */ p(Object obj, x xVar, int i7) {
        this.f5209o = i7;
        this.f5210p = obj;
        this.f5211q = xVar;
    }

    @Override // K4.y
    public final x a(C0196m c0196m, TypeToken typeToken) {
        switch (this.f5209o) {
            case 0:
                if (typeToken.getRawType() == ((Class) this.f5210p)) {
                    return this.f5211q;
                }
                return null;
            case 1:
                Class<?> rawType = typeToken.getRawType();
                if (((Class) this.f5210p).isAssignableFrom(rawType)) {
                    return new b(this, rawType);
                }
                return null;
            default:
                if (typeToken.equals((TypeToken) this.f5210p)) {
                    return this.f5211q;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f5209o) {
            case 0:
                return "Factory[type=" + ((Class) this.f5210p).getName() + ",adapter=" + this.f5211q + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f5210p).getName() + ",adapter=" + this.f5211q + "]";
            default:
                return super.toString();
        }
    }
}
