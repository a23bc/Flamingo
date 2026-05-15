package N4;

import A2.W;
import a.AbstractC0509a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f5197e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f5198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f5199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f5200d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f5197e = map;
    }

    public m(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f5200d = new HashMap();
        AbstractC0509a abstractC0509a = P4.c.f5763a;
        Constructor constructorY = abstractC0509a.y(cls);
        this.f5198b = constructorY;
        P4.c.e(constructorY);
        String[] strArrG = abstractC0509a.G(cls);
        for (int i7 = 0; i7 < strArrG.length; i7++) {
            this.f5200d.put(strArrG[i7], Integer.valueOf(i7));
        }
        Class<?>[] parameterTypes = this.f5198b.getParameterTypes();
        this.f5199c = new Object[parameterTypes.length];
        for (int i8 = 0; i8 < parameterTypes.length; i8++) {
            this.f5199c[i8] = f5197e.get(parameterTypes[i8]);
        }
    }

    @Override // N4.k
    public final Object c() {
        return (Object[]) this.f5199c.clone();
    }

    @Override // N4.k
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f5198b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e7) {
            AbstractC0509a abstractC0509a = P4.c.f5763a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (IllegalArgumentException e8) {
            e = e8;
            throw new RuntimeException("Failed to invoke constructor '" + P4.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e9) {
            e = e9;
            throw new RuntimeException("Failed to invoke constructor '" + P4.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + P4.c.b(constructor) + "' with args " + Arrays.toString(objArr), e10.getCause());
        }
    }

    @Override // N4.k
    public final void e(Object obj, R4.a aVar, j jVar) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f5200d;
        String str = jVar.f5187c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + P4.c.b(this.f5198b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objA = jVar.h.a(aVar);
        if (objA != null || !jVar.f5194k) {
            objArr[iIntValue] = objA;
        } else {
            StringBuilder sbU = Z1.l.u("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbU.append(aVar.n(false));
            throw new W(sbU.toString());
        }
    }
}
