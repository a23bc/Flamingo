package M4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public final class e implements o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Type f4782p;

    public /* synthetic */ e(Type type, int i7) {
        this.f4781o = i7;
        this.f4782p = type;
    }

    @Override // M4.o
    public final Object F() {
        switch (this.f4781o) {
            case 0:
                Type type = this.f4782p;
                if (!(type instanceof ParameterizedType)) {
                    throw new K4.o("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new K4.o("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.f4782p;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new K4.o("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new K4.o("Invalid EnumMap type: " + type3.toString());
        }
    }
}
