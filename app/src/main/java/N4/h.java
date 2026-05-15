package N4;

import H2.C0196m;
import K4.w;
import K4.x;
import K4.y;
import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class h implements y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5181p;

    public /* synthetic */ h(int i7, Object obj) {
        this.f5180o = i7;
        this.f5181p = obj;
    }

    @Override // K4.y
    public final x a(C0196m c0196m, TypeToken typeToken) {
        switch (this.f5180o) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (d) this.f5181p;
                }
                return null;
            case 1:
                if (typeToken.getRawType() == Object.class) {
                    return new i(c0196m, (w) this.f5181p);
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return (K4.i) this.f5181p;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f5180o) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((K4.i) this.f5181p) + "]";
            default:
                return super.toString();
        }
    }
}
