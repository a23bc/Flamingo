package M4;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: o */
    public final Type f4775o;

    /* JADX INFO: renamed from: p */
    public final Type f4776p;

    /* JADX INFO: renamed from: q */
    public final Type[] f4777q;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z6 = true;
            boolean z7 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z7) {
                z6 = false;
            }
            d.b(z6);
        }
        this.f4775o = type == null ? null : d.a(type);
        this.f4776p = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f4777q = typeArr2;
        int length = typeArr2.length;
        for (int i7 = 0; i7 < length; i7++) {
            Objects.requireNonNull(this.f4777q[i7]);
            d.c(this.f4777q[i7]);
            Type[] typeArr3 = this.f4777q;
            typeArr3[i7] = d.a(typeArr3[i7]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f4777q.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f4775o;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f4776p;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f4777q) ^ this.f4776p.hashCode();
        Type type = this.f4775o;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f4777q;
        int length = typeArr.length;
        Type type = this.f4776p;
        if (length == 0) {
            return d.j(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.j(type));
        sb.append("<");
        sb.append(d.j(typeArr[0]));
        for (int i7 = 1; i7 < length; i7++) {
            sb.append(", ");
            sb.append(d.j(typeArr[i7]));
        }
        sb.append(">");
        return sb.toString();
    }
}
