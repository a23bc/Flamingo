package N4;

import A2.C0001b;
import H2.C0196m;
import K4.x;
import K4.y;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public final class c implements y {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f5168o;

    /* JADX INFO: renamed from: p */
    public final C0001b f5169p;

    public /* synthetic */ c(C0001b c0001b, int i7) {
        this.f5168o = i7;
        this.f5169p = c0001b;
    }

    public static x b(C0001b c0001b, C0196m c0196m, TypeToken typeToken, L4.a aVar) {
        x xVarA;
        Object objF = c0001b.h(TypeToken.get(aVar.value())).F();
        boolean zNullSafe = aVar.nullSafe();
        if (objF instanceof x) {
            xVarA = (x) objF;
        } else {
            if (!(objF instanceof y)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objF.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            xVarA = ((y) objF).a(c0196m, typeToken);
        }
        return (xVarA == null || !zNullSafe) ? xVarA : new K4.j(xVarA, 2);
    }

    @Override // K4.y
    public final x a(C0196m c0196m, TypeToken typeToken) {
        Class cls;
        Type[] actualTypeArguments;
        cls = Object.class;
        C0001b c0001b = this.f5169p;
        switch (this.f5168o) {
            case 0:
                Type type = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                M4.d.b(Collection.class.isAssignableFrom(rawType));
                Type typeI = M4.d.i(type, rawType, M4.d.f(type, rawType, Collection.class), new HashMap());
                cls = typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments()[0] : Object.class;
                return new b(c0196m, cls, c0196m.d(TypeToken.get(cls)), c0001b.h(typeToken));
            case 1:
                L4.a aVar = (L4.a) typeToken.getRawType().getAnnotation(L4.a.class);
                if (aVar == null) {
                    return null;
                }
                return b(c0001b, c0196m, typeToken, aVar);
            default:
                Type type2 = typeToken.getType();
                Class rawType2 = typeToken.getRawType();
                if (!Map.class.isAssignableFrom(rawType2)) {
                    return null;
                }
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    M4.d.b(Map.class.isAssignableFrom(rawType2));
                    Type typeI2 = M4.d.i(type2, rawType2, M4.d.f(type2, rawType2, Map.class), new HashMap());
                    actualTypeArguments = typeI2 instanceof ParameterizedType ? ((ParameterizedType) typeI2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                x xVarD = (type3 == Boolean.TYPE || type3 == Boolean.class) ? t.f5220c : c0196m.d(TypeToken.get(type3));
                x xVarD2 = c0196m.d(TypeToken.get(actualTypeArguments[1]));
                M4.o oVarH = c0001b.h(typeToken);
                Type[] typeArr = actualTypeArguments;
                return new g(this, c0196m, typeArr[0], xVarD, typeArr[1], xVarD2, oVarH);
        }
    }
}
