package N4;

import H2.C0196m;
import K4.x;
import K4.y;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class a implements y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5163o;

    public /* synthetic */ a(int i7) {
        this.f5163o = i7;
    }

    @Override // K4.y
    public final x a(C0196m c0196m, TypeToken typeToken) {
        switch (this.f5163o) {
            case 0:
                Type type = typeToken.getType();
                boolean z6 = type instanceof GenericArrayType;
                if (!z6 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z6 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new b(c0196m, c0196m.d(TypeToken.get(genericComponentType)), M4.d.g(genericComponentType));
            case 1:
                if (typeToken.getRawType() == Date.class) {
                    return new d();
                }
                return null;
            case 2:
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new o(rawType);
            case 3:
                if (typeToken.getRawType() == java.sql.Date.class) {
                    return new Q4.a(0);
                }
                return null;
            case 4:
                if (typeToken.getRawType() == Time.class) {
                    return new Q4.a(1);
                }
                return null;
            default:
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                c0196m.getClass();
                return new Q4.a(c0196m.d(TypeToken.get(Date.class)));
        }
    }
}
