package M4;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: o */
    public final Type f4774o;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f4774o = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f4774o;
    }

    public final int hashCode() {
        return this.f4774o.hashCode();
    }

    public final String toString() {
        return d.j(this.f4774o) + "[]";
    }
}
